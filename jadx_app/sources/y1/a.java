package y1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f36781f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static a f36782g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f36783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f36784b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, ArrayList<c>> f36785c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<b> f36786d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HandlerC0299a f36787e;

    /* JADX INFO: renamed from: y1.a$a, reason: collision with other inner class name */
    public class HandlerC0299a extends Handler {
        public HandlerC0299a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int size;
            b[] bVarArr;
            if (message.what != 1) {
                super.handleMessage(message);
                return;
            }
            a aVar = a.this;
            while (true) {
                synchronized (aVar.f36784b) {
                    try {
                        size = aVar.f36786d.size();
                        if (size <= 0) {
                            return;
                        }
                        bVarArr = new b[size];
                        aVar.f36786d.toArray(bVarArr);
                        aVar.f36786d.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                for (int i10 = 0; i10 < size; i10++) {
                    b bVar = bVarArr[i10];
                    int size2 = bVar.f36790b.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        c cVar = bVar.f36790b.get(i11);
                        if (!cVar.f36794d) {
                            cVar.f36792b.onReceive(aVar.f36783a, bVar.f36789a);
                        }
                    }
                }
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f36789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<c> f36790b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f36789a = intent;
            this.f36790b = arrayList;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IntentFilter f36791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BroadcastReceiver f36792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f36793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f36794d;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f36791a = intentFilter;
            this.f36792b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f36792b);
            sb2.append(" filter=");
            sb2.append(this.f36791a);
            if (this.f36794d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    public a(Context context) {
        this.f36783a = context;
        this.f36787e = new HandlerC0299a(context.getMainLooper());
    }

    public static a a(Context context) {
        a aVar;
        synchronized (f36781f) {
            try {
                if (f36782g == null) {
                    f36782g = new a(context.getApplicationContext());
                }
                aVar = f36782g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final boolean b(Intent intent) {
        String str;
        synchronized (this.f36784b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f36783a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z10 = (intent.getFlags() & 8) != 0;
                if (z10) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<c> arrayList = this.f36785c.get(intent.getAction());
                if (arrayList != null) {
                    if (z10) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    ArrayList arrayList2 = null;
                    int i10 = 0;
                    while (i10 < arrayList.size()) {
                        c cVar = arrayList.get(i10);
                        if (z10) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f36791a);
                        }
                        if (cVar.f36793c) {
                            if (z10) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList;
                        } else {
                            int iMatch = cVar.f36791a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z10) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(cVar);
                                cVar.f36793c = true;
                            } else {
                                arrayList = arrayList;
                                if (z10) {
                                    if (iMatch == -4) {
                                        str = "category";
                                    } else if (iMatch == -3) {
                                        str = "action";
                                    } else if (iMatch != -2) {
                                        str = iMatch != -1 ? "unknown reason" : "type";
                                    } else {
                                        str = "data";
                                    }
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + str);
                                }
                            }
                        }
                        i10++;
                        arrayList = arrayList;
                    }
                    if (arrayList2 != null) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            ((c) arrayList2.get(i11)).f36793c = false;
                        }
                        this.f36786d.add(new b(intent, arrayList2));
                        if (!this.f36787e.hasMessages(1)) {
                            this.f36787e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
