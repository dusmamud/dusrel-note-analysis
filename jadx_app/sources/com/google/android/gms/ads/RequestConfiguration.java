package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RequestConfiguration {
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";

    @Deprecated
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;

    @Deprecated
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;

    @Deprecated
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    private final AgeRestrictedTreatment zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final List zzf;
    private final PublisherPrivacyPersonalizationState zzg;
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";
    public static final String MAX_AD_CONTENT_RATING_G = "G";
    public static final List zza = Arrays.asList(MAX_AD_CONTENT_RATING_MA, MAX_AD_CONTENT_RATING_T, MAX_AD_CONTENT_RATING_PG, MAX_AD_CONTENT_RATING_G);

    public static class Builder {
        private AgeRestrictedTreatment zza = null;
        private int zzb = -1;
        private int zzc = -1;
        private String zzd = null;
        private final List zze = new ArrayList();
        private PublisherPrivacyPersonalizationState zzf = PublisherPrivacyPersonalizationState.DEFAULT;

        public RequestConfiguration build() {
            return new RequestConfiguration(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
        }

        public Builder setAgeRestrictedTreatment(AgeRestrictedTreatment ageRestrictedTreatment) {
            this.zza = ageRestrictedTreatment;
            return this;
        }

        public Builder setMaxAdContentRating(String str) {
            if (str == null || "".equals(str)) {
                this.zzd = null;
                return this;
            }
            if (RequestConfiguration.MAX_AD_CONTENT_RATING_G.equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_PG.equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_T.equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_MA.equals(str)) {
                this.zzd = str;
                return this;
            }
            zzo.zzi("Invalid value passed to setMaxAdContentRating: ".concat(str));
            return this;
        }

        public Builder setPublisherPrivacyPersonalizationState(PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState) {
            this.zzf = publisherPrivacyPersonalizationState;
            return this;
        }

        @Deprecated
        public Builder setTagForChildDirectedTreatment(int i10) {
            if (i10 == -1 || i10 == 0 || i10 == 1) {
                this.zzb = i10;
                return this;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 57);
            sb2.append("Invalid value passed to setTagForChildDirectedTreatment: ");
            sb2.append(i10);
            zzo.zzi(sb2.toString());
            return this;
        }

        @Deprecated
        public Builder setTagForUnderAgeOfConsent(int i10) {
            if (i10 == -1 || i10 == 0 || i10 == 1) {
                this.zzc = i10;
                return this;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 52);
            sb2.append("Invalid value passed to setTagForUnderAgeOfConsent: ");
            sb2.append(i10);
            zzo.zzi(sb2.toString());
            return this;
        }

        public Builder setTestDeviceIds(List<String> list) {
            List list2 = this.zze;
            list2.clear();
            if (list != null) {
                list2.addAll(list);
            }
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MaxAdContentRating {
    }

    public enum PublisherPrivacyPersonalizationState {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);

        private final int zza;

        PublisherPrivacyPersonalizationState(int i10) {
            this.zza = i10;
        }

        public int getValue() {
            return this.zza;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface TagForChildDirectedTreatment {
    }

    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface TagForUnderAgeOfConsent {
    }

    public /* synthetic */ RequestConfiguration(AgeRestrictedTreatment ageRestrictedTreatment, int i10, int i11, String str, List list, PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState, byte[] bArr) {
        this.zzb = ageRestrictedTreatment;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = str;
        this.zzf = list;
        this.zzg = publisherPrivacyPersonalizationState;
    }

    public AgeRestrictedTreatment getAgeRestrictedTreatment() {
        AgeRestrictedTreatment ageRestrictedTreatment = this.zzb;
        return ageRestrictedTreatment == null ? AgeRestrictedTreatment.UNSPECIFIED : ageRestrictedTreatment;
    }

    public String getMaxAdContentRating() {
        String str = this.zze;
        return str == null ? "" : str;
    }

    public PublisherPrivacyPersonalizationState getPublisherPrivacyPersonalizationState() {
        return this.zzg;
    }

    @Deprecated
    public int getTagForChildDirectedTreatment() {
        return this.zzc;
    }

    @Deprecated
    public int getTagForUnderAgeOfConsent() {
        return this.zzd;
    }

    public List<String> getTestDeviceIds() {
        return new ArrayList(this.zzf);
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setAgeRestrictedTreatment(this.zzb);
        builder.setTagForChildDirectedTreatment(this.zzc);
        builder.setTagForUnderAgeOfConsent(this.zzd);
        builder.setMaxAdContentRating(this.zze);
        builder.setTestDeviceIds(this.zzf);
        builder.setPublisherPrivacyPersonalizationState(this.zzg);
        return builder;
    }

    public final AgeRestrictedTreatment zza() {
        return this.zzb;
    }
}
