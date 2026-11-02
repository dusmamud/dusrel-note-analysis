package ga;

import ca.k3;
import com.amazon.device.iap.model.ProductType;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27367a;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.CONSUMABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductType.ENTITLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductType.SUBSCRIPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27367a = iArr;
        }
    }

    public static final k3 a(ProductType productType) {
        int i10 = a.f27367a[productType.ordinal()];
        if (i10 == 1) {
            return k3.INAPP;
        }
        if (i10 == 2) {
            return k3.INAPP;
        }
        if (i10 == 3) {
            return k3.SUBS;
        }
        throw new sc.k();
    }
}
