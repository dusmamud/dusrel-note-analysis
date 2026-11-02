package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class b9 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21182a;

    public static d9 a() {
        return new d9("Protocol message tag had invalid wire type.");
    }

    public static b9 b() {
        return new b9("Protocol message contained an invalid tag (zero).");
    }

    public static b9 c() {
        return new b9("Protocol message had invalid UTF-8.");
    }

    public static b9 d() {
        return new b9("CodedInputStream encountered a malformed varint.");
    }

    public static b9 e() {
        return new b9("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static b9 f() {
        return new b9("Failed to parse the message.");
    }

    public static b9 g() {
        return new b9("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
