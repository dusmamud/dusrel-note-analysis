package r2;

import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class x implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f33765a;

    public x(MediaCodec mediaCodec) {
        this.f33765a = mediaCodec;
    }

    @Override // r2.j
    public final void a(Bundle bundle) {
        this.f33765a.setParameters(bundle);
    }

    @Override // r2.j
    public final void b(int i10, int i11, int i12, long j10) {
        this.f33765a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override // r2.j
    public final void c(int i10, h2.c cVar, long j10, int i11) {
        this.f33765a.queueSecureInputBuffer(i10, 0, cVar.f27554i, j10, i11);
    }

    @Override // r2.j
    public final void d() {
    }

    @Override // r2.j
    public final void flush() {
    }

    @Override // r2.j
    public final void shutdown() {
    }

    @Override // r2.j
    public final void start() {
    }
}
