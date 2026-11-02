package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.PushbackInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ht extends PushbackInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lt f10459a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht(lt ltVar, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        super(autoCloseInputStream, 1);
        this.f10459a = ltVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f10459a.f12563c.a();
        super.close();
    }
}
