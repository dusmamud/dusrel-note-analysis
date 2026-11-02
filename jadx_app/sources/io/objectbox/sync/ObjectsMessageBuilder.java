package io.objectbox.sync;

/* JADX INFO: loaded from: classes2.dex */
public interface ObjectsMessageBuilder {
    ObjectsMessageBuilder addBytes(long j10, byte[] bArr, boolean z10);

    ObjectsMessageBuilder addString(long j10, String str);

    boolean send();
}
