package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f2303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<String> f2304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f2305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f2306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f2311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CharSequence f2313k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList<String> f2314l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList<String> f2315m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f2316n;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f2501a.size();
        this.f2303a = new int[size * 6];
        if (!aVar.f2507g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2304b = new ArrayList<>(size);
        this.f2305c = new int[size];
        this.f2306d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            n0.a aVar2 = aVar.f2501a.get(i11);
            int i12 = i10 + 1;
            this.f2303a[i10] = aVar2.f2518a;
            ArrayList<String> arrayList = this.f2304b;
            n nVar = aVar2.f2519b;
            arrayList.add(nVar != null ? nVar.mWho : null);
            int[] iArr = this.f2303a;
            iArr[i12] = aVar2.f2520c ? 1 : 0;
            iArr[i10 + 2] = aVar2.f2521d;
            iArr[i10 + 3] = aVar2.f2522e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar2.f2523f;
            i10 += 6;
            iArr[i13] = aVar2.f2524g;
            this.f2305c[i11] = aVar2.f2525h.ordinal();
            this.f2306d[i11] = aVar2.f2526i.ordinal();
        }
        this.f2307e = aVar.f2506f;
        this.f2308f = aVar.f2509i;
        this.f2309g = aVar.f2301t;
        this.f2310h = aVar.f2510j;
        this.f2311i = aVar.f2511k;
        this.f2312j = aVar.f2512l;
        this.f2313k = aVar.f2513m;
        this.f2314l = aVar.f2514n;
        this.f2315m = aVar.f2515o;
        this.f2316n = aVar.f2516p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f2303a);
        parcel.writeStringList(this.f2304b);
        parcel.writeIntArray(this.f2305c);
        parcel.writeIntArray(this.f2306d);
        parcel.writeInt(this.f2307e);
        parcel.writeString(this.f2308f);
        parcel.writeInt(this.f2309g);
        parcel.writeInt(this.f2310h);
        TextUtils.writeToParcel(this.f2311i, parcel, 0);
        parcel.writeInt(this.f2312j);
        TextUtils.writeToParcel(this.f2313k, parcel, 0);
        parcel.writeStringList(this.f2314l);
        parcel.writeStringList(this.f2315m);
        parcel.writeInt(this.f2316n ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f2303a = parcel.createIntArray();
        this.f2304b = parcel.createStringArrayList();
        this.f2305c = parcel.createIntArray();
        this.f2306d = parcel.createIntArray();
        this.f2307e = parcel.readInt();
        this.f2308f = parcel.readString();
        this.f2309g = parcel.readInt();
        this.f2310h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f2311i = (CharSequence) creator.createFromParcel(parcel);
        this.f2312j = parcel.readInt();
        this.f2313k = (CharSequence) creator.createFromParcel(parcel);
        this.f2314l = parcel.createStringArrayList();
        this.f2315m = parcel.createStringArrayList();
        this.f2316n = parcel.readInt() != 0;
    }
}
