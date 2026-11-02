package ca;

/* JADX INFO: loaded from: classes2.dex */
public final class k1 extends RuntimeException {
    public k1(NoClassDefFoundError noClassDefFoundError) {
        super("Error building BillingFlowParams which is required to perform purchases in the Play store. This is due to an issue in Google's Billing Client library. Please check https://errors.rev.cat/no-core-library-desugaring for more info and to fix this issue.", noClassDefFoundError);
    }
}
