package ca;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class t3 implements Parcelable, Serializable {
    public static final Parcelable.Creator<t3> CREATOR = new a();
    private static final long serialVersionUID = 81719171;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u3 f5096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5097b;

    public static final class a implements Parcelable.Creator<t3> {
        @Override // android.os.Parcelable.Creator
        public final t3 createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.j.e(parcel, "parcel");
            return new t3(u3.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final t3[] newArray(int i10) {
            return new t3[i10];
        }
    }

    public t3(u3 code, String str) {
        kotlin.jvm.internal.j.e(code, "code");
        this.f5096a = code;
        this.f5097b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type com.revenuecat.purchases.PurchasesError");
        t3 t3Var = (t3) obj;
        return this.f5096a == t3Var.f5096a && kotlin.jvm.internal.j.a(this.f5097b, t3Var.f5097b);
    }

    public final int hashCode() {
        int iHashCode = this.f5096a.hashCode() * 31;
        String str = this.f5097b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PurchasesError(code=");
        u3 u3Var = this.f5096a;
        sb2.append(u3Var);
        sb2.append(", underlyingErrorMessage=");
        sb2.append(this.f5097b);
        sb2.append(", message='");
        sb2.append(u3Var.b());
        sb2.append("')");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        kotlin.jvm.internal.j.e(out, "out");
        out.writeString(this.f5096a.name());
        out.writeString(this.f5097b);
    }
}
