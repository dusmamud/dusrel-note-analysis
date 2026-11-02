package com.google.mlkit.common.sdkinternal.model;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class URLWrapper {
    private final URL zza;

    @KeepForSdk
    public URLWrapper(String str) throws MalformedURLException {
        this.zza = new URL(str);
    }

    @KeepForSdk
    public URLConnection openConnection() throws IOException {
        return this.zza.openConnection();
    }
}
