package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r71 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15206a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15208c;

    public /* synthetic */ r71(v71 v71Var, f91 f91Var) {
        this.f15207b = v71Var;
        this.f15208c = f91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15206a) {
            case 0:
                ((v71) this.f15207b).h((f91) this.f15208c);
                break;
            default:
                pa2.b((WebView) this.f15207b, (String) this.f15208c);
                break;
        }
    }

    public r71(pa2 pa2Var, WebView webView, String str) {
        this.f15207b = webView;
        this.f15208c = str;
    }
}
