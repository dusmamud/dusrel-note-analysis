package v0;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f35148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f35149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f35150c;

    public a(File file) {
        this.f35148a = file;
        this.f35149b = new File(file.getPath() + ".new");
        this.f35150c = new File(file.getPath() + ".bak");
    }

    public static void d(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public final void a(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e10) {
            Log.e("AtomicFile", "Failed to close file output stream", e10);
        }
        File file = this.f35149b;
        if (file.delete()) {
            return;
        }
        Log.e("AtomicFile", "Failed to delete new file " + file);
    }

    public final void b(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e10) {
            Log.e("AtomicFile", "Failed to close file output stream", e10);
        }
        d(this.f35149b, this.f35148a);
    }

    public final byte[] c() throws IOException {
        File file = this.f35150c;
        boolean zExists = file.exists();
        File file2 = this.f35148a;
        if (zExists) {
            d(file, file2);
        }
        File file3 = this.f35149b;
        if (file3.exists() && file2.exists() && !file3.delete()) {
            Log.e("AtomicFile", "Failed to delete outdated new file " + file3);
        }
        FileInputStream fileInputStream = new FileInputStream(file2);
        try {
            byte[] bArr = new byte[fileInputStream.available()];
            int i10 = 0;
            while (true) {
                int i11 = fileInputStream.read(bArr, i10, bArr.length - i10);
                if (i11 <= 0) {
                    fileInputStream.close();
                    return bArr;
                }
                i10 += i11;
                int iAvailable = fileInputStream.available();
                if (iAvailable > bArr.length - i10) {
                    byte[] bArr2 = new byte[iAvailable + i10];
                    System.arraycopy(bArr, 0, bArr2, 0, i10);
                    bArr = bArr2;
                }
            }
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    public final FileOutputStream e() throws IOException {
        File file = this.f35149b;
        File file2 = this.f35150c;
        if (file2.exists()) {
            d(file2, this.f35148a);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + file);
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e10) {
                throw new IOException("Failed to create new file " + file, e10);
            }
        }
    }
}
