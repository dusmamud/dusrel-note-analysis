package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class e implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f4406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f4407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b.a f4408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b.a f4409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b.a f4410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b.a f4411h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4412i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f4413j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteBuffer f4414k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ShortBuffer f4415l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ByteBuffer f4416m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f4417n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f4418o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4419p;

    @Override // c2.b
    public final boolean c() {
        if (!this.f4419p) {
            return false;
        }
        d dVar = this.f4413j;
        return dVar == null || (dVar.f4395m * dVar.f4384b) * 2 == 0;
    }

    @Override // c2.b
    public final ByteBuffer d() {
        d dVar = this.f4413j;
        if (dVar != null) {
            int i10 = dVar.f4384b;
            int i11 = dVar.f4395m * i10 * 2;
            if (i11 > 0) {
                if (this.f4414k.capacity() < i11) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.f4414k = byteBufferOrder;
                    this.f4415l = byteBufferOrder.asShortBuffer();
                } else {
                    this.f4414k.clear();
                    this.f4415l.clear();
                }
                ShortBuffer shortBuffer = this.f4415l;
                int iMin = Math.min(shortBuffer.remaining() / i10, dVar.f4395m);
                int i12 = iMin * i10;
                shortBuffer.put(dVar.f4394l, 0, i12);
                int i13 = dVar.f4395m - iMin;
                dVar.f4395m = i13;
                short[] sArr = dVar.f4394l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f4418o += (long) i11;
                this.f4414k.limit(i11);
                this.f4416m = this.f4414k;
            }
        }
        ByteBuffer byteBuffer = this.f4416m;
        this.f4416m = b.f4370a;
        return byteBuffer;
    }

    @Override // c2.b
    public final void e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            d dVar = this.f4413j;
            dVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f4417n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i10 = dVar.f4384b;
            int i11 = iRemaining2 / i10;
            short[] sArrC = dVar.c(dVar.f4392j, dVar.f4393k, i11);
            dVar.f4392j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, dVar.f4393k * i10, ((i11 * i10) * 2) / 2);
            dVar.f4393k += i11;
            dVar.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // c2.b
    public final b.a f(b.a aVar) throws b.C0072b {
        if (aVar.f4374c != 2) {
            throw new b.C0072b(aVar);
        }
        int i10 = this.f4405b;
        if (i10 == -1) {
            i10 = aVar.f4372a;
        }
        this.f4408e = aVar;
        b.a aVar2 = new b.a(i10, aVar.f4373b, 2);
        this.f4409f = aVar2;
        this.f4412i = true;
        return aVar2;
    }

    @Override // c2.b
    public final void flush() {
        if (isActive()) {
            b.a aVar = this.f4408e;
            this.f4410g = aVar;
            b.a aVar2 = this.f4409f;
            this.f4411h = aVar2;
            if (this.f4412i) {
                this.f4413j = new d(aVar.f4372a, aVar.f4373b, this.f4406c, this.f4407d, aVar2.f4372a);
            } else {
                d dVar = this.f4413j;
                if (dVar != null) {
                    dVar.f4393k = 0;
                    dVar.f4395m = 0;
                    dVar.f4397o = 0;
                    dVar.f4398p = 0;
                    dVar.f4399q = 0;
                    dVar.f4400r = 0;
                    dVar.f4401s = 0;
                    dVar.f4402t = 0;
                    dVar.f4403u = 0;
                    dVar.f4404v = 0;
                }
            }
        }
        this.f4416m = b.f4370a;
        this.f4417n = 0L;
        this.f4418o = 0L;
        this.f4419p = false;
    }

    @Override // c2.b
    public final void g() {
        d dVar = this.f4413j;
        if (dVar != null) {
            int i10 = dVar.f4393k;
            float f10 = dVar.f4385c;
            float f11 = dVar.f4386d;
            int i11 = dVar.f4395m + ((int) ((((i10 / (f10 / f11)) + dVar.f4397o) / (dVar.f4387e * f11)) + 0.5f));
            short[] sArr = dVar.f4392j;
            int i12 = dVar.f4390h * 2;
            dVar.f4392j = dVar.c(sArr, i10, i12 + i10);
            int i13 = 0;
            while (true) {
                int i14 = dVar.f4384b;
                if (i13 >= i12 * i14) {
                    break;
                }
                dVar.f4392j[(i14 * i10) + i13] = 0;
                i13++;
            }
            dVar.f4393k = i12 + dVar.f4393k;
            dVar.f();
            if (dVar.f4395m > i11) {
                dVar.f4395m = i11;
            }
            dVar.f4393k = 0;
            dVar.f4400r = 0;
            dVar.f4397o = 0;
        }
        this.f4419p = true;
    }

    @Override // c2.b
    public final boolean isActive() {
        if (this.f4409f.f4372a != -1) {
            return Math.abs(this.f4406c - 1.0f) >= 1.0E-4f || Math.abs(this.f4407d - 1.0f) >= 1.0E-4f || this.f4409f.f4372a != this.f4408e.f4372a;
        }
        return false;
    }

    @Override // c2.b
    public final void reset() {
        this.f4406c = 1.0f;
        this.f4407d = 1.0f;
        b.a aVar = b.a.f4371e;
        this.f4408e = aVar;
        this.f4409f = aVar;
        this.f4410g = aVar;
        this.f4411h = aVar;
        ByteBuffer byteBuffer = b.f4370a;
        this.f4414k = byteBuffer;
        this.f4415l = byteBuffer.asShortBuffer();
        this.f4416m = byteBuffer;
        this.f4405b = -1;
        this.f4412i = false;
        this.f4413j = null;
        this.f4417n = 0L;
        this.f4418o = 0L;
        this.f4419p = false;
    }
}
