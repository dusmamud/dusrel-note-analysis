package z8;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes2.dex */
public final class i {
    @CanIgnoreReturnValue
    public static void a(int value, String name) {
        if (value >= 0) {
            return;
        }
        throw new IllegalArgumentException(name + " cannot be negative but was: " + value);
    }
}
