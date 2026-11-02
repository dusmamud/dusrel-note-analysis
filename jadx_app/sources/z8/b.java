package z8;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<T> extends z0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EnumC0314b f37546a = EnumC0314b.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f37547b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37548a;

        static {
            int[] iArr = new int[EnumC0314b.values().length];
            f37548a = iArr;
            try {
                iArr[EnumC0314b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37548a[EnumC0314b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: z8.b$b, reason: collision with other inner class name */
    public static final class EnumC0314b {
        private static final /* synthetic */ EnumC0314b[] $VALUES;
        public static final EnumC0314b DONE;
        public static final EnumC0314b FAILED;
        public static final EnumC0314b NOT_READY;
        public static final EnumC0314b READY;

        static {
            EnumC0314b enumC0314b = new EnumC0314b("READY", 0);
            READY = enumC0314b;
            EnumC0314b enumC0314b2 = new EnumC0314b("NOT_READY", 1);
            NOT_READY = enumC0314b2;
            EnumC0314b enumC0314b3 = new EnumC0314b("DONE", 2);
            DONE = enumC0314b3;
            EnumC0314b enumC0314b4 = new EnumC0314b("FAILED", 3);
            FAILED = enumC0314b4;
            $VALUES = new EnumC0314b[]{enumC0314b, enumC0314b2, enumC0314b3, enumC0314b4};
        }

        public EnumC0314b() {
            throw null;
        }

        public static EnumC0314b valueOf(String name) {
            return (EnumC0314b) Enum.valueOf(EnumC0314b.class, name);
        }

        public static EnumC0314b[] values() {
            return (EnumC0314b[]) $VALUES.clone();
        }
    }

    public abstract T a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        EnumC0314b enumC0314b = this.f37546a;
        EnumC0314b enumC0314b2 = EnumC0314b.FAILED;
        if (enumC0314b == enumC0314b2) {
            throw new IllegalStateException();
        }
        int i10 = a.f37548a[enumC0314b.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            this.f37546a = enumC0314b2;
            this.f37547b = a();
            if (this.f37546a == EnumC0314b.DONE) {
                return false;
            }
            this.f37546a = EnumC0314b.READY;
        }
        return true;
    }

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f37546a = EnumC0314b.NOT_READY;
        T t6 = this.f37547b;
        this.f37547b = null;
        return t6;
    }
}
