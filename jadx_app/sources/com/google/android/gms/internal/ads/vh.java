package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
public final class vh extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18023a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f18023a) {
            case 0:
                return ByteBuffer.allocate(32);
            case 1:
                try {
                    return (Cipher) ce3.f7830b.f7836a.zza("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
                GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
                gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
                simpleDateFormat.setCalendar(gregorianCalendar);
                return simpleDateFormat;
        }
    }
}
