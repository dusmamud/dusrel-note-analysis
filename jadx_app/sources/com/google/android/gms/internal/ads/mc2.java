package com.google.android.gms.internal.ads;

import io.flutter.Build;

/* JADX INFO: loaded from: classes.dex */
public final class mc2 implements nh3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mc2 f12784b = new mc2(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mc2 f12785c = new mc2(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12786a;

    public /* synthetic */ mc2(int i10) {
        this.f12786a = i10;
    }

    @Override // com.google.android.gms.internal.ads.nh3
    public final boolean zza(int i10) {
        switch (this.f12786a) {
            case 0:
                return i10 == 0 || i10 == 1;
            default:
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
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case Build.API_LEVELS.API_28 /* 28 */:
                        return true;
                    default:
                        return false;
                }
        }
    }
}
