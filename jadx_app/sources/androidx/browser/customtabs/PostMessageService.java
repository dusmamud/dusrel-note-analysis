package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import c.f;

/* JADX INFO: loaded from: classes.dex */
public class PostMessageService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f1230a;

    public class a extends f.a {
    }

    public PostMessageService() {
        a aVar = new a();
        aVar.attachInterface(aVar, f.O);
        this.f1230a = aVar;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f1230a;
    }
}
