package com.google.android.gms.internal.play_billing;

import io.flutter.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class p6 implements f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p6 f22767a = new p6();

    @Override // com.google.android.gms.internal.play_billing.f4
    public final boolean zza(int i10) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            default:
                switch (i10) {
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case Build.API_LEVELS.API_28 /* 28 */:
                    case Build.API_LEVELS.API_29 /* 29 */:
                    case 30:
                    case Build.API_LEVELS.API_31 /* 31 */:
                    case 32:
                    case Build.API_LEVELS.API_33 /* 33 */:
                    case Build.API_LEVELS.API_34 /* 34 */:
                    case Build.API_LEVELS.API_35 /* 35 */:
                    case 36:
                        return true;
                    default:
                        return false;
                }
        }
    }
}
