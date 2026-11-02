package v;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.c f35145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PendingIntent f35146b;

    public class a extends b {
        public a() {
        }

        @Override // v.b
        public final void a(Bundle bundle, String str) {
            try {
                j.this.f35145a.k2(bundle, str);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // v.b
        public final Bundle b(Bundle bundle, String str) {
            try {
                return j.this.f35145a.U1(bundle, str);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                return null;
            }
        }

        @Override // v.b
        public final void c(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
            try {
                j.this.f35145a.N(i10, i11, i12, i13, i14, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // v.b
        public final void d(int i10, int i11, Bundle bundle) {
            try {
                j.this.f35145a.Q0(i10, i11, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // v.b
        public final void e(Bundle bundle) {
            try {
                j.this.f35145a.Z1(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // v.b
        public final void f(Bundle bundle) {
            try {
                j.this.f35145a.G0(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // v.b
        public final void g(int i10, Bundle bundle) {
            try {
                j.this.f35145a.p1(i10, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // v.b
        public final void h(Bundle bundle, String str) {
            try {
                j.this.f35145a.q(bundle, str);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // v.b
        public final void i(int i10, Uri uri, boolean z10, Bundle bundle) {
            try {
                j.this.f35145a.c2(i10, uri, z10, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // v.b
        public final void j(Bundle bundle) {
            try {
                j.this.f35145a.K0(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // v.b
        public final void k(Bundle bundle) {
            try {
                j.this.f35145a.i1(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }
    }

    public j(c.c cVar, PendingIntent pendingIntent) {
        if (cVar == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f35145a = cVar;
        this.f35146b = pendingIntent;
        if (cVar == null) {
            return;
        }
        new a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            PendingIntent pendingIntent = jVar.f35146b;
            PendingIntent pendingIntent2 = this.f35146b;
            if ((pendingIntent2 == null) == (pendingIntent == null)) {
                if (pendingIntent2 != null) {
                    return pendingIntent2.equals(pendingIntent);
                }
                c.c cVar = this.f35145a;
                if (cVar == null) {
                    throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
                }
                IBinder iBinderAsBinder = cVar.asBinder();
                c.c cVar2 = jVar.f35145a;
                if (cVar2 != null) {
                    return iBinderAsBinder.equals(cVar2.asBinder());
                }
                throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
            }
        }
        return false;
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.f35146b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        c.c cVar = this.f35145a;
        if (cVar != null) {
            return cVar.asBinder().hashCode();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }
}
