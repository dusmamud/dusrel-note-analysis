package b3;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f4162h = new l();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a3.b f4163i = new a3.b(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4164a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4170g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a[] f4166c = new a[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<a> f4165b = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4167d = -1;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f4173c;
    }

    public m(int i10) {
        this.f4164a = i10;
    }

    public final void a(float f10, int i10) {
        a aVar;
        int i11 = this.f4167d;
        ArrayList<a> arrayList = this.f4165b;
        if (i11 != 1) {
            Collections.sort(arrayList, f4162h);
            this.f4167d = 1;
        }
        int i12 = this.f4170g;
        a[] aVarArr = this.f4166c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f4170g = i13;
            aVar = aVarArr[i13];
        } else {
            aVar = new a();
        }
        int i14 = this.f4168e;
        this.f4168e = i14 + 1;
        aVar.f4171a = i14;
        aVar.f4172b = i10;
        aVar.f4173c = f10;
        arrayList.add(aVar);
        this.f4169f += i10;
        while (true) {
            int i15 = this.f4169f;
            int i16 = this.f4164a;
            if (i15 <= i16) {
                return;
            }
            int i17 = i15 - i16;
            a aVar2 = arrayList.get(0);
            int i18 = aVar2.f4172b;
            if (i18 <= i17) {
                this.f4169f -= i18;
                arrayList.remove(0);
                int i19 = this.f4170g;
                if (i19 < 5) {
                    this.f4170g = i19 + 1;
                    aVarArr[i19] = aVar2;
                }
            } else {
                aVar2.f4172b = i18 - i17;
                this.f4169f -= i17;
            }
        }
    }

    public final float b() {
        int i10 = this.f4167d;
        ArrayList<a> arrayList = this.f4165b;
        if (i10 != 0) {
            Collections.sort(arrayList, f4163i);
            this.f4167d = 0;
        }
        float f10 = 0.5f * this.f4169f;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            a aVar = arrayList.get(i12);
            i11 += aVar.f4172b;
            if (i11 >= f10) {
                return aVar.f4173c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return arrayList.get(arrayList.size() - 1).f4173c;
    }
}
