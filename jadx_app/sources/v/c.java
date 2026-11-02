package v;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class c extends c.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f35093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v.b f35094b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f35095a;

        public a(Bundle bundle) {
            this.f35095a = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f35094b.j(this.f35095a);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f35097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f35098b;

        public b(int i10, Bundle bundle) {
            this.f35097a = i10;
            this.f35098b = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f35094b.g(this.f35097a, this.f35098b);
        }
    }

    /* JADX INFO: renamed from: v.c$c, reason: collision with other inner class name */
    public class RunnableC0269c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f35101b;

        public RunnableC0269c(String str, Bundle bundle) {
            this.f35100a = str;
            this.f35101b = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f35094b.a(this.f35101b, this.f35100a);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f35103a;

        public d(Bundle bundle) {
            this.f35103a = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f35094b.e(this.f35103a);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f35106b;

        public e(String str, Bundle bundle) {
            this.f35105a = str;
            this.f35106b = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f35094b.h(this.f35106b, this.f35105a);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f35108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Uri f35109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f35110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Bundle f35111d;

        public f(int i10, Uri uri, boolean z10, Bundle bundle) {
            this.f35108a = i10;
            this.f35109b = uri;
            this.f35110c = z10;
            this.f35111d = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f35094b.i(this.f35108a, this.f35109b, this.f35110c, this.f35111d);
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f35113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f35114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bundle f35115c;

        public g(int i10, int i11, Bundle bundle) {
            this.f35113a = i10;
            this.f35114b = i11;
            this.f35115c = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f35094b.d(this.f35113a, this.f35114b, this.f35115c);
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f35117a;

        public h(Bundle bundle) {
            this.f35117a = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f35094b.k(this.f35117a);
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f35119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f35120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f35121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f35122d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f35123e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Bundle f35124f;

        public i(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
            this.f35119a = i10;
            this.f35120b = i11;
            this.f35121c = i12;
            this.f35122d = i13;
            this.f35123e = i14;
            this.f35124f = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f35094b.c(this.f35119a, this.f35120b, this.f35121c, this.f35122d, this.f35123e, this.f35124f);
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f35126a;

        public j(Bundle bundle) {
            this.f35126a = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f35094b.f(this.f35126a);
        }
    }

    public c(v.b bVar) {
        this.f35094b = bVar;
        attachInterface(this, c.c.L);
        this.f35093a = new Handler(Looper.getMainLooper());
    }

    @Override // c.c
    public final void G0(Bundle bundle) throws RemoteException {
        if (this.f35094b == null) {
            return;
        }
        this.f35093a.post(new j(bundle));
    }

    @Override // c.c
    public final void K0(Bundle bundle) throws RemoteException {
        if (this.f35094b == null) {
            return;
        }
        this.f35093a.post(new a(bundle));
    }

    @Override // c.c
    public final void N(int i10, int i11, int i12, int i13, int i14, Bundle bundle) throws RemoteException {
        if (this.f35094b == null) {
            return;
        }
        this.f35093a.post(new i(i10, i11, i12, i13, i14, bundle));
    }

    @Override // c.c
    public final void Q0(int i10, int i11, Bundle bundle) throws RemoteException {
        if (this.f35094b == null) {
            return;
        }
        this.f35093a.post(new g(i10, i11, bundle));
    }

    @Override // c.c
    public final Bundle U1(Bundle bundle, String str) throws RemoteException {
        v.b bVar = this.f35094b;
        if (bVar == null) {
            return null;
        }
        return bVar.b(bundle, str);
    }

    @Override // c.c
    public final void Z1(Bundle bundle) throws RemoteException {
        if (this.f35094b == null) {
            return;
        }
        this.f35093a.post(new d(bundle));
    }

    @Override // c.c
    public final void c2(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException {
        if (this.f35094b == null) {
            return;
        }
        this.f35093a.post(new f(i10, uri, z10, bundle));
    }

    @Override // c.c
    public final void i1(Bundle bundle) throws RemoteException {
        if (this.f35094b == null) {
            return;
        }
        this.f35093a.post(new h(bundle));
    }

    @Override // c.c
    public final void k2(Bundle bundle, String str) throws RemoteException {
        if (this.f35094b == null) {
            return;
        }
        this.f35093a.post(new RunnableC0269c(str, bundle));
    }

    @Override // c.c
    public final void p1(int i10, Bundle bundle) {
        if (this.f35094b == null) {
            return;
        }
        this.f35093a.post(new b(i10, bundle));
    }

    @Override // c.c
    public final void q(Bundle bundle, String str) throws RemoteException {
        if (this.f35094b == null) {
            return;
        }
        this.f35093a.post(new e(str, bundle));
    }
}
