package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ps3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14471d = 0;

    public final qs3 a() {
        if (this.f14468a || !(this.f14469b || this.f14470c)) {
            return new qs3(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }
}
