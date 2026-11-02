package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public class uv3 extends go3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17329a;

    public uv3(IllegalStateException illegalStateException, vv3 vv3Var) {
        super("Decoder failed: ".concat(String.valueOf(vv3Var == null ? null : vv3Var.f18231a)), illegalStateException);
        boolean z10 = illegalStateException instanceof MediaCodec.CodecException;
        if (z10) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f17329a = z10 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
