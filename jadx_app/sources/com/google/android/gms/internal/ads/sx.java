package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.StrictMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class sx implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f16153g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16147a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConditionVariable f16148b = new ConditionVariable();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f16149c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f16150d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences f16151e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f16152f = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public JSONObject f16154h = new JSONObject();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16155i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f16156j = false;

    public final Object a(nx nxVar) {
        if (!this.f16148b.block(5000L)) {
            synchronized (this.f16147a) {
                try {
                    if (!this.f16150d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (!this.f16149c || this.f16151e == null || this.f16156j) {
            synchronized (this.f16147a) {
                if (this.f16149c && this.f16151e != null && !this.f16156j) {
                }
                return nxVar.e();
            }
        }
        int i10 = nxVar.f13547a;
        if (i10 == 2) {
            Bundle bundle = this.f16152f;
            return bundle == null ? nxVar.e() : nxVar.a(bundle);
        }
        if (i10 == 1 && this.f16154h.has(nxVar.f13548b)) {
            return nxVar.c(this.f16154h);
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return nxVar.d(this.f16151e);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final Object b(nx nxVar) {
        return (this.f16149c || this.f16150d) ? a(nxVar) : nxVar.e();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (!"flag_configuration".equals(str) || sharedPreferences == null) {
            return;
        }
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                String string = sharedPreferences.getString("flag_configuration", "{}");
                StrictMode.setThreadPolicy(threadPolicy);
                this.f16154h = new JSONObject(string);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (JSONException unused) {
        }
    }
}
