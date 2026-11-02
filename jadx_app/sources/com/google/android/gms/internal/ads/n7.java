package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f13202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataOutputStream f13203b;

    public n7() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f13202a = byteArrayOutputStream;
        this.f13203b = new DataOutputStream(byteArrayOutputStream);
    }
}
