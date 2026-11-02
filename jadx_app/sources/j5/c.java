package j5;

/* JADX INFO: loaded from: classes.dex */
public interface c extends AutoCloseable {
    String G(int i10);

    boolean Z();

    void a(int i10, long j10);

    void b(byte[] bArr, int i10);

    void c(int i10);

    byte[] getBlob(int i10);

    int getColumnCount();

    String getColumnName(int i10);

    long getLong(int i10);

    boolean isNull(int i10);

    void reset();

    void t(int i10, String str);

    default boolean u() {
        return getLong(0) != 0;
    }
}
