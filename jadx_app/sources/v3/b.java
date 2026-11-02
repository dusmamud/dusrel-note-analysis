package v3;

import b2.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements u.b {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}
