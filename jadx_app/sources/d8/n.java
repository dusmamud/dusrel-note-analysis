package d8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public enum n implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<n> CREATOR = new x1();
    private final int zzb;

    public static class a extends Exception {
    }

    n(int i10) {
        this.zzb = i10;
    }

    public static n b(int i10) throws a {
        for (n nVar : values()) {
            if (i10 == nVar.zzb) {
                return nVar;
            }
        }
        Locale locale = Locale.US;
        throw new a(androidx.credentials.playservices.controllers.a.a(i10, "Error code ", " is not supported"));
    }

    public final int a() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zzb);
    }
}
