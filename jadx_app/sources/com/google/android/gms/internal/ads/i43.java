package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i43 f10604b = new i43();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f10605a = new HashMap();

    public final synchronized void a(String str, cz2 cz2Var) throws GeneralSecurityException {
        try {
            HashMap map = this.f10605a;
            if (!map.containsKey(str)) {
                map.put(str, cz2Var);
                return;
            }
            if (((cz2) map.get(str)).equals(cz2Var)) {
                return;
            }
            String strValueOf = String.valueOf(map.get(str));
            String strValueOf2 = String.valueOf(cz2Var);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 45 + strValueOf.length() + 17 + strValueOf2.length());
            sb2.append("Parameters object with name ");
            sb2.append(str);
            sb2.append(" already exists (");
            sb2.append(strValueOf);
            sb2.append("), cannot insert ");
            sb2.append(strValueOf2);
            throw new GeneralSecurityException(sb2.toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Map map) throws GeneralSecurityException {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (cz2) entry.getValue());
        }
    }
}
