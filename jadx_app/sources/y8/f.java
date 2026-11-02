package y8;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37192a;

    public f(String separator) {
        separator.getClass();
        this.f37192a = separator;
    }

    @CanIgnoreReturnValue
    public final void a(StringBuilder builder, Iterator parts) {
        try {
            if (parts.hasNext()) {
                Object next = parts.next();
                Objects.requireNonNull(next);
                builder.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (parts.hasNext()) {
                    builder.append((CharSequence) this.f37192a);
                    Object next2 = parts.next();
                    Objects.requireNonNull(next2);
                    builder.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
