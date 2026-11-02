package androidx.biometric;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class BiometricErrorData {
    private final int mErrorCode;
    private final CharSequence mErrorMessage;

    public BiometricErrorData(int i10, CharSequence charSequence) {
        this.mErrorCode = i10;
        this.mErrorMessage = charSequence;
    }

    private static String convertToString(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    private boolean isErrorMessageEqualTo(CharSequence charSequence) {
        String strConvertToString = convertToString(this.mErrorMessage);
        String strConvertToString2 = convertToString(charSequence);
        if (strConvertToString == null && strConvertToString2 == null) {
            return true;
        }
        return strConvertToString != null && strConvertToString.equals(strConvertToString2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof BiometricErrorData) {
            BiometricErrorData biometricErrorData = (BiometricErrorData) obj;
            if (this.mErrorCode == biometricErrorData.mErrorCode && isErrorMessageEqualTo(biometricErrorData.mErrorMessage)) {
                return true;
            }
        }
        return false;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public CharSequence getErrorMessage() {
        return this.mErrorMessage;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.mErrorCode), convertToString(this.mErrorMessage)});
    }
}
