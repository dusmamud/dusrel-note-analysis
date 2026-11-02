package da;

/* JADX INFO: loaded from: classes2.dex */
public enum c {
    DISPLAYED("rc_ads_ad_displayed"),
    OPENED("rc_ads_ad_opened"),
    REVENUE("rc_ads_ad_revenue"),
    LOADED("rc_ads_ad_loaded"),
    FAILED_TO_LOAD("rc_ads_ad_failed_to_load"),
    REWARD_EARNED_UNVERIFIED("rc_ads_ad_reward_sdk_earned"),
    REWARD_VERIFIED("rc_ads_ad_reward_sdk_verified"),
    REWARD_GRANTED("rc_ads_ad_reward_sdk_granted"),
    REWARD_FAILED_TO_VERIFY("rc_ads_ad_reward_sdk_failed_to_verify"),
    REWARDED_AD_PROMPT_SHOWN("rc_ads_rewarded_ad_prompt_shown"),
    REWARDED_AD_PROMPT_ACCEPTED("rc_ads_rewarded_ad_prompt_accepted");

    private final String value;

    c(String str) {
        this.value = str;
    }

    public final String a() {
        return this.value;
    }
}
