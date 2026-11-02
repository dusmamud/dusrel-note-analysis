package da;

/* JADX INFO: loaded from: classes2.dex */
public enum a {
    ADAPTER("adapter"),
    ANDROID_ADMOB_LEGACY_ADAPTER("android_admob_legacy_adapter"),
    ANDROID_ADMOB_NEXT_GEN_ADAPTER("android_admob_next_gen_adapter"),
    FLUTTER_ADMOB_ADAPTER("flutter_admob_adapter"),
    REACT_NATIVE_ADMOB_ADAPTER("react_native_admob_adapter"),
    UNITY_ADMOB_ADAPTER("unity_admob_adapter"),
    MANUAL("manual");

    private final String value;

    a(String str) {
        this.value = str;
    }

    public final String a() {
        return this.value;
    }
}
