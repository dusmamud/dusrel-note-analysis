package ic;

import android.media.AudioManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f28440a;

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        r rVar = this.f28440a;
        if (i10 == -1) {
            rVar.a();
        }
        rVar.j("onAudioFocusChanged", Integer.valueOf(i10));
    }
}
