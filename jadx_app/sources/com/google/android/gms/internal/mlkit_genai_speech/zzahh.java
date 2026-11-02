package com.google.android.gms.internal.mlkit_genai_speech;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahh extends LinkedHashMap {
    private static final zzahh zza;
    private boolean zzb;

    static {
        zzahh zzahhVar = new zzahh();
        zza = zzahhVar;
        zzahhVar.zzb = false;
    }

    private zzahh() {
        this.zzb = true;
    }

    public static zzahh zza() {
        return zza;
    }

    private static int zzf(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof zzagi) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iZzb = zzagp.zzb(length, bArr, 0, length);
        if (iZzb == 0) {
            return 1;
        }
        return iZzb;
    }

    private final void zzg() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzg();
        super.clear();
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
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
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
        Iterator it = entrySet().iterator();
        int iZzf = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iZzf += zzf(entry.getValue()) ^ zzf(entry.getKey());
        }
        return iZzf;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        zzg();
        byte[] bArr = zzagp.zzb;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        zzg();
        for (Object obj : map.keySet()) {
            byte[] bArr = zzagp.zzb;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzg();
        return super.remove(obj);
    }

    public final zzahh zzb() {
        return isEmpty() ? new zzahh() : new zzahh(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zzahh zzahhVar) {
        zzg();
        if (zzahhVar.isEmpty()) {
            return;
        }
        putAll(zzahhVar);
    }

    public final boolean zze() {
        return this.zzb;
    }

    private zzahh(Map map) {
        super(map);
        this.zzb = true;
    }
}
