package com.google.mlkit.common.sdkinternal.model;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.mlkit.common.MlKitException;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public interface RemoteModelFileMover {
    @KeepForSdk
    File getModelFileDestination() throws MlKitException;

    @KeepForSdk
    File moveAllFilesFromPrivateTempToPrivateDestination(File file) throws MlKitException;
}
