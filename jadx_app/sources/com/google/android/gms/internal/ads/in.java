package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class in {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f10864c = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f10865a = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dn f10866b;

    @Deprecated
    public in(dn dnVar) {
        this.f10866b = dnVar;
    }

    public static Uri d(Uri uri, String str) throws jn {
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals("ad.doubleclick.net") && uri.getPath().contains(";")) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new jn("Parameter already exists: dc_ms");
                    }
                    String string = uri.toString();
                    int iIndexOf = string.indexOf(";adurl");
                    if (iIndexOf != -1) {
                        int i10 = iIndexOf + 1;
                        return Uri.parse(string.substring(0, i10) + "dc_ms=" + str + ";" + string.substring(i10));
                    }
                    String encodedPath = uri.getEncodedPath();
                    int iIndexOf2 = string.indexOf(encodedPath);
                    return Uri.parse(string.substring(0, encodedPath.length() + iIndexOf2) + ";dc_ms=" + str + ";" + string.substring(iIndexOf2 + encodedPath.length()));
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new jn("Query parameter already exists: ms");
            }
            String string2 = uri.toString();
            int iIndexOf3 = string2.indexOf("&adurl");
            if (iIndexOf3 == -1) {
                iIndexOf3 = string2.indexOf("?adurl");
            }
            if (iIndexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i11 = iIndexOf3 + 1;
            return Uri.parse(string2.substring(0, i11) + "ms=" + str + "&" + string2.substring(i11));
        } catch (UnsupportedOperationException unused2) {
            throw new jn("Provided Uri is not in a valid state");
        }
    }

    public final boolean a(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.f10865a;
            for (int i10 = 0; i10 < 3; i10++) {
                if (host.endsWith(strArr[i10])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    @Deprecated
    public final Uri b(Uri uri, Context context, View view, Activity activity) throws jn {
        try {
            return d(uri, this.f10866b.zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new jn("Provided Uri is not in a valid state");
        }
    }

    public final boolean c(Uri uri) {
        if (a(uri)) {
            for (int i10 = 0; i10 < 3; i10++) {
                if (uri.getPath().endsWith(f10864c[i10])) {
                    return true;
                }
            }
        }
        return false;
    }
}
