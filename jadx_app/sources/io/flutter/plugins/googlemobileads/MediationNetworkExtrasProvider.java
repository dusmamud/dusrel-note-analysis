package io.flutter.plugins.googlemobileads;

import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface MediationNetworkExtrasProvider {
    Map<Class<? extends MediationExtrasReceiver>, Bundle> getMediationExtras(String str, String str2);
}
