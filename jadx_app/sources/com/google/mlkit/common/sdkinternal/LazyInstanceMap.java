package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public abstract class LazyInstanceMap<K, V> {
    private final Map zza = new HashMap();

    @KeepForSdk
    public abstract V create(K k10);

    @KeepForSdk
    public V get(K k10) {
        synchronized (this.zza) {
            try {
                if (this.zza.containsKey(k10)) {
                    return (V) this.zza.get(k10);
                }
                V vCreate = create(k10);
                this.zza.put(k10, vCreate);
                return vCreate;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
