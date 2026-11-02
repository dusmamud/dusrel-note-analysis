package com.amazon.a.b;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f5919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f5920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f5921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f5922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f5923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f5924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f5925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f5926h = "Quit";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f5927i = "Help";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f5928j = "Update";

    static {
        String[] strArr = {f5926h, f5927i};
        com.amazon.a.a.i.c.a aVar = com.amazon.a.a.i.c.a.DEFAULT;
        com.amazon.a.a.i.c.a aVar2 = com.amazon.a.a.i.c.a.HELP;
        f5919a = new com.amazon.a.a.i.c(new String[]{"Amazon Appstore required"}, "Amazon Appstore is not installed on your device. Please install Amazon Appstore and sign in to Amazon to use this app.", strArr, new com.amazon.a.a.i.c.a[]{aVar, aVar2}, true, true, 1, 1);
        f5920b = new com.amazon.a.a.i.c("Amazon Appstore connection failure", "An error occurred connecting to Amazon Appstore. Please try opening this app again", f5926h, true, false);
        f5921c = new com.amazon.a.a.i.c(new String[]{"New Appstore version required", "Amazon Appstore Update Required"}, "Amazon Appstore is out of date.  Please visit the Amazon website to install the latest version of the Appstore. ", new String[]{f5926h, f5927i}, new com.amazon.a.a.i.c.a[]{aVar, aVar2}, true, true, 1, 2);
        f5922d = new com.amazon.a.a.i.c("Internet connection required", "An internet connection is required to open this app. Please connect to the internet and reopen this app.", f5926h, true, false);
        f5923e = new com.amazon.a.a.i.c(new String[]{"Connection error"}, "An unknown error occurred connecting to Amazon Appstore.", new String[]{f5926h, f5927i}, new com.amazon.a.a.i.c.a[]{aVar, aVar2}, true, true, 1, 3);
        f5924f = new com.amazon.a.a.i.c("Internal error", "An internal error occurred, please try opening this app again", f5926h, true, false);
        f5925g = new com.amazon.a.a.i.c("App update required", "Please update this app from the Amazon Appstore.", new String[]{f5926h, f5928j}, new com.amazon.a.a.i.c.a[]{aVar, com.amazon.a.a.i.c.a.DEEPLINK}, true, false, 0);
    }

    private e() {
    }
}
