package l5;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: loaded from: classes.dex */
public class i implements k5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f30707a;

    public i(SQLiteProgram delegate) {
        kotlin.jvm.internal.j.e(delegate, "delegate");
        this.f30707a = delegate;
    }

    @Override // k5.c
    public final void a(int i10, long j10) {
        this.f30707a.bindLong(i10, j10);
    }

    @Override // k5.c
    public final void b(byte[] bArr, int i10) {
        this.f30707a.bindBlob(i10, bArr);
    }

    @Override // k5.c
    public final void c(int i10) {
        this.f30707a.bindNull(i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f30707a.close();
    }

    @Override // k5.c
    public final void j(int i10, String value) {
        kotlin.jvm.internal.j.e(value, "value");
        this.f30707a.bindString(i10, value);
    }

    @Override // k5.c
    public final void o(int i10, double d10) {
        this.f30707a.bindDouble(i10, d10);
    }
}
