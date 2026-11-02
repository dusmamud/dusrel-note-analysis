package y8;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes2.dex */
public final class h {
    public static String a(int index, int size, String desc) {
        if (index < 0) {
            return n.a("%s (%s) must not be negative", desc, Integer.valueOf(index));
        }
        if (size >= 0) {
            return n.a("%s (%s) must not be greater than size (%s)", desc, Integer.valueOf(index), Integer.valueOf(size));
        }
        throw new IllegalArgumentException(j2.j.a(size, "negative size: "));
    }

    public static void b(boolean expression, String errorMessageTemplate, long p10) {
        if (!expression) {
            throw new IllegalArgumentException(n.a(errorMessageTemplate, Long.valueOf(p10)));
        }
    }

    @CanIgnoreReturnValue
    public static void c(int index, int size) {
        String strA;
        if (index < 0 || index >= size) {
            if (index < 0) {
                strA = n.a("%s (%s) must not be negative", "index", Integer.valueOf(index));
            } else {
                if (size < 0) {
                    throw new IllegalArgumentException(j2.j.a(size, "negative size: "));
                }
                strA = n.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(index), Integer.valueOf(size));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    @CanIgnoreReturnValue
    public static void d(int index, int size) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(a(index, size, "index"));
        }
    }

    public static void e(int start, int end, int size) {
        String strA;
        if (start < 0 || end < start || end > size) {
            if (start < 0 || start > size) {
                strA = a(start, size, "start index");
            } else {
                strA = (end < 0 || end > size) ? a(end, size, "end index") : n.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(end), Integer.valueOf(start));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }
}
