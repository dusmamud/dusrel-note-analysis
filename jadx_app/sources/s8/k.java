package s8;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.lu0;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f34096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WindowManager f34097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f34098c = null;

    public k(Activity activity) {
        this.f34096a = activity;
        this.f34097b = (WindowManager) activity.getSystemService("window");
    }

    public final void a() {
        Log.i("HsdpLoadingPanel", "try to hideLoading");
        View view = this.f34098c;
        if (view == null) {
            return;
        }
        this.f34096a.runOnUiThread(new lu0(1, this, view));
    }

    public final boolean b() {
        return (this.f34096a.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
