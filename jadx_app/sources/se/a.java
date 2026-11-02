package se;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f34232a = {0, 0, -92, -127};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f34233b = {0, 0, -19, 65};

    public static boolean a(String str) {
        return str.endsWith(DomExceptionUtils.SEPARATOR) || str.endsWith("\\");
    }
}
