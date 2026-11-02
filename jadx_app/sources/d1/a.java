package d1;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public abstract class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f24701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0124a f24700b = new C0124a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: d1.a$a, reason: collision with other inner class name */
    public class C0124a extends a {
    }

    public a() {
        this.f24701a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f24701a, i10);
    }

    public class b implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return a.f24700b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i10) {
            return new a[i10];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f24700b;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f24701a = parcelable == f24700b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public a(Parcel parcel) {
        this(parcel, null);
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f24701a = parcelable == null ? f24700b : parcelable;
    }
}
