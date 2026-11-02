package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f11338a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f11339b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f11340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ca.i8 f11341d;

    public jh0(Context context, ca.i8 i8Var) {
        this.f11340c = context;
        this.f11341d = i8Var;
    }

    public final synchronized void a(String str) {
        try {
            HashMap map = this.f11338a;
            if (map.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f11340c) : this.f11340c.getSharedPreferences(str, 0);
            gh0 gh0Var = new gh0(this, str);
            map.put(str, gh0Var);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(gh0Var);
        } catch (Throwable th) {
            throw th;
        }
    }
}
