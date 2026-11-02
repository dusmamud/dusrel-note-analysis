package d8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public enum y implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<y> CREATOR = new v0();
    private final String zzb;

    public static class a extends Exception {
    }

    y(String str) {
        this.zzb = str;
    }

    public static y a(String str) throws a {
        for (y yVar : values()) {
            if (str.equals(yVar.zzb)) {
                return yVar;
            }
        }
        throw new a(j2.g.a("Resident key requirement ", str, " not supported"));
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
