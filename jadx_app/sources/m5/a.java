package m5;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f31171e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f31173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lock f31174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f31175d;

    public a(String str, File file, boolean z10) {
        Lock lock;
        this.f31172a = z10;
        this.f31173b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = f31171e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f31174c = lock;
    }

    public final void a(boolean z10) {
        this.f31174c.lock();
        if (z10) {
            File file = this.f31173b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f31175d = channel;
            } catch (IOException e10) {
                this.f31175d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f31175d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f31174c.unlock();
    }
}
