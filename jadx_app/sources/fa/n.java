package fa;

import com.google.android.gms.internal.ads.ki;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public interface n {

    public static final class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f26901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Date f26902b;

        public a(String identifier, Date date) {
            kotlin.jvm.internal.j.e(identifier, "identifier");
            this.f26901a = identifier;
            this.f26902b = date;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.j.a(this.f26901a, aVar.f26901a) && kotlin.jvm.internal.j.a(this.f26902b, aVar.f26902b);
        }

        public final int hashCode() {
            return this.f26902b.hashCode() + (this.f26901a.hashCode() * 31);
        }

        public final String toString() {
            return "Entitlement(identifier=" + this.f26901a + ", expiresAt=" + this.f26902b + ')';
        }
    }

    public static final class b implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f26903a = new b();
    }

    public static final class c implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f26904a = new c();
    }

    public static final class d implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f26905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26906b;

        public d(String code, int i10) {
            kotlin.jvm.internal.j.e(code, "code");
            this.f26905a = code;
            this.f26906b = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.j.a(this.f26905a, dVar.f26905a) && this.f26906b == dVar.f26906b;
        }

        public final int hashCode() {
            return (this.f26905a.hashCode() * 31) + this.f26906b;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VirtualCurrency(code=");
            sb2.append(this.f26905a);
            sb2.append(", amount=");
            return ki.b(sb2, this.f26906b, ')');
        }
    }
}
