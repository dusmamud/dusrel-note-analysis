package com.google.android.play.core.hsdp.service;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class g implements a.InterfaceC0092a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.InterfaceC0092a f22875a;

    public g(a.InterfaceC0092a interfaceC0092a) {
        this.f22875a = interfaceC0092a;
    }

    @Override // com.google.android.play.core.hsdp.service.a.InterfaceC0092a
    public void onDismissed(Bundle bundle) {
        this.f22875a.onDismissed(bundle);
    }

    @Override // com.google.android.play.core.hsdp.service.a.InterfaceC0092a
    public void onError(Bundle bundle) {
        this.f22875a.onError(bundle);
    }

    @Override // com.google.android.play.core.hsdp.service.a.InterfaceC0092a
    public void onShown(Bundle bundle) {
        this.f22875a.onShown(bundle);
    }
}
