package y2;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f36875a = new a();

    public class a implements n {
        @Override // y2.n
        public final long a() {
            throw new NoSuchElementException();
        }

        @Override // y2.n
        public final long b() {
            throw new NoSuchElementException();
        }

        @Override // y2.n
        public final boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
