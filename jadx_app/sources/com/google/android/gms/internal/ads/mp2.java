package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class mp2 extends kp2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12926b = Integer.numberOfLeadingZeros(31);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mp2 f12927c = new mp2("CharMatcher.whitespace()");

    @Override // com.google.android.gms.internal.ads.np2
    public final boolean a(char c10) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c10) >>> f12926b) == c10;
    }
}
