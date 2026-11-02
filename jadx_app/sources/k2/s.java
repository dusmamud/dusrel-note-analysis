package k2;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f29736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f29738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f29739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f29740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f29741f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioTrack f29742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioTimestamp f29743b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f29744c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f29745d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f29746e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f29747f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f29748g;

        public a(AudioTrack audioTrack) {
            this.f29742a = audioTrack;
        }
    }

    public s(AudioTrack audioTrack) {
        this.f29736a = new a(audioTrack);
        a();
    }

    public final void a() {
        if (this.f29736a != null) {
            b(0);
        }
    }

    public final void b(int i10) {
        this.f29737b = i10;
        if (i10 == 0) {
            this.f29740e = 0L;
            this.f29741f = -1L;
            this.f29738c = System.nanoTime() / 1000;
            this.f29739d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f29739d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f29739d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f29739d = 500000L;
        }
    }
}
