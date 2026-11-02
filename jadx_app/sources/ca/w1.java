package ca;

/* JADX INFO: loaded from: classes2.dex */
public enum w1 {
    UNKNOWN(null),
    CUSTOM(null),
    LIFETIME("$rc_lifetime"),
    ANNUAL("$rc_annual"),
    SIX_MONTH("$rc_six_month"),
    THREE_MONTH("$rc_three_month"),
    TWO_MONTH("$rc_two_month"),
    MONTHLY("$rc_monthly"),
    WEEKLY("$rc_weekly");

    private final String identifier;

    w1(String str) {
        this.identifier = str;
    }

    public final String a() {
        return this.identifier;
    }
}
