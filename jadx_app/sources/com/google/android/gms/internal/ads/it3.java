package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
public final class it3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht3 f10974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mt3 f10976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f10979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f10981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f10982i;

    public it3(AudioTrack audioTrack, mt3 mt3Var) {
        this.f10974a = new ht3(audioTrack);
        this.f10975b = audioTrack.getSampleRate();
        this.f10976c = mt3Var;
        a(0);
    }

    public final void a(int i10) {
        this.f10977d = i10;
        long j10 = 10000;
        if (i10 == 0) {
            this.f10980g = 0L;
            this.f10981h = -1L;
            this.f10982i = -9223372036854775807L;
            this.f10978e = System.nanoTime() / 1000;
        } else {
            if (i10 == 1) {
                this.f10979f = 10000L;
                return;
            }
            j10 = (i10 == 2 || i10 == 3) ? 10000000L : 500000L;
        }
        this.f10979f = j10;
    }
}
