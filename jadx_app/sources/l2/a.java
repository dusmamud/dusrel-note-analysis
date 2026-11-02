package l2;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        m2.b bVar = (m2.b) obj;
        m2.b bVar2 = (m2.b) obj2;
        int iCompare = Integer.compare(bVar.f31045c, bVar2.f31045c);
        return iCompare != 0 ? iCompare : bVar.f31044b.compareTo(bVar2.f31044b);
    }
}
