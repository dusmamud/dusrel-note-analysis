package w0;

import android.view.View;
import android.view.Window;
import io.objectbox.model.PropertyFlags;

/* JADX INFO: loaded from: classes.dex */
public class g1 extends f1 {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.hf
    public final void g(boolean z10) {
        Window window = this.f35500a;
        if (!z10) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | PropertyFlags.UNSIGNED);
        }
    }
}
