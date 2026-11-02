package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdFormat f19573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19574c;

    public /* synthetic */ y82(x82 x82Var) {
        this.f19572a = x82Var.f18928a;
        this.f19573b = x82Var.f18929b;
        this.f19574c = x82Var.f18930c;
    }

    public final String a() {
        AdFormat adFormat = this.f19573b;
        return adFormat == null ? "unknown" : adFormat.name().toLowerCase(Locale.ENGLISH);
    }

    public final boolean equals(Object obj) {
        AdFormat adFormat;
        AdFormat adFormat2;
        if (obj instanceof y82) {
            y82 y82Var = (y82) obj;
            if (this.f19572a.equals(y82Var.f19572a) && (adFormat = this.f19573b) != null && (adFormat2 = y82Var.f19573b) != null && adFormat.equals(adFormat2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f19572a, this.f19573b);
    }
}
