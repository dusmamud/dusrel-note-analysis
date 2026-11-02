package com.google.mlkit.genai.common.audio;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes2.dex */
public class AudioSource {
    private final ParcelFileDescriptor zza;

    private AudioSource(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = parcelFileDescriptor;
    }

    public static AudioSource fromMic() {
        return new AudioSource(null);
    }

    public static AudioSource fromPfd(ParcelFileDescriptor parcelFileDescriptor) {
        return new AudioSource(parcelFileDescriptor);
    }

    @KeepForSdk
    public ParcelFileDescriptor getPfd() {
        return this.zza;
    }
}
