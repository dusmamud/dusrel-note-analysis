package i6;

import com.google.android.gms.internal.ads.ki;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    public static final class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28317a = new a();
    }

    /* JADX INFO: renamed from: i6.b$b, reason: collision with other inner class name */
    public static final class C0180b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f28318a;

        public C0180b(int i10) {
            this.f28318a = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0180b) && this.f28318a == ((C0180b) obj).f28318a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f28318a);
        }

        public final String toString() {
            return ki.b(new StringBuilder("ConstraintsNotMet(reason="), this.f28318a, ')');
        }
    }
}
