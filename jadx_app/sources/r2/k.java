package r2;

import android.media.MediaCodec;
import e2.d0;

/* JADX INFO: loaded from: classes.dex */
public class k extends h2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33701a;

    public k(IllegalStateException illegalStateException, l lVar) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        String diagnosticInfo = null;
        sb2.append(lVar == null ? null : lVar.f33702a);
        super(sb2.toString(), illegalStateException);
        int i10 = d0.f25618a;
        if (i10 >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f33701a = i10 >= 23 ? illegalStateException instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0 : d0.u(diagnosticInfo);
    }
}
