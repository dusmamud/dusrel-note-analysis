package androidx.recyclerview.widget;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f3373d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0.d f3370a = new v0.d(30);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<C0051a> f3371b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<C0051a> f3372c = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3375f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f3374e = new o(this);

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    public static class C0051a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f3378c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3379d;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj == null || C0051a.class != obj.getClass()) {
                    return false;
                }
                C0051a c0051a = (C0051a) obj;
                int i10 = this.f3376a;
                if (i10 != c0051a.f3376a) {
                    return false;
                }
                if (i10 != 8 || Math.abs(this.f3379d - this.f3377b) != 1 || this.f3379d != c0051a.f3377b || this.f3377b != c0051a.f3379d) {
                    if (this.f3379d != c0051a.f3379d || this.f3377b != c0051a.f3377b) {
                        return false;
                    }
                    Object obj2 = this.f3378c;
                    if (obj2 != null) {
                        if (!obj2.equals(c0051a.f3378c)) {
                            return false;
                        }
                    } else if (c0051a.f3378c != null) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f3376a * 31) + this.f3377b) * 31) + this.f3379d;
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append("[");
            int i10 = this.f3376a;
            if (i10 == 1) {
                str = "add";
            } else if (i10 == 2) {
                str = "rm";
            } else if (i10 != 4) {
                str = i10 != 8 ? "??" : "mv";
            } else {
                str = "up";
            }
            sb2.append(str);
            sb2.append(",s:");
            sb2.append(this.f3377b);
            sb2.append("c:");
            sb2.append(this.f3379d);
            sb2.append(",p:");
            sb2.append(this.f3378c);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public a(t tVar) {
        this.f3373d = tVar;
    }

    public final boolean a(int i10) {
        ArrayList<C0051a> arrayList = this.f3372c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0051a c0051a = arrayList.get(i11);
            int i12 = c0051a.f3376a;
            if (i12 != 8) {
                if (i12 == 1) {
                    int i13 = c0051a.f3377b;
                    int i14 = c0051a.f3379d + i13;
                    while (i13 < i14) {
                        if (f(i13, i11 + 1) == i10) {
                            return true;
                        }
                        i13++;
                    }
                } else {
                    continue;
                }
            } else {
                if (f(c0051a.f3379d, i11 + 1) == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<C0051a> arrayList = this.f3372c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3373d.a(arrayList.get(i10));
        }
        k(arrayList);
        this.f3375f = 0;
    }

    public final void c() {
        b();
        ArrayList<C0051a> arrayList = this.f3371b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0051a c0051a = arrayList.get(i10);
            int i11 = c0051a.f3376a;
            t tVar = this.f3373d;
            if (i11 == 1) {
                tVar.a(c0051a);
                tVar.d(c0051a.f3377b, c0051a.f3379d);
            } else if (i11 == 2) {
                tVar.a(c0051a);
                int i12 = c0051a.f3377b;
                int i13 = c0051a.f3379d;
                RecyclerView recyclerView = tVar.f3496a;
                recyclerView.L(i12, i13, true);
                recyclerView.f3233z0 = true;
                recyclerView.f3227w0.f3289b += i13;
            } else if (i11 == 4) {
                tVar.a(c0051a);
                tVar.c(c0051a.f3377b, c0051a.f3379d, c0051a.f3378c);
            } else if (i11 == 8) {
                tVar.a(c0051a);
                tVar.e(c0051a.f3377b, c0051a.f3379d);
            }
        }
        k(arrayList);
        this.f3375f = 0;
    }

    public final void d(C0051a c0051a) {
        int i10;
        v0.d dVar;
        int i11 = c0051a.f3376a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iL = l(c0051a.f3377b, i11);
        int i12 = c0051a.f3377b;
        int i13 = c0051a.f3376a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0051a);
            }
            i10 = 1;
        }
        int i14 = 1;
        int i15 = 1;
        while (true) {
            int i16 = c0051a.f3379d;
            dVar = this.f3370a;
            if (i14 >= i16) {
                break;
            }
            int iL2 = l((i10 * i14) + c0051a.f3377b, c0051a.f3376a);
            int i17 = c0051a.f3376a;
            if (i17 == 2 ? iL2 != iL : !(i17 == 4 && iL2 == iL + 1)) {
                C0051a c0051aH = h(c0051a.f3378c, i17, iL, i15);
                e(c0051aH, i12);
                c0051aH.f3378c = null;
                dVar.b(c0051aH);
                if (c0051a.f3376a == 4) {
                    i12 += i15;
                }
                i15 = 1;
                iL = iL2;
            } else {
                i15++;
            }
            i14++;
        }
        Object obj = c0051a.f3378c;
        c0051a.f3378c = null;
        dVar.b(c0051a);
        if (i15 > 0) {
            C0051a c0051aH2 = h(obj, c0051a.f3376a, iL, i15);
            e(c0051aH2, i12);
            c0051aH2.f3378c = null;
            dVar.b(c0051aH2);
        }
    }

    public final void e(C0051a c0051a, int i10) {
        t tVar = this.f3373d;
        tVar.a(c0051a);
        int i11 = c0051a.f3376a;
        if (i11 != 2) {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            tVar.c(i10, c0051a.f3379d, c0051a.f3378c);
        } else {
            int i12 = c0051a.f3379d;
            RecyclerView recyclerView = tVar.f3496a;
            recyclerView.L(i10, i12, true);
            recyclerView.f3233z0 = true;
            recyclerView.f3227w0.f3289b += i12;
        }
    }

    public final int f(int i10, int i11) {
        ArrayList<C0051a> arrayList = this.f3372c;
        int size = arrayList.size();
        while (i11 < size) {
            C0051a c0051a = arrayList.get(i11);
            int i12 = c0051a.f3376a;
            if (i12 == 8) {
                int i13 = c0051a.f3377b;
                if (i13 == i10) {
                    i10 = c0051a.f3379d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (c0051a.f3379d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = c0051a.f3377b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = c0051a.f3379d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += c0051a.f3379d;
                }
            }
            i11++;
        }
        return i10;
    }

    public final boolean g() {
        return this.f3371b.size() > 0;
    }

    public final C0051a h(Object obj, int i10, int i11, int i12) {
        C0051a c0051a = (C0051a) this.f3370a.a();
        if (c0051a != null) {
            c0051a.f3376a = i10;
            c0051a.f3377b = i11;
            c0051a.f3379d = i12;
            c0051a.f3378c = obj;
            return c0051a;
        }
        C0051a c0051a2 = new C0051a();
        c0051a2.f3376a = i10;
        c0051a2.f3377b = i11;
        c0051a2.f3379d = i12;
        c0051a2.f3378c = obj;
        return c0051a2;
    }

    public final void i(C0051a c0051a) {
        this.f3372c.add(c0051a);
        int i10 = c0051a.f3376a;
        t tVar = this.f3373d;
        if (i10 == 1) {
            tVar.d(c0051a.f3377b, c0051a.f3379d);
            return;
        }
        if (i10 == 2) {
            int i11 = c0051a.f3377b;
            int i12 = c0051a.f3379d;
            RecyclerView recyclerView = tVar.f3496a;
            recyclerView.L(i11, i12, false);
            recyclerView.f3233z0 = true;
            return;
        }
        if (i10 == 4) {
            tVar.c(c0051a.f3377b, c0051a.f3379d, c0051a.f3378c);
        } else if (i10 == 8) {
            tVar.e(c0051a.f3377b, c0051a.f3379d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0051a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0189  */
    /* JADX WARN: Code duplicated, block: B:105:0x018d  */
    /* JADX WARN: Code duplicated, block: B:186:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0123  */
    /* JADX WARN: Code duplicated, block: B:77:0x0125  */
    /* JADX WARN: Code duplicated, block: B:79:0x012b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0136  */
    /* JADX WARN: Code duplicated, block: B:85:0x0141  */
    /* JADX WARN: Code duplicated, block: B:88:0x014c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0152  */
    /* JADX WARN: Code duplicated, block: B:90:0x0154  */
    /* JADX WARN: Code duplicated, block: B:92:0x015a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0165  */
    /* JADX WARN: Code duplicated, block: B:98:0x0170  */
    public final void j() {
        ArrayList<C0051a> arrayList;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C0051a c0051aH;
        int i15;
        int i16;
        int i17;
        C0051a c0051aH2;
        boolean z10;
        boolean z11;
        Object obj;
        C0051a c0051a;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        o oVar = this.f3374e;
        oVar.getClass();
        while (true) {
            arrayList = this.f3371b;
            i10 = 1;
            int size = arrayList.size() - 1;
            boolean z12 = false;
            while (true) {
                i11 = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (arrayList.get(size).f3376a != 8) {
                    z12 = true;
                } else if (z12) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i26 = size + 1;
            a aVar = oVar.f3491a;
            v0.d dVar = aVar.f3370a;
            C0051a c0051a2 = arrayList.get(size);
            C0051a c0051a3 = arrayList.get(i26);
            int i27 = c0051a3.f3376a;
            if (i27 == 1) {
                int i28 = c0051a2.f3379d;
                int i29 = c0051a3.f3377b;
                int i30 = i28 < i29 ? -1 : 0;
                int i31 = c0051a2.f3377b;
                if (i31 < i29) {
                    i30++;
                }
                if (i29 <= i31) {
                    c0051a2.f3377b = i31 + c0051a3.f3379d;
                }
                int i32 = c0051a3.f3377b;
                if (i32 <= i28) {
                    c0051a2.f3379d = i28 + c0051a3.f3379d;
                }
                c0051a3.f3377b = i32 + i30;
                arrayList.set(size, c0051a3);
                arrayList.set(i26, c0051a2);
            } else if (i27 == 2) {
                int i33 = c0051a2.f3377b;
                int i34 = c0051a2.f3379d;
                if (i33 < i34) {
                    z11 = c0051a3.f3377b == i33 && c0051a3.f3379d == i34 - i33;
                    z10 = false;
                } else if (c0051a3.f3377b == i34 + 1 && c0051a3.f3379d == i33 - i34) {
                    z11 = true;
                    z10 = true;
                } else {
                    z10 = true;
                    z11 = false;
                }
                int i35 = c0051a3.f3377b;
                if (i34 < i35) {
                    c0051a3.f3377b = i35 - 1;
                } else {
                    int i36 = c0051a3.f3379d;
                    if (i34 < i35 + i36) {
                        c0051a3.f3379d = i36 - 1;
                        c0051a2.f3376a = 2;
                        c0051a2.f3379d = 1;
                        if (c0051a3.f3379d == 0) {
                            arrayList.remove(i26);
                            c0051a3.f3378c = null;
                            dVar.b(c0051a3);
                        }
                    }
                }
                int i37 = c0051a2.f3377b;
                int i38 = c0051a3.f3377b;
                if (i37 <= i38) {
                    c0051a3.f3377b = i38 + 1;
                } else {
                    int i39 = i38 + c0051a3.f3379d;
                    if (i37 < i39) {
                        obj = null;
                        C0051a c0051aH3 = aVar.h(null, 2, i37 + 1, i39 - i37);
                        c0051a3.f3379d = c0051a2.f3377b - c0051a3.f3377b;
                        c0051a = c0051aH3;
                    }
                    if (z11) {
                        arrayList.set(size, c0051a3);
                        arrayList.remove(i26);
                        c0051a2.f3378c = obj;
                        dVar.b(c0051a2);
                    } else {
                        if (z10) {
                            if (c0051a != null) {
                                i24 = c0051a2.f3377b;
                                if (i24 > c0051a.f3377b) {
                                    c0051a2.f3377b = i24 - c0051a.f3379d;
                                }
                                i25 = c0051a2.f3379d;
                                if (i25 > c0051a.f3377b) {
                                    c0051a2.f3379d = i25 - c0051a.f3379d;
                                }
                            }
                            i22 = c0051a2.f3377b;
                            if (i22 > c0051a3.f3377b) {
                                c0051a2.f3377b = i22 - c0051a3.f3379d;
                            }
                            i23 = c0051a2.f3379d;
                            if (i23 > c0051a3.f3377b) {
                                c0051a2.f3379d = i23 - c0051a3.f3379d;
                            }
                        } else {
                            if (c0051a != null) {
                                i20 = c0051a2.f3377b;
                                if (i20 >= c0051a.f3377b) {
                                    c0051a2.f3377b = i20 - c0051a.f3379d;
                                }
                                i21 = c0051a2.f3379d;
                                if (i21 >= c0051a.f3377b) {
                                    c0051a2.f3379d = i21 - c0051a.f3379d;
                                }
                            }
                            i18 = c0051a2.f3377b;
                            if (i18 >= c0051a3.f3377b) {
                                c0051a2.f3377b = i18 - c0051a3.f3379d;
                            }
                            i19 = c0051a2.f3379d;
                            if (i19 >= c0051a3.f3377b) {
                                c0051a2.f3379d = i19 - c0051a3.f3379d;
                            }
                        }
                        arrayList.set(size, c0051a3);
                        if (c0051a2.f3377b != c0051a2.f3379d) {
                            arrayList.set(i26, c0051a2);
                        } else {
                            arrayList.remove(i26);
                        }
                        if (c0051a != null) {
                            arrayList.add(size, c0051a);
                        }
                    }
                }
                obj = null;
                c0051a = null;
                if (z11) {
                    arrayList.set(size, c0051a3);
                    arrayList.remove(i26);
                    c0051a2.f3378c = obj;
                    dVar.b(c0051a2);
                } else {
                    if (z10) {
                        if (c0051a != null) {
                            i24 = c0051a2.f3377b;
                            if (i24 > c0051a.f3377b) {
                                c0051a2.f3377b = i24 - c0051a.f3379d;
                            }
                            i25 = c0051a2.f3379d;
                            if (i25 > c0051a.f3377b) {
                                c0051a2.f3379d = i25 - c0051a.f3379d;
                            }
                        }
                        i22 = c0051a2.f3377b;
                        if (i22 > c0051a3.f3377b) {
                            c0051a2.f3377b = i22 - c0051a3.f3379d;
                        }
                        i23 = c0051a2.f3379d;
                        if (i23 > c0051a3.f3377b) {
                            c0051a2.f3379d = i23 - c0051a3.f3379d;
                        }
                    } else {
                        if (c0051a != null) {
                            i20 = c0051a2.f3377b;
                            if (i20 >= c0051a.f3377b) {
                                c0051a2.f3377b = i20 - c0051a.f3379d;
                            }
                            i21 = c0051a2.f3379d;
                            if (i21 >= c0051a.f3377b) {
                                c0051a2.f3379d = i21 - c0051a.f3379d;
                            }
                        }
                        i18 = c0051a2.f3377b;
                        if (i18 >= c0051a3.f3377b) {
                            c0051a2.f3377b = i18 - c0051a3.f3379d;
                        }
                        i19 = c0051a2.f3379d;
                        if (i19 >= c0051a3.f3377b) {
                            c0051a2.f3379d = i19 - c0051a3.f3379d;
                        }
                    }
                    arrayList.set(size, c0051a3);
                    if (c0051a2.f3377b != c0051a2.f3379d) {
                        arrayList.set(i26, c0051a2);
                    } else {
                        arrayList.remove(i26);
                    }
                    if (c0051a != null) {
                        arrayList.add(size, c0051a);
                    }
                }
            } else if (i27 == 4) {
                int i40 = c0051a2.f3379d;
                int i41 = c0051a3.f3377b;
                if (i40 < i41) {
                    c0051a3.f3377b = i41 - 1;
                } else {
                    int i42 = c0051a3.f3379d;
                    if (i40 < i41 + i42) {
                        c0051a3.f3379d = i42 - 1;
                        c0051aH = aVar.h(c0051a3.f3378c, 4, c0051a2.f3377b, 1);
                    }
                    i15 = c0051a2.f3377b;
                    i16 = c0051a3.f3377b;
                    if (i15 <= i16) {
                        c0051a3.f3377b = i16 + 1;
                    } else {
                        i17 = i16 + c0051a3.f3379d;
                        if (i15 < i17) {
                            int i43 = i17 - i15;
                            c0051aH2 = aVar.h(c0051a3.f3378c, 4, i15 + 1, i43);
                            c0051a3.f3379d -= i43;
                        }
                        arrayList.set(i26, c0051a2);
                        if (c0051a3.f3379d > 0) {
                            arrayList.set(size, c0051a3);
                        } else {
                            arrayList.remove(size);
                            c0051a3.f3378c = null;
                            dVar.b(c0051a3);
                        }
                        if (c0051aH != null) {
                            arrayList.add(size, c0051aH);
                        }
                        if (c0051aH2 != null) {
                            arrayList.add(size, c0051aH2);
                        }
                    }
                    c0051aH2 = null;
                    arrayList.set(i26, c0051a2);
                    if (c0051a3.f3379d > 0) {
                        arrayList.set(size, c0051a3);
                    } else {
                        arrayList.remove(size);
                        c0051a3.f3378c = null;
                        dVar.b(c0051a3);
                    }
                    if (c0051aH != null) {
                        arrayList.add(size, c0051aH);
                    }
                    if (c0051aH2 != null) {
                        arrayList.add(size, c0051aH2);
                    }
                }
                c0051aH = null;
                i15 = c0051a2.f3377b;
                i16 = c0051a3.f3377b;
                if (i15 <= i16) {
                    c0051a3.f3377b = i16 + 1;
                } else {
                    i17 = i16 + c0051a3.f3379d;
                    if (i15 < i17) {
                        int i44 = i17 - i15;
                        c0051aH2 = aVar.h(c0051a3.f3378c, 4, i15 + 1, i44);
                        c0051a3.f3379d -= i44;
                    }
                    arrayList.set(i26, c0051a2);
                    if (c0051a3.f3379d > 0) {
                        arrayList.set(size, c0051a3);
                    } else {
                        arrayList.remove(size);
                        c0051a3.f3378c = null;
                        dVar.b(c0051a3);
                    }
                    if (c0051aH != null) {
                        arrayList.add(size, c0051aH);
                    }
                    if (c0051aH2 != null) {
                        arrayList.add(size, c0051aH2);
                    }
                }
                c0051aH2 = null;
                arrayList.set(i26, c0051a2);
                if (c0051a3.f3379d > 0) {
                    arrayList.set(size, c0051a3);
                } else {
                    arrayList.remove(size);
                    c0051a3.f3378c = null;
                    dVar.b(c0051a3);
                }
                if (c0051aH != null) {
                    arrayList.add(size, c0051aH);
                }
                if (c0051aH2 != null) {
                    arrayList.add(size, c0051aH2);
                }
            }
        }
        int size2 = arrayList.size();
        int i45 = 0;
        while (i45 < size2) {
            C0051a c0051aH4 = arrayList.get(i45);
            int i46 = c0051aH4.f3376a;
            if (i46 != i10) {
                v0.d dVar2 = this.f3370a;
                t tVar = this.f3373d;
                if (i46 != 2) {
                    if (i46 == 4) {
                        int i47 = c0051aH4.f3377b;
                        int i48 = c0051aH4.f3379d + i47;
                        int i49 = -1;
                        int i50 = i47;
                        int i51 = 0;
                        while (i47 < i48) {
                            if (tVar.b(i47) != null || a(i47)) {
                                if (i49 == 0) {
                                    d(h(c0051aH4.f3378c, 4, i50, i51));
                                    i50 = i47;
                                    i51 = 0;
                                }
                                i49 = i10;
                            } else {
                                if (i49 == i10) {
                                    i(h(c0051aH4.f3378c, 4, i50, i51));
                                    i50 = i47;
                                    i51 = 0;
                                }
                                i49 = 0;
                            }
                            i51 += i10;
                            i47++;
                        }
                        if (i51 != c0051aH4.f3379d) {
                            Object obj2 = c0051aH4.f3378c;
                            c0051aH4.f3378c = null;
                            dVar2.b(c0051aH4);
                            c0051aH4 = h(obj2, 4, i50, i51);
                        }
                        if (i49 == 0) {
                            d(c0051aH4);
                        } else {
                            i(c0051aH4);
                        }
                    } else if (i46 == i11) {
                        i(c0051aH4);
                    }
                    i12 = i10;
                } else {
                    int i52 = c0051aH4.f3377b;
                    int i53 = c0051aH4.f3379d + i52;
                    int i54 = i52;
                    int i55 = -1;
                    int i56 = 0;
                    while (i54 < i53) {
                        if (tVar.b(i54) != null || a(i54)) {
                            i13 = i10;
                            if (i55 == 0) {
                                d(h(null, 2, i52, i56));
                                i14 = i13;
                            } else {
                                i14 = 0;
                            }
                            i55 = i13;
                        } else {
                            i13 = i10;
                            if (i55 == i10) {
                                i(h(null, 2, i52, i56));
                                i14 = i13;
                            } else {
                                i14 = 0;
                            }
                            i55 = 0;
                        }
                        if (i14 != 0) {
                            i54 -= i56;
                            i53 -= i56;
                            i56 = i13;
                        } else {
                            i56++;
                        }
                        i54++;
                        i10 = i13;
                    }
                    i12 = i10;
                    if (i56 != c0051aH4.f3379d) {
                        c0051aH4.f3378c = null;
                        dVar2.b(c0051aH4);
                        c0051aH4 = h(null, 2, i52, i56);
                    }
                    if (i55 == 0) {
                        d(c0051aH4);
                    } else {
                        i(c0051aH4);
                    }
                }
            } else {
                i12 = i10;
                i(c0051aH4);
            }
            i45++;
            i10 = i12;
            i11 = 8;
        }
        arrayList.clear();
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0051a c0051a = (C0051a) arrayList.get(i10);
            c0051a.f3378c = null;
            this.f3370a.b(c0051a);
        }
        arrayList.clear();
    }

    public final int l(int i10, int i11) {
        int i12;
        int i13;
        ArrayList<C0051a> arrayList = this.f3372c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0051a c0051a = arrayList.get(size);
            int i14 = c0051a.f3376a;
            if (i14 == 8) {
                int i15 = c0051a.f3377b;
                int i16 = c0051a.f3379d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            c0051a.f3377b = i15 + 1;
                            c0051a.f3379d = i16 + 1;
                        } else if (i11 == 2) {
                            c0051a.f3377b = i15 - 1;
                            c0051a.f3379d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        c0051a.f3379d = i16 + 1;
                    } else if (i11 == 2) {
                        c0051a.f3379d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        c0051a.f3377b = i15 + 1;
                    } else if (i11 == 2) {
                        c0051a.f3377b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = c0051a.f3377b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= c0051a.f3379d;
                    } else if (i14 == 2) {
                        i10 += c0051a.f3379d;
                    }
                } else if (i11 == 1) {
                    c0051a.f3377b = i17 + 1;
                } else if (i11 == 2) {
                    c0051a.f3377b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0051a c0051a2 = arrayList.get(size2);
            int i18 = c0051a2.f3376a;
            v0.d dVar = this.f3370a;
            if (i18 == 8) {
                int i19 = c0051a2.f3379d;
                if (i19 == c0051a2.f3377b || i19 < 0) {
                    arrayList.remove(size2);
                    c0051a2.f3378c = null;
                    dVar.b(c0051a2);
                }
            } else if (c0051a2.f3379d <= 0) {
                arrayList.remove(size2);
                c0051a2.f3378c = null;
                dVar.b(c0051a2);
            }
        }
        return i10;
    }
}
