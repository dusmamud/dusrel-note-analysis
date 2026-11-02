package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ka1 implements pp2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ka1 f11743b = new ka1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ka1 f11744c = new ka1(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11745a;

    public /* synthetic */ ka1(int i10) {
        this.f11745a = i10;
    }

    @Override // com.google.android.gms.internal.ads.pp2
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f11745a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (ia1 ia1Var : (List) obj) {
                    if (ia1Var != null) {
                        arrayList.add(ia1Var);
                    }
                }
                return arrayList;
            default:
                return Boolean.FALSE;
        }
    }
}
