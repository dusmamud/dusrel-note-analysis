package w0;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class h1 extends g1 {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.hf
    public final void f(boolean z10) {
        Window window = this.f35500a;
        if (!z10) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }
}
