package com.google.mlkit.genai.common;

/* JADX INFO: loaded from: classes2.dex */
public interface DownloadCallback {
    void onDownloadCompleted();

    void onDownloadFailed(GenAiException genAiException);

    void onDownloadProgress(long j10);

    void onDownloadStarted(long j10);
}
