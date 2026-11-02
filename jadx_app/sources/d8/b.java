package d8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public enum b implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<b> CREATOR = new d0();
    private final String zzb;

    public static class a extends Exception {
    }

    b(String str) {
        this.zzb = str;
    }

    public static b a(String str) throws a {
        for (b bVar : values()) {
            if (str.equals(bVar.zzb)) {
                return bVar;
            }
        }
        throw new a(j2.g.a("Attachment ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zzb);
    }
}
