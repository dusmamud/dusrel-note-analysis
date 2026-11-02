package g9;

import g9.c;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class b<T_WRAPPER extends g9.c<JcePrimitiveT>, JcePrimitiveT> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b<g9.c.f, MessageDigest> f27290b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d<JcePrimitiveT> f27291a;

    public static class a<JcePrimitiveT> implements d<JcePrimitiveT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g9.c<JcePrimitiveT> f27292a;

        public a(g9.c cVar) {
            this.f27292a = cVar;
        }

        @Override // g9.b.d
        public final Object getInstance() throws GeneralSecurityException {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (int i11 = 0; i11 < 2; i11++) {
                Provider provider = Security.getProvider(strArr[i11]);
                if (provider != null) {
                    arrayList.add(provider);
                }
            }
            int size = arrayList.size();
            Exception exc = null;
            while (true) {
                g9.c<JcePrimitiveT> cVar = this.f27292a;
                if (i10 >= size) {
                    return cVar.a(null);
                }
                Object obj = arrayList.get(i10);
                i10++;
                try {
                    return cVar.a((Provider) obj);
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g9.b$b, reason: collision with other inner class name */
    public static class C0167b<JcePrimitiveT> implements d<JcePrimitiveT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g9.c<JcePrimitiveT> f27293a;

        public C0167b(g9.c cVar) {
            this.f27293a = cVar;
        }

        @Override // g9.b.d
        public final Object getInstance() throws GeneralSecurityException {
            return this.f27293a.a(null);
        }
    }

    public static class c<JcePrimitiveT> implements d<JcePrimitiveT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g9.c<JcePrimitiveT> f27294a;

        public c(g9.c cVar) {
            this.f27294a = cVar;
        }

        @Override // g9.b.d
        public final Object getInstance() throws GeneralSecurityException {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (int i11 = 0; i11 < 3; i11++) {
                Provider provider = Security.getProvider(strArr[i11]);
                if (provider != null) {
                    arrayList.add(provider);
                }
            }
            int size = arrayList.size();
            Exception exc = null;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                try {
                    return this.f27294a.a((Provider) obj);
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }
    }

    public interface d<JcePrimitiveT> {
        Object getInstance() throws GeneralSecurityException;
    }

    static {
        new b(new g9.c.a());
        new b(new g9.c.e());
        new b(new g9.c.g());
        f27290b = new b<>(new g9.c.f());
        new b(new g9.c.b());
        new b(new g9.c.d());
        new b(new g9.c.C0168c());
    }

    public b(T_WRAPPER instanceBuilder) {
        if (e9.a.f25893b.get()) {
            this.f27291a = new c(instanceBuilder);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f27291a = new a(instanceBuilder);
        } else {
            this.f27291a = new C0167b(instanceBuilder);
        }
    }
}
