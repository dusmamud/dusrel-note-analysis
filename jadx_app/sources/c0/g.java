package c0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4327m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f4319e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f4319e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // c0.f
    public final void d(int i10) {
        if (this.f4324j) {
            return;
        }
        this.f4324j = true;
        this.f4321g = i10;
        ArrayList arrayList = this.f4325k;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }
}
