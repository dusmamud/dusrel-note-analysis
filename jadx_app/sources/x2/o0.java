package x2;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public interface o0 {

    public static class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Random f36395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f36396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f36397c;

        public a() {
            this(new Random());
        }

        @Override // x2.o0
        public final a a(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = this.f36396b;
            int[] iArr2 = new int[iArr.length - i12];
            int i13 = 0;
            for (int i14 = 0; i14 < iArr.length; i14++) {
                int i15 = iArr[i14];
                if (i15 < i10 || i15 >= i11) {
                    int i16 = i14 - i13;
                    if (i15 >= i10) {
                        i15 -= i12;
                    }
                    iArr2[i16] = i15;
                } else {
                    i13++;
                }
            }
            return new a(iArr2, new Random(this.f36395a.nextLong()));
        }

        @Override // x2.o0
        public final int b() {
            int[] iArr = this.f36396b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // x2.o0
        public final int c(int i10) {
            int i11 = this.f36397c[i10] - 1;
            if (i11 >= 0) {
                return this.f36396b[i11];
            }
            return -1;
        }

        @Override // x2.o0
        public final int d(int i10) {
            int i11 = this.f36397c[i10] + 1;
            int[] iArr = this.f36396b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // x2.o0
        public final a e(int i10, int i11) {
            int[] iArr;
            Random random;
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            int i12 = 0;
            while (true) {
                iArr = this.f36396b;
                random = this.f36395a;
                if (i12 >= i11) {
                    break;
                }
                iArr2[i12] = random.nextInt(iArr.length + 1);
                int i13 = i12 + 1;
                int iNextInt = random.nextInt(i13);
                iArr3[i12] = iArr3[iNextInt];
                iArr3[iNextInt] = i12 + i10;
                i12 = i13;
            }
            Arrays.sort(iArr2);
            int[] iArr4 = new int[iArr.length + i11];
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < iArr.length + i11; i16++) {
                if (i14 >= i11 || i15 != iArr2[i14]) {
                    int i17 = i15 + 1;
                    int i18 = iArr[i15];
                    iArr4[i16] = i18;
                    if (i18 >= i10) {
                        iArr4[i16] = i18 + i11;
                    }
                    i15 = i17;
                } else {
                    iArr4[i16] = iArr3[i14];
                    i14++;
                }
            }
            return new a(iArr4, new Random(random.nextLong()));
        }

        @Override // x2.o0
        public final int f() {
            int[] iArr = this.f36396b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // x2.o0
        public final a g() {
            return new a(new Random(this.f36395a.nextLong()));
        }

        @Override // x2.o0
        public final int getLength() {
            return this.f36396b.length;
        }

        public a(int[] iArr, Random random) {
            this.f36396b = iArr;
            this.f36395a = random;
            this.f36397c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f36397c[iArr[i10]] = i10;
            }
        }

        public a(Random random) {
            this(new int[0], random);
        }
    }

    a a(int i10, int i11);

    int b();

    int c(int i10);

    int d(int i10);

    a e(int i10, int i11);

    int f();

    a g();

    int getLength();
}
