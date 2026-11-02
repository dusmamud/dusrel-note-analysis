package d8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public enum c implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");

    public static final Parcelable.Creator<c> CREATOR = new d1();
    private final String zzb;

    public static class a extends Exception {
    }

    c(String str) {
        this.zzb = str;
    }

    public static c a(String str) throws a {
        for (c cVar : values()) {
            if (str.equals(cVar.zzb)) {
                return cVar;
            }
        }
        throw new a(j2.g.a("Attestation conveyance preference ", str, " not supported"));
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
