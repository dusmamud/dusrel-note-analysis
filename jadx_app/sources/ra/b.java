package ra;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b AMAZON_PURCHASE_ATTEMPT;
    public static final b AMAZON_QUERY_PRODUCT_DETAILS_REQUEST;
    public static final b AMAZON_QUERY_PURCHASES_REQUEST;
    public static final b CLEARING_DIAGNOSTICS_AFTER_FAILED_SYNC;
    public static final b CUSTOMER_INFO_VERIFICATION_RESULT;
    public static final b ENTERED_OFFLINE_ENTITLEMENTS_MODE;
    public static final b ERROR_ENTERING_OFFLINE_ENTITLEMENTS_MODE;
    public static final b GET_CUSTOMER_INFO_RESULT;
    public static final b GET_CUSTOMER_INFO_STARTED;
    public static final b GET_OFFERINGS_RESULT;
    public static final b GET_OFFERINGS_STARTED;
    public static final b GET_PRODUCTS_RESULT;
    public static final b GET_PRODUCTS_STARTED;
    public static final b GOOGLE_BILLING_SERVICE_DISCONNECTED;
    public static final b GOOGLE_BILLING_SETUP_FINISHED;
    public static final b GOOGLE_BILLING_START_CONNECTION;
    public static final b GOOGLE_PURCHASES_UPDATE_RECEIVED;
    public static final b GOOGLE_PURCHASE_STARTED;
    public static final b GOOGLE_QUERY_PRODUCT_DETAILS_REQUEST;
    public static final b GOOGLE_QUERY_PURCHASES_REQUEST;
    public static final b GOOGLE_QUERY_PURCHASE_HISTORY_REQUEST;
    public static final b HTTP_REQUEST_PERFORMED;
    public static final b MAX_DIAGNOSTICS_SYNC_RETRIES_REACHED;
    public static final b MAX_EVENTS_STORED_LIMIT_REACHED;
    public static final b PRODUCT_DETAILS_NOT_SUPPORTED;
    public static final b PURCHASE_RESULT;
    public static final b PURCHASE_STARTED;
    public static final b RESTORE_PURCHASES_RESULT;
    public static final b RESTORE_PURCHASES_STARTED;
    public static final b SYNC_PURCHASES_RESULT;
    public static final b SYNC_PURCHASES_STARTED;

    static {
        b bVar = new b("HTTP_REQUEST_PERFORMED", 0);
        HTTP_REQUEST_PERFORMED = bVar;
        b bVar2 = new b("MAX_EVENTS_STORED_LIMIT_REACHED", 1);
        MAX_EVENTS_STORED_LIMIT_REACHED = bVar2;
        b bVar3 = new b("MAX_DIAGNOSTICS_SYNC_RETRIES_REACHED", 2);
        MAX_DIAGNOSTICS_SYNC_RETRIES_REACHED = bVar3;
        b bVar4 = new b("CLEARING_DIAGNOSTICS_AFTER_FAILED_SYNC", 3);
        CLEARING_DIAGNOSTICS_AFTER_FAILED_SYNC = bVar4;
        b bVar5 = new b("GOOGLE_QUERY_PRODUCT_DETAILS_REQUEST", 4);
        GOOGLE_QUERY_PRODUCT_DETAILS_REQUEST = bVar5;
        b bVar6 = new b("GOOGLE_QUERY_PURCHASES_REQUEST", 5);
        GOOGLE_QUERY_PURCHASES_REQUEST = bVar6;
        b bVar7 = new b("GOOGLE_QUERY_PURCHASE_HISTORY_REQUEST", 6);
        GOOGLE_QUERY_PURCHASE_HISTORY_REQUEST = bVar7;
        b bVar8 = new b("GOOGLE_BILLING_START_CONNECTION", 7);
        GOOGLE_BILLING_START_CONNECTION = bVar8;
        b bVar9 = new b("GOOGLE_BILLING_SETUP_FINISHED", 8);
        GOOGLE_BILLING_SETUP_FINISHED = bVar9;
        b bVar10 = new b("GOOGLE_BILLING_SERVICE_DISCONNECTED", 9);
        GOOGLE_BILLING_SERVICE_DISCONNECTED = bVar10;
        b bVar11 = new b("PRODUCT_DETAILS_NOT_SUPPORTED", 10);
        PRODUCT_DETAILS_NOT_SUPPORTED = bVar11;
        b bVar12 = new b("CUSTOMER_INFO_VERIFICATION_RESULT", 11);
        CUSTOMER_INFO_VERIFICATION_RESULT = bVar12;
        b bVar13 = new b("AMAZON_QUERY_PRODUCT_DETAILS_REQUEST", 12);
        AMAZON_QUERY_PRODUCT_DETAILS_REQUEST = bVar13;
        b bVar14 = new b("AMAZON_QUERY_PURCHASES_REQUEST", 13);
        AMAZON_QUERY_PURCHASES_REQUEST = bVar14;
        b bVar15 = new b("AMAZON_PURCHASE_ATTEMPT", 14);
        AMAZON_PURCHASE_ATTEMPT = bVar15;
        b bVar16 = new b("ENTERED_OFFLINE_ENTITLEMENTS_MODE", 15);
        ENTERED_OFFLINE_ENTITLEMENTS_MODE = bVar16;
        b bVar17 = new b("ERROR_ENTERING_OFFLINE_ENTITLEMENTS_MODE", 16);
        ERROR_ENTERING_OFFLINE_ENTITLEMENTS_MODE = bVar17;
        b bVar18 = new b("GOOGLE_PURCHASE_STARTED", 17);
        GOOGLE_PURCHASE_STARTED = bVar18;
        b bVar19 = new b("GOOGLE_PURCHASES_UPDATE_RECEIVED", 18);
        GOOGLE_PURCHASES_UPDATE_RECEIVED = bVar19;
        b bVar20 = new b("GET_OFFERINGS_STARTED", 19);
        GET_OFFERINGS_STARTED = bVar20;
        b bVar21 = new b("GET_OFFERINGS_RESULT", 20);
        GET_OFFERINGS_RESULT = bVar21;
        b bVar22 = new b("GET_PRODUCTS_STARTED", 21);
        GET_PRODUCTS_STARTED = bVar22;
        b bVar23 = new b("GET_PRODUCTS_RESULT", 22);
        GET_PRODUCTS_RESULT = bVar23;
        b bVar24 = new b("PURCHASE_STARTED", 23);
        PURCHASE_STARTED = bVar24;
        b bVar25 = new b("PURCHASE_RESULT", 24);
        PURCHASE_RESULT = bVar25;
        b bVar26 = new b("SYNC_PURCHASES_STARTED", 25);
        SYNC_PURCHASES_STARTED = bVar26;
        b bVar27 = new b("SYNC_PURCHASES_RESULT", 26);
        SYNC_PURCHASES_RESULT = bVar27;
        b bVar28 = new b("RESTORE_PURCHASES_STARTED", 27);
        RESTORE_PURCHASES_STARTED = bVar28;
        b bVar29 = new b("RESTORE_PURCHASES_RESULT", 28);
        RESTORE_PURCHASES_RESULT = bVar29;
        b bVar30 = new b("GET_CUSTOMER_INFO_STARTED", 29);
        GET_CUSTOMER_INFO_STARTED = bVar30;
        b bVar31 = new b("GET_CUSTOMER_INFO_RESULT", 30);
        GET_CUSTOMER_INFO_RESULT = bVar31;
        $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, bVar20, bVar21, bVar22, bVar23, bVar24, bVar25, bVar26, bVar27, bVar28, bVar29, bVar30, bVar31};
    }

    public b() {
        throw null;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
