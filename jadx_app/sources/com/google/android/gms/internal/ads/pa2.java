package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class pa2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pa2 f14229a = new pa2();

    public static final void b(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                webView.evaluateJavascript(str, null);
            } catch (IllegalStateException unused) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
                sb2.append("javascript: ");
                sb2.append(str);
                webView.loadUrl(sb2.toString());
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    public final void a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("if(window.omidBridge!==undefined){omidBridge.");
            sb2.append(str);
            sb2.append("(");
            for (Object obj : objArr) {
                if (obj == null) {
                    sb2.append("null");
                } else if (obj instanceof String) {
                    String string = obj.toString();
                    if (string.startsWith("{")) {
                        sb2.append(string);
                    } else {
                        sb2.append('\"');
                        sb2.append(string);
                        sb2.append('\"');
                    }
                } else {
                    sb2.append(obj);
                }
                sb2.append(com.amazon.a.a.o.b.f.f5855a);
            }
            sb2.setLength(sb2.length() - 1);
            sb2.append(")}");
            String string2 = sb2.toString();
            Handler handler = webView.getHandler();
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            if (Looper.myLooper() == handler.getLooper()) {
                b(webView, string2);
            } else {
                handler.post(new r71(this, webView, string2));
            }
        }
    }
}
