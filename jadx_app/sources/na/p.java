package na;

/* JADX INFO: loaded from: classes2.dex */
public enum p {
    BackendInvalidPlatform(7000),
    BackendStoreProblem(7101),
    BackendCannotTransferPurchase(7102),
    BackendInvalidReceiptToken(7103),
    BackendInvalidAppStoreSharedSecret(7104),
    BackendInvalidPaymentModeOrIntroPriceNotProvided(7105),
    BackendProductIdForGoogleReceiptNotProvided(7106),
    BackendInvalidPlayStoreCredentials(7107),
    BackendInternalServerError(7110),
    BackendEmptyAppUserId(7220),
    BackendInvalidAuthToken(7224),
    BackendInvalidAPIKey(7225),
    BackendBadRequest(7226),
    BackendPlayStoreQuotaExceeded(7229),
    BackendPlayStoreInvalidPackageName(7230),
    BackendPlayStoreGenericError(7231),
    BackendUserIneligibleForPromoOffer(7232),
    BackendInvalidAppleSubscriptionKey(7234),
    BackendCouldNotCreateAlias(7255),
    BackendInvalidAppUserId(7256),
    BackendInvalidSubscriberAttributes(7263),
    BackendInvalidSubscriberAttributesBody(7264),
    BackendSubscriberAttributesAreBeingUpdated(7629),
    BackendPaymentNotComplete(7651),
    BackendRequestAlreadyInProgress(7638),
    BackendProductIDsMalformed(7662),
    BackendInvalidWebRedemptionToken(7849),
    BackendPurchaseBelongsToOtherUser(7852),
    BackendExpiredWebRedemptionToken(7853);

    public static final a Companion = new a();
    private final int value;

    public static final class a {
    }

    p(int i10) {
        this.value = i10;
    }

    public final int a() {
        return this.value;
    }
}
