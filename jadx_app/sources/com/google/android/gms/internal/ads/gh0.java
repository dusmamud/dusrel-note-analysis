package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class gh0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jh0 f9755b;

    public gh0(jh0 jh0Var, String str) {
        Objects.requireNonNull(jh0Var);
        this.f9755b = jh0Var;
        this.f9754a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        jh0 jh0Var = this.f9755b;
        synchronized (jh0Var) {
            try {
                ArrayList arrayList = jh0Var.f11339b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((hh0) obj).zza(this.f9754a, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
