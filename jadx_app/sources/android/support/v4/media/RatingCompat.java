package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f572b;

    public class a implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public final RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readFloat(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingCompat[] newArray(int i10) {
            return new RatingCompat[i10];
        }
    }

    public RatingCompat(float f10, int i10) {
        this.f571a = i10;
        this.f572b = f10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f571a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f571a);
        sb2.append(" rating=");
        float f10 = this.f572b;
        sb2.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f571a);
        parcel.writeFloat(this.f572b);
    }
}
