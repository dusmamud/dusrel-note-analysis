package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f3501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f3502b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3507e;

        public final boolean a() {
            int i10;
            int i11;
            int i12;
            int i13 = this.f3503a;
            int i14 = 2;
            if ((i13 & 7) != 0) {
                int i15 = this.f3506d;
                int i16 = this.f3504b;
                if (i15 > i16) {
                    i12 = 1;
                } else {
                    i12 = i15 == i16 ? 2 : 4;
                }
                if ((i12 & i13) == 0) {
                    return false;
                }
            }
            if ((i13 & 112) != 0) {
                int i17 = this.f3506d;
                int i18 = this.f3505c;
                if (i17 > i18) {
                    i11 = 1;
                } else {
                    i11 = i17 == i18 ? 2 : 4;
                }
                if (((i11 << 4) & i13) == 0) {
                    return false;
                }
            }
            if ((i13 & 1792) != 0) {
                int i19 = this.f3507e;
                int i20 = this.f3504b;
                if (i19 > i20) {
                    i10 = 1;
                } else {
                    i10 = i19 == i20 ? 2 : 4;
                }
                if (((i10 << 8) & i13) == 0) {
                    return false;
                }
            }
            if ((i13 & 28672) != 0) {
                int i21 = this.f3507e;
                int i22 = this.f3505c;
                if (i21 > i22) {
                    i14 = 1;
                } else if (i21 != i22) {
                    i14 = 4;
                }
                if ((i13 & (i14 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public interface b {
        int a(View view);

        int b();

        int c();

        View d(int i10);

        int e(View view);
    }

    public x(b bVar) {
        this.f3501a = bVar;
        a aVar = new a();
        aVar.f3503a = 0;
        this.f3502b = aVar;
    }

    public final View a(int i10, int i11, int i12, int i13) {
        b bVar = this.f3501a;
        int iB = bVar.b();
        int iC = bVar.c();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewD = bVar.d(i10);
            int iA = bVar.a(viewD);
            int iE = bVar.e(viewD);
            a aVar = this.f3502b;
            aVar.f3504b = iB;
            aVar.f3505c = iC;
            aVar.f3506d = iA;
            aVar.f3507e = iE;
            if (i12 != 0) {
                aVar.f3503a = i12;
                if (aVar.a()) {
                    return viewD;
                }
            }
            if (i13 != 0) {
                aVar.f3503a = i13;
                if (aVar.a()) {
                    view = viewD;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public final boolean b(View view) {
        b bVar = this.f3501a;
        int iB = bVar.b();
        int iC = bVar.c();
        int iA = bVar.a(view);
        int iE = bVar.e(view);
        a aVar = this.f3502b;
        aVar.f3504b = iB;
        aVar.f3505c = iC;
        aVar.f3506d = iA;
        aVar.f3507e = iE;
        aVar.f3503a = 24579;
        return aVar.a();
    }
}
