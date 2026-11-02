package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f590e;

    public class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f586a = parcel.readInt();
        this.f588c = parcel.readInt();
        this.f589d = parcel.readInt();
        this.f590e = parcel.readInt();
        this.f587b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f586a);
        parcel.writeInt(this.f588c);
        parcel.writeInt(this.f589d);
        parcel.writeInt(this.f590e);
        parcel.writeInt(this.f587b);
    }
}
