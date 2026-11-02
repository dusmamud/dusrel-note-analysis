package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class jf2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static jf2 f11310c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f11312b;

    public jf2(Context context) {
        this.f11311a = context.getPackageName();
        this.f11312b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public final void a(Object obj, String str) throws IOException {
        boolean zCommit;
        boolean z10 = obj instanceof String;
        String str2 = this.f11311a;
        SharedPreferences sharedPreferences = this.f11312b;
        if (z10) {
            zCommit = sharedPreferences.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            zCommit = sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else {
            if (!(obj instanceof Boolean)) {
                if (obj instanceof Integer) {
                    zCommit = sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).commit();
                } else {
                    String strValueOf = String.valueOf(obj.getClass());
                    Log.e("GpidLifecycleSPHandler", ki.c(new StringBuilder(strValueOf.length() + 33 + String.valueOf(str2).length()), "Unexpected object class ", strValueOf, " for app ", str2));
                }
                throw new IOException(ki.c(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
            }
            zCommit = sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        }
        if (zCommit) {
            return;
        }
        throw new IOException(ki.c(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
    }

    public final void b(String str) throws IOException {
        if (this.f11312b.edit().remove(str).commit()) {
            return;
        }
        int length = str.length();
        String str2 = this.f11311a;
        throw new IOException(ki.c(new StringBuilder(length + 26 + String.valueOf(str2).length()), "Failed to remove ", str, " for app ", str2));
    }
}
