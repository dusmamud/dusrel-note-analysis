package sc;

import io.flutter.embedding.android.KeyboardMap;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements Comparable<s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34214a;

    public static String a(int i10) {
        return String.valueOf(((long) i10) & KeyboardMap.kValueMask);
    }

    @Override // java.lang.Comparable
    public final int compareTo(s sVar) {
        return kotlin.jvm.internal.j.f(this.f34214a ^ Integer.MIN_VALUE, sVar.f34214a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f34214a == ((s) obj).f34214a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34214a);
    }

    public final String toString() {
        return a(this.f34214a);
    }
}
