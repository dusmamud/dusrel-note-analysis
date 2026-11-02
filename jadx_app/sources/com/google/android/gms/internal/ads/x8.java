package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class x8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f18920a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f18921b = "media3.common";

    public static synchronized void a(String str) {
        if (f18920a.add(str)) {
            String str2 = f18921b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(str);
            f18921b = sb2.toString();
        }
    }
}
