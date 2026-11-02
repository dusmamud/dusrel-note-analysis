package xa;

/* JADX INFO: loaded from: classes2.dex */
public enum h0 {
    Workflows("workflows"),
    UiConfig("ui_config"),
    Sources("sources"),
    CheckpointRules("checkpoint_rules"),
    Audiences("audiences"),
    SdkSettings("sdk_settings"),
    SubscriberDimensions("subscriber_dimensions");

    private final String wireName;

    h0(String str) {
        this.wireName = str;
    }

    public final String a() {
        return this.wireName;
    }
}
