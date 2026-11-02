package ra;

import ca.k3;
import sc.k;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33840a;

        static {
            int[] iArr = new int[k3.values().length];
            try {
                iArr[k3.SUBS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k3.INAPP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k3.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f33840a = iArr;
        }
    }

    public static final String a(k3 k3Var) {
        int i10 = a.f33840a[k3Var.ordinal()];
        if (i10 == 1) {
            return "AUTO_RENEWABLE_SUBSCRIPTION";
        }
        if (i10 == 2) {
            return "NON_SUBSCRIPTION";
        }
        if (i10 == 3) {
            return "UNKNOWN";
        }
        throw new k();
    }
}
