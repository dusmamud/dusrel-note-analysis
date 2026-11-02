package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ys1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f19829b;

    public /* synthetic */ ys1(Serializable serializable, int i10) {
        this.f19828a = i10;
        this.f19829b = serializable;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        switch (this.f19828a) {
            case 0:
                ((Bundle) obj).putStringArrayList("ad_types", (ArrayList) this.f19829b);
                break;
            default:
                Boolean bool = (Boolean) this.f19829b;
                Bundle bundle = (Bundle) obj;
                if (bool == null) {
                    bundle.putInt("lft", -1);
                } else if (!bool.booleanValue()) {
                    bundle.putInt("lft", 0);
                } else {
                    bundle.putInt("lft", 1);
                }
                break;
        }
    }
}
