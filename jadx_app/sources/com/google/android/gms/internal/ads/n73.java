package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface n73 extends jo3 {
    long a(gb3 gb3Var) throws IOException;

    void c(bo3 bo3Var);

    Uri zzc();

    void zzd() throws IOException;

    default Map zzj() {
        return Collections.EMPTY_MAP;
    }
}
