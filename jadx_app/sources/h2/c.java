package h2;

import android.media.MediaCodec;
import e2.d0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f27546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f27547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f27549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f27550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f27553h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f27554i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f27555j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f27556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f27557b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        public a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f27556a = cryptoInfo;
        }
    }

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f27554i = cryptoInfo;
        this.f27555j = d0.f25618a >= 24 ? new a(cryptoInfo) : null;
    }
}
