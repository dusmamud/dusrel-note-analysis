package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qt1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f15046b;

    public /* synthetic */ qt1(Serializable serializable, int i10) {
        this.f15045a = i10;
        this.f15046b = serializable;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final void zza(Object obj) {
        switch (this.f15045a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                ArrayList arrayList = (ArrayList) this.f15046b;
                if (arrayList != null) {
                    bundle.putStringArrayList("android_permissions", new ArrayList<>(arrayList));
                }
                break;
            default:
                j32.e((Bundle) obj, "omid_v", (String) this.f15046b);
                break;
        }
    }
}
