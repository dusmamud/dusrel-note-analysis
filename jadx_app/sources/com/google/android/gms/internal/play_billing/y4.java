package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class y4 extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y4 f22846b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22847a = true;

    static {
        y4 y4Var = new y4();
        f22846b = y4Var;
        y4Var.f22847a = false;
    }

    public static int c(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof e4) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iA = j4.a(length, bArr, 0, length);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final y4 b() {
        if (isEmpty()) {
            return new y4();
        }
        y4 y4Var = new y4(this);
        y4Var.f22847a = true;
        return y4Var;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        d();
        super.clear();
    }

    public final void d() {
        if (!this.f22847a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iC = 0;
        for (Map.Entry entry : entrySet()) {
            iC += c(entry.getValue()) ^ c(entry.getKey());
        }
        return iC;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        d();
        Charset charset = j4.f22718a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        d();
        for (Object obj : map.keySet()) {
            Charset charset = j4.f22718a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        d();
        return super.remove(obj);
    }
}
