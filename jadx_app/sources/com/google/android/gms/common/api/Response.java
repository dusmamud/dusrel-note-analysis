package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes.dex */
public class Response<T extends Result> {
    private Result zza;

    public Response() {
    }

    public T getResult() {
        return (T) this.zza;
    }

    public void setResult(T t6) {
        this.zza = t6;
    }

    public Response(T t6) {
        this.zza = t6;
    }
}
