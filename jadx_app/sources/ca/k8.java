package ca;

import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class k8 {
    private static final /* synthetic */ k8[] $VALUES;
    public static final k8 AMAZON;
    public static final k8 APP_STORE;
    public static final a Companion;
    public static final k8 EXTERNAL;
    public static final k8 GALAXY;
    public static final k8 MAC_APP_STORE;
    public static final k8 PADDLE;
    public static final k8 PLAY_STORE;
    public static final k8 PROMOTIONAL;
    public static final k8 RC_BILLING;
    public static final k8 STRIPE;
    public static final k8 TEST_STORE;
    public static final k8 UNKNOWN_STORE;

    public static final class a {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static /* synthetic */ k8 a(String str) {
            switch (str.hashCode()) {
                case -1820761141:
                    if (str.equals("external")) {
                        return k8.EXTERNAL;
                    }
                    break;
                case -1523640723:
                    if (str.equals("rc_billing")) {
                        return k8.RC_BILLING;
                    }
                    break;
                case -1414265340:
                    if (str.equals("amazon")) {
                        return k8.AMAZON;
                    }
                    break;
                case -1253268720:
                    if (str.equals("galaxy")) {
                        return k8.GALAXY;
                    }
                    break;
                case -995842198:
                    if (str.equals("paddle")) {
                        return k8.PADDLE;
                    }
                    break;
                case -891985843:
                    if (str.equals("stripe")) {
                        return k8.STRIPE;
                    }
                    break;
                case 564036179:
                    if (str.equals("mac_app_store")) {
                        return k8.MAC_APP_STORE;
                    }
                    break;
                case 756050958:
                    if (str.equals("promotional")) {
                        return k8.PROMOTIONAL;
                    }
                    break;
                case 1842542915:
                    if (str.equals("app_store")) {
                        return k8.APP_STORE;
                    }
                    break;
                case 1925951510:
                    if (str.equals("play_store")) {
                        return k8.PLAY_STORE;
                    }
                    break;
                case 2070440692:
                    if (str.equals("test_store")) {
                        return k8.TEST_STORE;
                    }
                    break;
            }
            return k8.UNKNOWN_STORE;
        }

        public final KSerializer<k8> serializer() {
            return m8.f4870d;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4800a;

        static {
            int[] iArr = new int[k8.values().length];
            try {
                iArr[k8.APP_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k8.MAC_APP_STORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k8.PLAY_STORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k8.STRIPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k8.PROMOTIONAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[k8.UNKNOWN_STORE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[k8.AMAZON.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[k8.RC_BILLING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[k8.EXTERNAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[k8.PADDLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[k8.TEST_STORE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[k8.GALAXY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f4800a = iArr;
        }
    }

    static {
        k8 k8Var = new k8("APP_STORE", 0);
        APP_STORE = k8Var;
        k8 k8Var2 = new k8("MAC_APP_STORE", 1);
        MAC_APP_STORE = k8Var2;
        k8 k8Var3 = new k8("PLAY_STORE", 2);
        PLAY_STORE = k8Var3;
        k8 k8Var4 = new k8("STRIPE", 3);
        STRIPE = k8Var4;
        k8 k8Var5 = new k8("PROMOTIONAL", 4);
        PROMOTIONAL = k8Var5;
        k8 k8Var6 = new k8("UNKNOWN_STORE", 5);
        UNKNOWN_STORE = k8Var6;
        k8 k8Var7 = new k8("AMAZON", 6);
        AMAZON = k8Var7;
        k8 k8Var8 = new k8("RC_BILLING", 7);
        RC_BILLING = k8Var8;
        k8 k8Var9 = new k8("EXTERNAL", 8);
        EXTERNAL = k8Var9;
        k8 k8Var10 = new k8("PADDLE", 9);
        PADDLE = k8Var10;
        k8 k8Var11 = new k8("TEST_STORE", 10);
        TEST_STORE = k8Var11;
        k8 k8Var12 = new k8("GALAXY", 11);
        GALAXY = k8Var12;
        $VALUES = new k8[]{k8Var, k8Var2, k8Var3, k8Var4, k8Var5, k8Var6, k8Var7, k8Var8, k8Var9, k8Var10, k8Var11, k8Var12};
        Companion = new a();
    }

    public k8() {
        throw null;
    }

    public static k8 valueOf(String str) {
        return (k8) Enum.valueOf(k8.class, str);
    }

    public static k8[] values() {
        return (k8[]) $VALUES.clone();
    }
}
