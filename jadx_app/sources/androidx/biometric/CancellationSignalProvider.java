package androidx.biometric;

import android.os.CancellationSignal;
import android.util.Log;
import s0.d;

/* JADX INFO: loaded from: classes.dex */
class CancellationSignalProvider {
    private static final String TAG = "CancelSignalProvider";
    private CancellationSignal mBiometricCancellationSignal;
    private d mFingerprintCancellationSignal;
    private final Injector mInjector;

    public static class Api16Impl {
        private Api16Impl() {
        }

        public static void cancel(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        public static CancellationSignal create() {
            return new CancellationSignal();
        }
    }

    public interface Injector {
        CancellationSignal getBiometricCancellationSignal();

        d getFingerprintCancellationSignal();
    }

    public CancellationSignalProvider() {
        this.mInjector = new Injector() { // from class: androidx.biometric.CancellationSignalProvider.1
            @Override // androidx.biometric.CancellationSignalProvider.Injector
            public CancellationSignal getBiometricCancellationSignal() {
                return Api16Impl.create();
            }

            @Override // androidx.biometric.CancellationSignalProvider.Injector
            public d getFingerprintCancellationSignal() {
                return new d();
            }
        };
    }

    public void cancel() {
        CancellationSignal cancellationSignal = this.mBiometricCancellationSignal;
        if (cancellationSignal != null) {
            try {
                Api16Impl.cancel(cancellationSignal);
            } catch (NullPointerException e10) {
                Log.e(TAG, "Got NPE while canceling biometric authentication.", e10);
            }
            this.mBiometricCancellationSignal = null;
        }
        d dVar = this.mFingerprintCancellationSignal;
        if (dVar != null) {
            try {
                dVar.a();
            } catch (NullPointerException e11) {
                Log.e(TAG, "Got NPE while canceling fingerprint authentication.", e11);
            }
            this.mFingerprintCancellationSignal = null;
        }
    }

    public CancellationSignal getBiometricCancellationSignal() {
        if (this.mBiometricCancellationSignal == null) {
            this.mBiometricCancellationSignal = this.mInjector.getBiometricCancellationSignal();
        }
        return this.mBiometricCancellationSignal;
    }

    public d getFingerprintCancellationSignal() {
        if (this.mFingerprintCancellationSignal == null) {
            this.mFingerprintCancellationSignal = this.mInjector.getFingerprintCancellationSignal();
        }
        return this.mFingerprintCancellationSignal;
    }

    public CancellationSignalProvider(Injector injector) {
        this.mInjector = injector;
    }
}
