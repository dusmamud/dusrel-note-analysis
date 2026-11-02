package com.google.android.gms.internal.auth;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f20499a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f20500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f20501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f20502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static HashMap f20503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f20504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f20505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f20506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap f20507i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Object f20508j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f20509k;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        f20500b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        f20501c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
        f20502d = new AtomicBoolean();
        f20504f = new HashMap(16, 1.0f);
        f20505g = new HashMap(16, 1.0f);
        f20506h = new HashMap(16, 1.0f);
        f20507i = new HashMap(16, 1.0f);
        f20509k = new String[0];
    }
}
