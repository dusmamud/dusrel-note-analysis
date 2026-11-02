package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class xn2 implements mn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f19256a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f19257b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f19258c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f19259d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f19260e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f19261f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f19262g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f19263h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f19264i = SystemClock.uptimeMillis();

    public static boolean d(View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object objInvoke = view.getClass().getMethod("getAdConfiguration", null).invoke(view, null);
            Integer num = (Integer) objInvoke.getClass().getField("adType").get(objInvoke);
            num.intValue();
            String str = (String) objInvoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            return str.contains("INTERSTITIAL") || str.contains("APP_OPEN") || str.contains("REWARDED");
        } catch (NullPointerException | ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.mn2
    public final synchronized void a(HashMap map) {
        this.f19263h = this.f19262g;
        this.f19262g = SystemClock.uptimeMillis();
        e(map);
    }

    @Override // com.google.android.gms.internal.ads.mn2
    public final synchronized void b(HashMap map) {
        this.f19257b = this.f19256a;
        this.f19256a = SystemClock.uptimeMillis();
        e(map);
    }

    @Override // com.google.android.gms.internal.ads.mn2
    public final synchronized void c(HashMap map, Context context, View view) {
        WindowManager windowManager;
        try {
            this.f19259d = this.f19258c;
            this.f19258c = SystemClock.uptimeMillis();
            long j10 = this.f19260e;
            if (j10 != -1) {
                this.f19261f = j10;
            }
            DisplayMetrics displayMetrics = null;
            if ((Build.VERSION.SDK_INT < 33 || context.isUiContext()) && (windowManager = (WindowManager) context.getSystemService("window")) != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                displayMetrics = new DisplayMetrics();
                try {
                    defaultDisplay.getRealMetrics(displayMetrics);
                } catch (NoSuchMethodError unused) {
                    defaultDisplay.getMetrics(displayMetrics);
                }
            }
            if (displayMetrics != null) {
                int i10 = displayMetrics.widthPixels * displayMetrics.heightPixels;
                if (view != null) {
                    int iMin = Math.min(view.getWidth(), displayMetrics.widthPixels) * Math.min(view.getHeight(), displayMetrics.heightPixels);
                    if (iMin + iMin >= i10 || (iMin == 0 && d(view))) {
                        this.f19260e = this.f19258c;
                    }
                }
                e(map);
            }
            this.f19260e = -1L;
            e(map);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void e(HashMap map) {
        map.put("tcq", Long.valueOf(this.f19256a));
        map.put("tpq", Long.valueOf(this.f19257b));
        map.put("tcc", Long.valueOf(this.f19262g));
        map.put("tpc", Long.valueOf(this.f19263h));
        map.put("tpv", Long.valueOf(this.f19259d));
        map.put("tcv", Long.valueOf(this.f19258c));
        map.put("tchv", Long.valueOf(this.f19260e));
        map.put("tphv", Long.valueOf(this.f19261f));
        map.put("tst", Long.valueOf(this.f19264i));
    }
}
