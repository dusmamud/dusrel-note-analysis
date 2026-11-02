package v8;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f35271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f35272b;

    static {
        HashMap map = new HashMap();
        f35271a = map;
        HashMap map2 = new HashMap();
        f35272b = map2;
        map.put(-1, "The Play Store app is either not installed or not the official version.");
        map.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(-2, "INVALID_REQUEST");
        map2.put(-100, "INTERNAL_ERROR");
    }
}
