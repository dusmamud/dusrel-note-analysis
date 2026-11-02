package io.flutter.embedding.engine.dart;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface PlatformMessageHandler {
    void handleMessageFromDart(String str, ByteBuffer byteBuffer, int i10, long j10);

    void handlePlatformMessageResponse(int i10, ByteBuffer byteBuffer);
}
