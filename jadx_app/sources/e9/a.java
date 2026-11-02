package e9;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f25892a = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f25893b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: e9.a$a, reason: collision with other inner class name */
    public static abstract class EnumC0142a {
        private static final /* synthetic */ EnumC0142a[] $VALUES;
        public static final EnumC0142a ALGORITHM_NOT_FIPS;
        public static final EnumC0142a ALGORITHM_REQUIRES_BORINGCRYPTO;

        /* JADX INFO: renamed from: e9.a$a$a, reason: collision with other inner class name */
        public final enum C0143a extends EnumC0142a {
            public C0143a() {
                super("ALGORITHM_NOT_FIPS", 0);
            }

            @Override // e9.a.EnumC0142a
            public final boolean a() {
                return !a.f25893b.get();
            }
        }

        /* JADX INFO: renamed from: e9.a$a$b */
        public final enum b extends EnumC0142a {
            public b() {
                super("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            }

            @Override // e9.a.EnumC0142a
            public final boolean a() {
                Boolean bool;
                if (a.f25893b.get()) {
                    try {
                        bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
                    } catch (Exception unused) {
                        a.f25892a.info("Conscrypt is not available or does not support checking for FIPS build.");
                        bool = Boolean.FALSE;
                    }
                    if (!bool.booleanValue()) {
                        return false;
                    }
                }
                return true;
            }
        }

        static {
            C0143a c0143a = new C0143a();
            ALGORITHM_NOT_FIPS = c0143a;
            b bVar = new b();
            ALGORITHM_REQUIRES_BORINGCRYPTO = bVar;
            $VALUES = new EnumC0142a[]{c0143a, bVar};
        }

        public EnumC0142a() {
            throw null;
        }

        public static EnumC0142a valueOf(String name) {
            return (EnumC0142a) Enum.valueOf(EnumC0142a.class, name);
        }

        public static EnumC0142a[] values() {
            return (EnumC0142a[]) $VALUES.clone();
        }

        public abstract boolean a();
    }
}
