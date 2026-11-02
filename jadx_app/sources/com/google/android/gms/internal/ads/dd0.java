package com.google.android.gms.internal.ads;

import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dd0 implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sf0 f8280a;

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final /* synthetic */ void onAudioFocusChange(int i10) {
        sf0 sf0Var = this.f8280a;
        sf0Var.getClass();
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2) {
                sf0Var.e(4);
                return;
            } else {
                sf0Var.f(0);
                sf0Var.e(3);
                return;
            }
        }
        if (i10 == -1) {
            sf0Var.f(-1);
            sf0Var.d();
            sf0Var.e(1);
        } else if (i10 != 1) {
            h5.a(new StringBuilder(String.valueOf(i10).length() + 27), "Unknown focus change type: ", i10, "AudioFocusManager");
        } else {
            sf0Var.e(2);
            sf0Var.f(1);
        }
    }
}
