package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class of3 extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f13773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nf3 f13774b = new nf3();

    public of3(StringBuilder sb2) {
        this.f13773a = sb2;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) throws IOException {
        this.f13773a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) throws IOException {
        nf3 nf3Var = this.f13774b;
        nf3Var.f13305a = cArr;
        nf3Var.f13306b = null;
        this.f13773a.append((CharSequence) nf3Var, i10, i11 + i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
        this.f13773a.append(charSequence, i10, i11);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
        append(charSequence, i10, i11);
        return this;
    }

    @Override // java.io.Writer
    public final void write(int i10) throws IOException {
        this.f13773a.append((char) i10);
    }

    @Override // java.io.Writer
    public final void write(String str, int i10, int i11) throws IOException {
        Objects.requireNonNull(str);
        this.f13773a.append((CharSequence) str, i10, i11 + i10);
    }
}
