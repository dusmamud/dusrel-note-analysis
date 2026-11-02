package e2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f25681b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f25682a;

    public static final class a implements h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Message f25683a;

        public final void a() {
            this.f25683a = null;
            ArrayList arrayList = v.f25681b;
            synchronized (arrayList) {
                try {
                    if (arrayList.size() < 50) {
                        arrayList.add(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            Message message = this.f25683a;
            message.getClass();
            message.sendToTarget();
            a();
        }
    }

    public v(Handler handler) {
        this.f25682a = handler;
    }

    public static a m() {
        a aVar;
        ArrayList arrayList = f25681b;
        synchronized (arrayList) {
            try {
                aVar = arrayList.isEmpty() ? new a() : (a) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // e2.h
    public final boolean a() {
        return this.f25682a.hasMessages(1);
    }

    @Override // e2.h
    public final a b(int i10, int i11, int i12) {
        a aVarM = m();
        aVarM.f25683a = this.f25682a.obtainMessage(i10, i11, i12);
        return aVarM;
    }

    @Override // e2.h
    public final a c(Object obj, int i10, int i11, int i12) {
        a aVarM = m();
        aVarM.f25683a = this.f25682a.obtainMessage(i10, i11, i12, obj);
        return aVarM;
    }

    @Override // e2.h
    public final boolean d(h.a aVar) {
        a aVar2 = (a) aVar;
        Message message = aVar2.f25683a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = this.f25682a.sendMessageAtFrontOfQueue(message);
        aVar2.a();
        return zSendMessageAtFrontOfQueue;
    }

    @Override // e2.h
    public final boolean e(Runnable runnable) {
        return this.f25682a.post(runnable);
    }

    @Override // e2.h
    public final a f(int i10) {
        a aVarM = m();
        aVarM.f25683a = this.f25682a.obtainMessage(i10);
        return aVarM;
    }

    @Override // e2.h
    public final void g() {
        this.f25682a.removeCallbacksAndMessages(null);
    }

    @Override // e2.h
    public final boolean h(long j10) {
        return this.f25682a.sendEmptyMessageAtTime(2, j10);
    }

    @Override // e2.h
    public final boolean i(int i10) {
        return this.f25682a.sendEmptyMessage(i10);
    }

    @Override // e2.h
    public final void j(int i10) {
        cd.k.a(i10 != 0);
        this.f25682a.removeMessages(i10);
    }

    @Override // e2.h
    public final a k(int i10, Object obj) {
        a aVarM = m();
        aVarM.f25683a = this.f25682a.obtainMessage(i10, obj);
        return aVarM;
    }

    @Override // e2.h
    public final Looper l() {
        return this.f25682a.getLooper();
    }
}
