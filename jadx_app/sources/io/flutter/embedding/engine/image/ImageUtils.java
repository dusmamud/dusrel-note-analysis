package io.flutter.embedding.engine.image;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import io.flutter.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
class ImageUtils {
    private static final String TAG = "ImageUtils";

    public static Bitmap applyFlipIfNeeded(Bitmap bitmap, int i10) {
        if (bitmap == null || !isFlipCase(i10)) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        if (i10 == 2 || i10 == 7) {
            matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
        } else {
            if (i10 != 4 && i10 != 5) {
                return bitmap;
            }
            matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        if (bitmapCreateBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static byte[] getBytes(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        byteBuffer.rewind();
        return bArr;
    }

    public static boolean isFlipCase(int i10) {
        switch (i10) {
            case 1:
            case 3:
            case 6:
            case 8:
                return false;
            case 2:
            case 4:
            case 5:
            case 7:
                return true;
            default:
                Log.e(TAG, "Unknown EXIF orientation: " + i10);
                return false;
        }
    }
}
