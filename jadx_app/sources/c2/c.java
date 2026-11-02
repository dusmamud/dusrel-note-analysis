package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b.a f4376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b.a f4377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b.a f4378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b.a f4379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f4380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f4381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4382h;

    public c() {
        ByteBuffer byteBuffer = b.f4370a;
        this.f4380f = byteBuffer;
        this.f4381g = byteBuffer;
        b.a aVar = b.a.f4371e;
        this.f4378d = aVar;
        this.f4379e = aVar;
        this.f4376b = aVar;
        this.f4377c = aVar;
    }

    public abstract b.a a(b.a aVar) throws b.C0072b;

    @Override // c2.b
    public boolean c() {
        return this.f4382h && this.f4381g == b.f4370a;
    }

    @Override // c2.b
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f4381g;
        this.f4381g = b.f4370a;
        return byteBuffer;
    }

    @Override // c2.b
    public final b.a f(b.a aVar) throws b.C0072b {
        this.f4378d = aVar;
        this.f4379e = a(aVar);
        return isActive() ? this.f4379e : b.a.f4371e;
    }

    @Override // c2.b
    public final void flush() {
        this.f4381g = b.f4370a;
        this.f4382h = false;
        this.f4376b = this.f4378d;
        this.f4377c = this.f4379e;
        b();
    }

    @Override // c2.b
    public final void g() {
        this.f4382h = true;
        h();
    }

    @Override // c2.b
    public boolean isActive() {
        return this.f4379e != b.a.f4371e;
    }

    public final ByteBuffer j(int i10) {
        if (this.f4380f.capacity() < i10) {
            this.f4380f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f4380f.clear();
        }
        ByteBuffer byteBuffer = this.f4380f;
        this.f4381g = byteBuffer;
        return byteBuffer;
    }

    @Override // c2.b
    public final void reset() {
        flush();
        this.f4380f = b.f4370a;
        b.a aVar = b.a.f4371e;
        this.f4378d = aVar;
        this.f4379e = aVar;
        this.f4376b = aVar;
        this.f4377c = aVar;
        i();
    }

    public void b() {
    }

    public void h() {
    }

    public void i() {
    }
}
