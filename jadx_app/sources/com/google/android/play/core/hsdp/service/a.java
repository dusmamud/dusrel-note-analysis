package com.google.android.play.core.hsdp.service;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: com.google.android.play.core.hsdp.service.a$a, reason: collision with other inner class name */
    public interface InterfaceC0092a {
        void onAffordanceEnded();

        void onAffordanceStarted();

        void onDeepLinkStarted();

        void onDismissed(Bundle bundle);

        void onError(Bundle bundle);

        void onShown(Bundle bundle);
    }

    public interface b {
        void onCompleted(Bundle bundle);

        void onError(Bundle bundle);
    }
}
