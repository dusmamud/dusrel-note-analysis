package androidx.biometric;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
class PackageUtils {

    public static class Api23Impl {
        private Api23Impl() {
        }

        public static boolean hasSystemFeatureFingerprint(PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.fingerprint");
        }
    }

    private PackageUtils() {
    }

    public static boolean hasSystemFeatureFingerprint(Context context) {
        return (context == null || context.getPackageManager() == null || !Api23Impl.hasSystemFeatureFingerprint(context.getPackageManager())) ? false : true;
    }
}
