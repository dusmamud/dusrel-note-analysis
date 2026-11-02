package t7;

import com.google.auto.value.AutoValue;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class e {

    @AutoValue
    public static abstract class a {
        public abstract long a();

        public abstract Set<b> b();

        public abstract long c();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b DEVICE_CHARGING;
        public static final b DEVICE_IDLE;
        public static final b NETWORK_UNMETERED;

        static {
            b bVar = new b("NETWORK_UNMETERED", 0);
            NETWORK_UNMETERED = bVar;
            b bVar2 = new b("DEVICE_IDLE", 1);
            DEVICE_IDLE = bVar2;
            b bVar3 = new b("DEVICE_CHARGING", 2);
            DEVICE_CHARGING = bVar3;
            $VALUES = new b[]{bVar, bVar2, bVar3};
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

    public abstract w7.a a();

    public final long b(k7.d dVar, long j10, int i10) {
        long jA = j10 - a().a();
        a aVar = c().get(dVar);
        long jA2 = aVar.a();
        int i11 = i10 - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * jA2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((jA2 > 1 ? jA2 : 2L) * ((long) i11)))), jA), aVar.c());
    }

    public abstract Map<k7.d, a> c();
}
