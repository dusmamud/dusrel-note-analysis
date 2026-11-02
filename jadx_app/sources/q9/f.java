package q9;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AutomaticGainControl f33327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AcousticEchoCanceler f33328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NoiseSuppressor f33329c;

    @Override // java.lang.AutoCloseable
    public final void close() {
        AutomaticGainControl automaticGainControl = this.f33327a;
        if (automaticGainControl != null) {
            automaticGainControl.release();
        }
        AcousticEchoCanceler acousticEchoCanceler = this.f33328b;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
        }
        NoiseSuppressor noiseSuppressor = this.f33329c;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
        }
    }
}
