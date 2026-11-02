package v3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f extends v3.b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c> f35189a;

    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            return new f(0, parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f35190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f35191b;

        public b(int i10, long j10) {
            this.f35190a = i10;
            this.f35191b = j10;
        }
    }

    private f(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new c(parcel));
        }
        this.f35189a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List<c> list = this.f35189a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = list.get(i11);
            parcel.writeLong(cVar.f35192a);
            parcel.writeByte(cVar.f35193b ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f35194c ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f35195d ? (byte) 1 : (byte) 0);
            List<b> list2 = cVar.f35197f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                b bVar = list2.get(i12);
                parcel.writeInt(bVar.f35190a);
                parcel.writeLong(bVar.f35191b);
            }
            parcel.writeLong(cVar.f35196e);
            parcel.writeByte(cVar.f35198g ? (byte) 1 : (byte) 0);
            parcel.writeLong(cVar.f35199h);
            parcel.writeInt(cVar.f35200i);
            parcel.writeInt(cVar.f35201j);
            parcel.writeInt(cVar.f35202k);
        }
    }

    public f(ArrayList arrayList) {
        this.f35189a = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ f(int i10, Parcel parcel) {
        this(parcel);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f35192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f35193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f35194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f35195d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f35196e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<b> f35197f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f35198g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f35199h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f35200i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f35201j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f35202k;

        public c(long j10, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f35192a = j10;
            this.f35193b = z10;
            this.f35194c = z11;
            this.f35195d = z12;
            this.f35197f = Collections.unmodifiableList(arrayList);
            this.f35196e = j11;
            this.f35198g = z13;
            this.f35199h = j12;
            this.f35200i = i10;
            this.f35201j = i11;
            this.f35202k = i12;
        }

        public c(Parcel parcel) {
            this.f35192a = parcel.readLong();
            this.f35193b = parcel.readByte() == 1;
            this.f35194c = parcel.readByte() == 1;
            this.f35195d = parcel.readByte() == 1;
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new b(parcel.readInt(), parcel.readLong()));
            }
            this.f35197f = Collections.unmodifiableList(arrayList);
            this.f35196e = parcel.readLong();
            this.f35198g = parcel.readByte() == 1;
            this.f35199h = parcel.readLong();
            this.f35200i = parcel.readInt();
            this.f35201j = parcel.readInt();
            this.f35202k = parcel.readInt();
        }
    }
}
