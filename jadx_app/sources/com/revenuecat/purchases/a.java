package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.revenuecat.purchases.a$a, reason: collision with other inner class name */
    public static final class EnumC0096a {
        private static final /* synthetic */ EnumC0096a[] $VALUES;
        public static final EnumC0096a AMAZON;
        public static final EnumC0096a GALAXY;
        public static final EnumC0096a GOOGLE;
        public static final EnumC0096a LEGACY;
        public static final EnumC0096a OTHER_PLATFORM;
        public static final EnumC0096a TEST;

        static {
            EnumC0096a enumC0096a = new EnumC0096a("GOOGLE", 0);
            GOOGLE = enumC0096a;
            EnumC0096a enumC0096a2 = new EnumC0096a("AMAZON", 1);
            AMAZON = enumC0096a2;
            EnumC0096a enumC0096a3 = new EnumC0096a("GALAXY", 2);
            GALAXY = enumC0096a3;
            EnumC0096a enumC0096a4 = new EnumC0096a("LEGACY", 3);
            LEGACY = enumC0096a4;
            EnumC0096a enumC0096a5 = new EnumC0096a("TEST", 4);
            TEST = enumC0096a5;
            EnumC0096a enumC0096a6 = new EnumC0096a("OTHER_PLATFORM", 5);
            OTHER_PLATFORM = enumC0096a6;
            $VALUES = new EnumC0096a[]{enumC0096a, enumC0096a2, enumC0096a3, enumC0096a4, enumC0096a5, enumC0096a6};
        }

        public EnumC0096a() {
            throw null;
        }

        public static EnumC0096a valueOf(String str) {
            return (EnumC0096a) Enum.valueOf(EnumC0096a.class, str);
        }

        public static EnumC0096a[] values() {
            return (EnumC0096a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b AMAZON_KEY_GALAXY_STORE;
        public static final b AMAZON_KEY_GOOGLE_STORE;
        public static final b GALAXY_KEY_AMAZON_STORE;
        public static final b GALAXY_KEY_GOOGLE_STORE;
        public static final b GOOGLE_KEY_AMAZON_STORE;
        public static final b GOOGLE_KEY_GALAXY_STORE;
        public static final b LEGACY;
        public static final b OTHER_PLATFORM;
        public static final b SIMULATED_STORE;
        public static final b VALID;

        static {
            b bVar = new b("VALID", 0);
            VALID = bVar;
            b bVar2 = new b("GOOGLE_KEY_AMAZON_STORE", 1);
            GOOGLE_KEY_AMAZON_STORE = bVar2;
            b bVar3 = new b("GOOGLE_KEY_GALAXY_STORE", 2);
            GOOGLE_KEY_GALAXY_STORE = bVar3;
            b bVar4 = new b("AMAZON_KEY_GOOGLE_STORE", 3);
            AMAZON_KEY_GOOGLE_STORE = bVar4;
            b bVar5 = new b("AMAZON_KEY_GALAXY_STORE", 4);
            AMAZON_KEY_GALAXY_STORE = bVar5;
            b bVar6 = new b("GALAXY_KEY_GOOGLE_STORE", 5);
            GALAXY_KEY_GOOGLE_STORE = bVar6;
            b bVar7 = new b("GALAXY_KEY_AMAZON_STORE", 6);
            GALAXY_KEY_AMAZON_STORE = bVar7;
            b bVar8 = new b("LEGACY", 7);
            LEGACY = bVar8;
            b bVar9 = new b("SIMULATED_STORE", 8);
            SIMULATED_STORE = bVar9;
            b bVar10 = new b("OTHER_PLATFORM", 9);
            OTHER_PLATFORM = bVar10;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10};
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

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23251a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.AMAZON_KEY_GOOGLE_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.GOOGLE_KEY_AMAZON_STORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.GALAXY_KEY_GOOGLE_STORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.GOOGLE_KEY_GALAXY_STORE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.GALAXY_KEY_AMAZON_STORE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.AMAZON_KEY_GALAXY_STORE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.LEGACY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b.OTHER_PLATFORM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[b.SIMULATED_STORE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[b.VALID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f23251a = iArr;
        }
    }
}
