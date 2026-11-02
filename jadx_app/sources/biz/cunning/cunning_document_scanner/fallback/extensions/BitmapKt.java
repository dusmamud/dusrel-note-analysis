package biz.cunning.cunning_document_scanner.fallback.extensions;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"saveToFile", "", "Landroid/graphics/Bitmap;", "file", "Ljava/io/File;", "quality", "", "changeByteCountByResizing", "targetBytes", "cunning_document_scanner_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class BitmapKt {
    public static final Bitmap changeByteCountByResizing(Bitmap bitmap, int i10) {
        j.e(bitmap, "<this>");
        double dSqrt = Math.sqrt(((double) i10) / ((double) bitmap.getByteCount()));
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (((double) bitmap.getWidth()) * dSqrt), (int) (((double) bitmap.getHeight()) * dSqrt), true);
        j.d(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        return bitmapCreateScaledBitmap;
    }

    public static final void saveToFile(Bitmap bitmap, File file, int i10) {
        j.e(bitmap, "<this>");
        j.e(file, "file");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        bitmap.compress(Bitmap.CompressFormat.JPEG, i10, fileOutputStream);
        fileOutputStream.close();
    }
}
