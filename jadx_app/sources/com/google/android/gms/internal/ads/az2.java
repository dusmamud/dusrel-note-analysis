package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class az2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f6983a = new CopyOnWriteArrayList();

    public static zy2 a(String str) throws GeneralSecurityException {
        for (zy2 zy2Var : f6983a) {
            if (zy2Var.zza()) {
                return zy2Var;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
