package z0;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c.InterfaceC0309c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<a> f37338a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f37339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37341d;

    public b(c cVar, ArrayList arrayList) {
        f(arrayList, false);
        f(arrayList, true);
        ArrayList<c.InterfaceC0309c> arrayList2 = cVar.f37343b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            b(cVar.f37344c, cVar.f37345d);
            d();
        }
        this.f37339b = cVar;
    }

    @Override // z0.c.InterfaceC0309c
    public final void a() {
        this.f37340c++;
    }

    @Override // z0.c.InterfaceC0309c
    public final void b(o0.b bVar, o0.b bVar2) {
        ArrayList<a> arrayList = this.f37338a;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        arrayList.get(size).getClass();
        throw null;
    }

    @Override // z0.c.InterfaceC0309c
    public final void c() {
        int i10 = this.f37340c;
        boolean z10 = i10 > 0;
        int i11 = i10 - 1;
        this.f37340c = i11;
        if (z10 && i11 == 0) {
            ArrayList<a> arrayList = this.f37338a;
            int size = arrayList.size() - 1;
            if (size < 0) {
                return;
            }
            arrayList.get(size).getClass();
            throw null;
        }
    }

    @Override // z0.c.InterfaceC0309c
    public final void d() {
        ArrayList<a> arrayList = this.f37338a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).getClass();
        }
    }

    @Override // z0.c.InterfaceC0309c
    public final void e() {
        ArrayList<a> arrayList = this.f37338a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).getClass();
        }
    }

    public final void f(List<a> list, boolean z10) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = list.get(i10);
            aVar.getClass();
            if (!z10) {
                b bVar = aVar.f37337a;
                if (bVar != null) {
                    throw new IllegalStateException(aVar + " (" + (i10 + 1) + DomExceptionUtils.SEPARATOR + size + ") is already controlled by " + bVar + " but is still added to " + this);
                }
                aVar.f37337a = this;
                this.f37338a.add(aVar);
            }
        }
    }
}
