package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface v1 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a ASCENDING;
        public static final a DESCENDING;

        static {
            a aVar = new a("ASCENDING", 0);
            ASCENDING = aVar;
            a aVar2 = new a("DESCENDING", 1);
            DESCENDING = aVar2;
            $VALUES = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String name) {
            return (a) Enum.valueOf(a.class, name);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }
}
