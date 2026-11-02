package androidx.core.app;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class JobIntentService extends Service {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap<ComponentName, f> f1872f = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f1873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f1874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f1875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1876d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<c> f1877e;

    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) {
            c cVarRemove;
            while (true) {
                JobIntentService jobIntentService = JobIntentService.this;
                e eVar = jobIntentService.f1873a;
                if (eVar != null) {
                    synchronized (eVar.f1886b) {
                        try {
                            JobParameters jobParameters = eVar.f1887c;
                            if (jobParameters != null) {
                                JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                                if (jobWorkItemDequeueWork != null) {
                                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(eVar.f1885a.getClassLoader());
                                    cVarRemove = eVar.new a(jobWorkItemDequeueWork);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    synchronized (jobIntentService.f1877e) {
                        try {
                            cVarRemove = jobIntentService.f1877e.size() > 0 ? jobIntentService.f1877e.remove(0) : null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                if (cVarRemove == null) {
                    return null;
                }
                JobIntentService jobIntentService2 = JobIntentService.this;
                cVarRemove.getIntent();
                jobIntentService2.b();
                cVarRemove.a();
            }
        }

        @Override // android.os.AsyncTask
        public final void onCancelled(Void r10) {
            JobIntentService.this.c();
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r10) {
            JobIntentService.this.c();
        }
    }

    public static final class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PowerManager.WakeLock f1879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PowerManager.WakeLock f1880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1881c;

        public b(JobIntentService jobIntentService, ComponentName componentName) {
            jobIntentService.getApplicationContext();
            PowerManager powerManager = (PowerManager) jobIntentService.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f1879a = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f1880b = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.f
        public final void a() {
            synchronized (this) {
                try {
                    if (this.f1881c) {
                        this.f1881c = false;
                        this.f1880b.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.f
        public final void b() {
            synchronized (this) {
                try {
                    if (!this.f1881c) {
                        this.f1881c = true;
                        this.f1880b.acquire(600000L);
                        this.f1879a.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.f
        public final void c() {
            synchronized (this) {
            }
        }
    }

    public final class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f1882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1883b;

        public c(Intent intent, int i10) {
            this.f1882a = intent;
            this.f1883b = i10;
        }

        @Override // androidx.core.app.JobIntentService.d
        public final void a() {
            JobIntentService.this.stopSelf(this.f1883b);
        }

        @Override // androidx.core.app.JobIntentService.d
        public final Intent getIntent() {
            return this.f1882a;
        }
    }

    public interface d {
        void a();

        Intent getIntent();
    }

    public static final class e extends JobServiceEngine {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JobIntentService f1885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f1886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public JobParameters f1887c;

        public final class a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final JobWorkItem f1888a;

            public a(JobWorkItem jobWorkItem) {
                this.f1888a = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.d
            public final void a() {
                synchronized (e.this.f1886b) {
                    try {
                        JobParameters jobParameters = e.this.f1887c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f1888a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.d
            public final Intent getIntent() {
                return this.f1888a.getIntent();
            }
        }

        public e(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f1886b = new Object();
            this.f1885a = jobIntentService;
        }

        public final boolean onStartJob(JobParameters jobParameters) {
            this.f1887c = jobParameters;
            this.f1885a.a(false);
            return true;
        }

        public final boolean onStopJob(JobParameters jobParameters) {
            a aVar = this.f1885a.f1875c;
            if (aVar != null) {
                aVar.cancel(false);
            }
            synchronized (this.f1886b) {
                this.f1887c = null;
            }
            return true;
        }
    }

    public static abstract class f {
        public void a() {
        }

        public void b() {
        }

        public void c() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1877e = null;
        } else {
            this.f1877e = new ArrayList<>();
        }
    }

    public final void a(boolean z10) {
        if (this.f1875c == null) {
            this.f1875c = new a();
            f fVar = this.f1874b;
            if (fVar != null && z10) {
                fVar.b();
            }
            this.f1875c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public abstract void b();

    public final void c() {
        ArrayList<c> arrayList = this.f1877e;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f1875c = null;
                    ArrayList<c> arrayList2 = this.f1877e;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        a(false);
                    } else if (!this.f1876d) {
                        this.f1874b.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        e eVar = this.f1873a;
        if (eVar != null) {
            return eVar.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            this.f1873a = new e(this);
            this.f1874b = null;
            return;
        }
        this.f1873a = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap<ComponentName, f> map = f1872f;
        f bVar = map.get(componentName);
        if (bVar == null) {
            if (i10 >= 26) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            bVar = new b(this, componentName);
            map.put(componentName, bVar);
        }
        this.f1874b = bVar;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ArrayList<c> arrayList = this.f1877e;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f1876d = true;
                this.f1874b.a();
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        if (this.f1877e == null) {
            return 2;
        }
        this.f1874b.c();
        synchronized (this.f1877e) {
            ArrayList<c> arrayList = this.f1877e;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new c(intent, i11));
            a(true);
        }
        return 3;
    }
}
