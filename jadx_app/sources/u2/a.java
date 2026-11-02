package u2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0254a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34638a;

    /* JADX INFO: renamed from: u2.a$a, reason: collision with other inner class name */
    public class C0254a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10) {
        this.f34638a = (i10 & 2) != 0 ? i10 | 1 : i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            if (this.f34638a == ((a) obj).f34638a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f34638a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f34638a);
    }
}
