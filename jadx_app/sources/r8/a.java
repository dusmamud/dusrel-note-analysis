package r8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f33801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f33802d;

    public /* synthetic */ a(Parcel parcel) {
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.f33799a = string;
        String string2 = parcel.readString();
        Objects.requireNonNull(string2);
        this.f33800b = string2;
        if (parcel.readByte() != 0) {
            this.f33801c = parcel.readStrongBinder();
        } else {
            this.f33801c = null;
        }
        Bundle bundle = parcel.readBundle(a.class.getClassLoader());
        this.f33802d = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f33799a);
        parcel.writeString(this.f33800b);
        IBinder iBinder = this.f33801c;
        if (iBinder != null) {
            parcel.writeByte((byte) 1);
            parcel.writeStrongBinder(iBinder);
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeBundle(this.f33802d);
    }

    public a(String str, String str2, IBinder iBinder) {
        Objects.requireNonNull(str, "targetPackage cannot be null");
        this.f33799a = str;
        Objects.requireNonNull(str2, "url cannot be null");
        this.f33800b = str2;
        this.f33801c = iBinder;
        this.f33802d = Bundle.EMPTY;
    }
}
