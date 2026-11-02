package io.flutter.embedding.engine.image;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.Size;
import io.flutter.Log;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
class ImageDecoderDefaultImpl implements ImageDecoder {
    private static final String TAG = "FlutterImageDecoderImplDefault";
    private final FlutterImageDecoder.HeaderListener listener;

    public ImageDecoderDefaultImpl(FlutterImageDecoder.HeaderListener headerListener) {
        this.listener = headerListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$decodeImage$0(android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source) {
        ColorSpace.Named unused = ColorSpace.Named.SRGB;
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        if (this.listener != null) {
            Size size = imageInfo.getSize();
            this.listener.onImageHeader(size.getWidth(), size.getHeight());
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [io.flutter.embedding.engine.image.b] */
    @Override // io.flutter.embedding.engine.image.ImageDecoder
    public Bitmap decodeImage(ByteBuffer byteBuffer, Metadata metadata) {
        try {
            return android.graphics.ImageDecoder.decodeBitmap(android.graphics.ImageDecoder.createSource(byteBuffer), new android.graphics.ImageDecoder.OnHeaderDecodedListener() { // from class: io.flutter.embedding.engine.image.b
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source) {
                    this.f28492a.lambda$decodeImage$0(imageDecoder, imageInfo, source);
                }
            });
        } catch (IOException e10) {
            Log.e(TAG, "Failed to decode image", e10);
            return null;
        }
    }
}
