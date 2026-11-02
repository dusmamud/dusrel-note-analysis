package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class hs3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10458c;

    public final is3 a() {
        if (this.f10456a || !(this.f10457b || this.f10458c)) {
            return new is3(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
