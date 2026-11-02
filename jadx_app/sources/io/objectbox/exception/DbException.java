package io.objectbox.exception;

import b0.f;

/* JADX INFO: loaded from: classes2.dex */
public class DbException extends RuntimeException {
    private final int errorCode;

    public DbException(String str) {
        super(str);
        this.errorCode = 0;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (this.errorCode == 0) {
            return super.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" (error code ");
        return f.c(this.errorCode, ")", sb2);
    }

    public DbException(String str, Throwable th) {
        super(str, th);
        this.errorCode = 0;
    }

    public DbException(String str, int i10) {
        super(str);
        this.errorCode = i10;
    }
}
