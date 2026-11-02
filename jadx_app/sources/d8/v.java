package d8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public enum v implements Parcelable {
    PUBLIC_KEY;

    public static final Parcelable.Creator<v> CREATOR = new t0();
    private final String zzb = "public-key";

    public static class a extends Exception {
    }

    public static v a(String str) throws a {
        for (v vVar : values()) {
            if (str.equals(vVar.zzb)) {
                return vVar;
            }
        }
        throw new a(j2.g.a("PublicKeyCredentialType ", str, " not supported"));
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
