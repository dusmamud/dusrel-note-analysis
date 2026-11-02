package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class mr3 implements Parcelable {
    public static final Parcelable.Creator<mr3> CREATOR = new jr3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f12977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f12980e;

    public mr3(Parcel parcel) {
        this.f12977b = new UUID(parcel.readLong(), parcel.readLong());
        this.f12978c = parcel.readString();
        String string = parcel.readString();
        String str = b32.f7042a;
        this.f12979d = string;
        this.f12980e = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mr3)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        mr3 mr3Var = (mr3) obj;
        return Objects.equals(this.f12978c, mr3Var.f12978c) && Objects.equals(this.f12979d, mr3Var.f12979d) && Objects.equals(this.f12977b, mr3Var.f12977b) && Arrays.equals(this.f12980e, mr3Var.f12980e);
    }

    public final int hashCode() {
        int i10 = this.f12976a;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f12977b.hashCode() * 31;
        String str = this.f12978c;
        int iHashCode2 = Arrays.hashCode(this.f12980e) + b1.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f12979d);
        this.f12976a = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f12977b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f12978c);
        parcel.writeString(this.f12979d);
        parcel.writeByteArray(this.f12980e);
    }

    public mr3(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.f12977b = uuid;
        this.f12978c = null;
        this.f12979d = ye.h(str);
        this.f12980e = bArr;
    }
}
