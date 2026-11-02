package com.google.android.gms.internal.consent_sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f21072a;

    public static synchronized String a(Context context) {
        String str;
        try {
            if (f21072a == null) {
                ContentResolver contentResolver = context.getContentResolver();
                String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
                if (string == null || f1.a()) {
                    string = "emulator";
                }
                int i10 = 0;
                while (true) {
                    if (i10 < 3) {
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                            messageDigest.update(string.getBytes());
                            str = String.format("%032X", new BigInteger(1, messageDigest.digest()));
                            break;
                        } catch (ArithmeticException unused) {
                            str = "";
                            break;
                        } catch (NoSuchAlgorithmException unused2) {
                            i10++;
                        }
                    }
                    str = "";
                    break;
                }
                f21072a = str;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f21072a;
    }
}
