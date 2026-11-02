package ua;

import ca.a9;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f34816a;

    static {
        int[] iArr = new int[a9.values().length];
        try {
            iArr[a9.NOT_REQUESTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a9.VERIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a9.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a9.VERIFIED_ON_DEVICE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f34816a = iArr;
    }
}
