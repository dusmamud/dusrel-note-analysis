package io.objectbox;

import androidx.media3.exoplayer.dash.DashMediaSource;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28920b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f28919a = i10;
        this.f28920b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28919a) {
            case 0:
                BoxStore.lambda$isFileOpen$0((String) this.f28920b);
                break;
            default:
                ((DashMediaSource) this.f28920b).C(false);
                break;
        }
    }
}
