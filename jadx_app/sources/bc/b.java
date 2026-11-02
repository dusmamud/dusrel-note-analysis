package bc;

import ca.k8;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f4262b;

    static {
        int[] iArr = new int[k8.values().length];
        try {
            iArr[k8.PLAY_STORE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k8.AMAZON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k8.GALAXY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f4261a = iArr;
        int[] iArr2 = new int[com.revenuecat.purchases.a.b.values().length];
        try {
            iArr2[com.revenuecat.purchases.a.b.VALID.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[com.revenuecat.purchases.a.b.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[com.revenuecat.purchases.a.b.SIMULATED_STORE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[com.revenuecat.purchases.a.b.OTHER_PLATFORM.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[com.revenuecat.purchases.a.b.GOOGLE_KEY_AMAZON_STORE.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[com.revenuecat.purchases.a.b.AMAZON_KEY_GOOGLE_STORE.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[com.revenuecat.purchases.a.b.GOOGLE_KEY_GALAXY_STORE.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[com.revenuecat.purchases.a.b.GALAXY_KEY_GOOGLE_STORE.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[com.revenuecat.purchases.a.b.GALAXY_KEY_AMAZON_STORE.ordinal()] = 9;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[com.revenuecat.purchases.a.b.AMAZON_KEY_GALAXY_STORE.ordinal()] = 10;
        } catch (NoSuchFieldError unused13) {
        }
        f4262b = iArr2;
    }
}
