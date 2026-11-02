package d3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f24803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f24804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f24806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24807e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f24808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f24809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f24810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f24811d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f24812e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f24813f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean[] f24814g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f24815h;

        public final boolean a() {
            return this.f24811d > 15 && this.f24815h == 0;
        }

        public final void b(long j10) {
            long j11 = this.f24811d;
            if (j11 == 0) {
                this.f24808a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f24808a;
                this.f24809b = j12;
                this.f24813f = j12;
                this.f24812e = 1L;
            } else {
                long j13 = j10 - this.f24810c;
                int i10 = (int) (j11 % 15);
                long jAbs = Math.abs(j13 - this.f24809b);
                boolean[] zArr = this.f24814g;
                if (jAbs <= 1000000) {
                    this.f24812e++;
                    this.f24813f += j13;
                    if (zArr[i10]) {
                        zArr[i10] = false;
                        this.f24815h--;
                    }
                } else if (!zArr[i10]) {
                    zArr[i10] = true;
                    this.f24815h++;
                }
            }
            this.f24811d++;
            this.f24810c = j10;
        }

        public final void c() {
            this.f24811d = 0L;
            this.f24812e = 0L;
            this.f24813f = 0L;
            this.f24815h = 0;
            Arrays.fill(this.f24814g, false);
        }
    }
}
