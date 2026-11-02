package com.google.mlkit.genai.common;

import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes2.dex */
public class GenAiException extends Exception {

    @ErrorCode
    private final int zza;

    public @interface ErrorCode {
        public static final int AICORE_INCOMPATIBLE = -101;
        public static final int BACKGROUND_USE_BLOCKED = 30;
        public static final int BUSY = 9;
        public static final int CACHE_PROCESSING_ERROR = -103;
        public static final int CANCELLED = 7;
        public static final int INVALID_INPUT_IMAGE = -102;
        public static final int NEEDS_SYSTEM_UPDATE = 604;
        public static final int NOT_AVAILABLE = 8;
        public static final int NOT_ENOUGH_DISK_SPACE = 501;
        public static final int PER_APP_BATTERY_USE_QUOTA_EXCEEDED = 27;
        public static final int REQUEST_PROCESSING_ERROR = 4;
        public static final int REQUEST_TOO_LARGE = 12;
        public static final int REQUEST_TOO_SMALL = -100;
        public static final int RESPONSE_GENERATION_ERROR = 15;
        public static final int RESPONSE_PROCESSING_ERROR = 11;

        @KeepForSdk
        public static final int UNKNOWN = 0;
    }

    @KeepForSdk
    public GenAiException(String str, Throwable th, @ErrorCode int i10) {
        super(str, th);
        this.zza = i10;
    }

    @ErrorCode
    public int getErrorCode() {
        int i10 = this.zza;
        if (i10 == 28) {
            return 9;
        }
        return i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @KeepForSdk
    public GenAiException(Throwable th, @ErrorCode int i10) {
        String message;
        if (i10 == 4) {
            message = "Request doesn't pass certain policy check. Please try a different input.";
        } else if (i10 == 15) {
            message = "Couldn't generate a response due to policy check failure. Please try a different input.";
        } else if (i10 == 30) {
            message = "Background usage is blocked. Please use the API when your app is in the foreground instead.";
        } else if (i10 == 501) {
            message = "Not enough storage. Please clear some space.";
        } else if (i10 == 604) {
            message = "Android version is too low. Please update.";
        } else if (i10 == 7) {
            message = "The request is canceled.";
        } else if (i10 == 8) {
            message = "This feature is not available on this device. It is due to either the device not supporting it or the latest configuration file has not been downloaded.";
        } else if (i10 == 9) {
            message = "Request cannot be processed. Either your app is out of usage quota (try again later) or the request is from disallowed background usage (use the API while the app is in the foreground).";
        } else if (i10 == 11) {
            message = "Generated response doesn't pass certain policy check. Please try a different input.";
        } else if (i10 == 12) {
            message = "Request too large. Please shorten your input.";
        } else if (i10 == 27) {
            message = "A long-duration (for example per-day) quota for the calling app's uid has been exceeded. Use of AICore from this app has been restricted to preserve battery.";
        } else if (i10 != 28) {
            switch (i10) {
                case ErrorCode.INVALID_INPUT_IMAGE /* -102 */:
                    message = "Invalid input image. It can be due to invalid image URL, failure to decode to bitmap, invalid mime type or other image processing failures.";
                    break;
                case ErrorCode.AICORE_INCOMPATIBLE /* -101 */:
                    message = "AICore is either not installed or the installed version is too low.";
                    break;
                case -100:
                    message = "Request too small. Please provide a longer input.";
                    break;
                default:
                    if (th == null) {
                        message = "Unknown error.";
                    } else {
                        message = th.getMessage();
                        if (message == null) {
                            message = "";
                        }
                    }
                    break;
            }
        } else {
            message = "A long-duration (for example per-day) quota for the device has been exceeded. Use of AICore (from any app) has been restricted to preserve battery.";
        }
        super("[ErrorCode " + i10 + "] " + message, th);
        this.zza = i10;
    }
}
