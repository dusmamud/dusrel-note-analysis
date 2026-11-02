package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import k0.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f1898a = new a();

    public class a extends c.a {
        public a() {
            attachInterface(this, c.f29622a0);
        }
    }

    public abstract void a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f1898a;
    }
}
