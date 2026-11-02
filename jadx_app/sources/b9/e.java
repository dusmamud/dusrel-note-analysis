package b9;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes2.dex */
public final class e {
    @CanIgnoreReturnValue
    public static void a(long role, String x4) {
        if (role >= 0) {
            return;
        }
        throw new IllegalArgumentException(x4 + " (" + role + ") must be >= 0");
    }
}
