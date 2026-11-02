package we;

import java.util.AbstractSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public final class c<K, V> extends we.a<K, V, Set<V>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f36090b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36091a;

        static {
            int[] iArr = new int[b.values().length];
            f36091a = iArr;
            try {
                iArr[b.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36091a[b.THREAD_SAFE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b REGULAR;
        public static final b THREAD_SAFE;

        static {
            b bVar = new b("REGULAR", 0);
            REGULAR = bVar;
            b bVar2 = new b("THREAD_SAFE", 1);
            THREAD_SAFE = bVar2;
            $VALUES = new b[]{bVar, bVar2};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public c(HashMap map, b bVar) {
        this.f36082a = map;
        this.f36090b = bVar;
    }

    @Override // we.a
    public final AbstractSet b() {
        int[] iArr = a.f36091a;
        b bVar = this.f36090b;
        int i10 = iArr[bVar.ordinal()];
        if (i10 == 1) {
            return new HashSet();
        }
        if (i10 == 2) {
            return new CopyOnWriteArraySet();
        }
        throw new IllegalStateException("Unknown set type: " + bVar);
    }
}
