package e6;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f25885a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f25886b;

    public static class a extends w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f25887c;

        public a(int loggingLevel) {
            this.f25887c = loggingLevel;
        }

        @Override // e6.w
        public final void a(String tag, String message) {
            if (this.f25887c <= 3) {
                Log.d(tag, message);
            }
        }

        @Override // e6.w
        public final void b(String tag, String message, Throwable throwable) {
            if (this.f25887c <= 3) {
                Log.d(tag, message, throwable);
            }
        }

        @Override // e6.w
        public final void c(String tag, String message) {
            if (this.f25887c <= 6) {
                Log.e(tag, message);
            }
        }

        @Override // e6.w
        public final void d(String tag, String message, Throwable throwable) {
            if (this.f25887c <= 6) {
                Log.e(tag, message, throwable);
            }
        }

        @Override // e6.w
        public final void f(String tag, String message) {
            if (this.f25887c <= 4) {
                Log.i(tag, message);
            }
        }

        @Override // e6.w
        public final void h(String tag, String message) {
            if (this.f25887c <= 5) {
                Log.w(tag, message);
            }
        }
    }

    public static w e() {
        a aVar;
        synchronized (f25885a) {
            try {
                if (f25886b == null) {
                    f25886b = new a(3);
                }
                aVar = f25886b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public static String g(String tag) {
        int length = tag.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(tag.substring(0, 20));
        } else {
            sb2.append(tag);
        }
        return sb2.toString();
    }

    public abstract void a(String tag, String message);

    public abstract void b(String tag, String message, Throwable throwable);

    public abstract void c(String tag, String message);

    public abstract void d(String tag, String message, Throwable throwable);

    public abstract void f(String tag, String message);

    public abstract void h(String tag, String message);
}
