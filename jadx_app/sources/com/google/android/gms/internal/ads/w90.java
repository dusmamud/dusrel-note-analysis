package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class w90 implements MediationAdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f18391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f18393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Location f18395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18397g;

    public w90(Date date, int i10, HashSet hashSet, Location location, boolean z10, int i11, boolean z11) {
        this.f18391a = date;
        this.f18392b = i10;
        this.f18393c = hashSet;
        this.f18395e = location;
        this.f18394d = z10;
        this.f18396f = i11;
        this.f18397g = z11;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final Date getBirthday() {
        return this.f18391a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int getGender() {
        return this.f18392b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set<String> getKeywords() {
        return this.f18393c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.f18395e;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.f18397g;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.f18394d;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.f18396f;
    }
}
