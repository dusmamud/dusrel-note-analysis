package ab;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f479a;

    public static abstract class a extends d {

        /* JADX INFO: renamed from: ab.d$a$a, reason: collision with other inner class name */
        public static final class C0009a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0009a f480b = new C0009a(ab.b.ADJUST_ID);
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f481b = new b(ab.b.APPSFLYER_ID);
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f482b = new c(ab.b.APPSTACK_ID);
        }

        /* JADX INFO: renamed from: ab.d$a$d, reason: collision with other inner class name */
        public static final class C0010d extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0010d f483b = new C0010d(ab.b.CLEVER_TAP_ID);
        }

        public static final class e extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f484b = new e(ab.b.FB_ANON_ID);
        }

        public static final class f extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final f f485b = new f(ab.b.MPARTICLE_ID);
        }

        public static final class g extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final g f486b = new g(ab.b.SINGULAR_DEVICE_ID);
        }

        public a(ab.b bVar) {
            super(bVar.a());
        }
    }

    public static abstract class b extends d {

        public static final class a extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f487b = new a(ab.b.AD);
        }

        /* JADX INFO: renamed from: ab.d$b$b, reason: collision with other inner class name */
        public static final class C0011b extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0011b f488b = new C0011b(ab.b.AD_GROUP);
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f489b = new c(ab.b.CAMPAIGN);
        }

        /* JADX INFO: renamed from: ab.d$b$d, reason: collision with other inner class name */
        public static final class C0012d extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0012d f490b = new C0012d(ab.b.CREATIVE);
        }

        public static final class e extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f491b = new e(ab.b.KEYWORD);
        }

        public static final class f extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final f f492b = new f(ab.b.MEDIA_SOURCE);
        }

        public b(ab.b bVar) {
            super(bVar.a());
        }
    }

    public static final class c extends d {
    }

    /* JADX INFO: renamed from: ab.d$d, reason: collision with other inner class name */
    public static final class C0013d extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0013d f493b = new C0013d(ab.b.DISPLAY_NAME.a());
    }

    public static final class e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f494b = new e(ab.b.EMAIL.a());
    }

    public static final class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f495b = new f(ab.b.FCM_TOKENS.a());
    }

    public static abstract class g extends d {

        public static final class a extends g {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f496b = new a(ab.b.AIRSHIP_CHANNEL_ID);
        }

        public static final class b extends g {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f497b = new b(ab.b.FIREBASE_APP_INSTANCE_ID);
        }

        public static final class c extends g {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f498b = new c(ab.b.MIXPANEL_DISTINCT_ID);
        }

        /* JADX INFO: renamed from: ab.d$g$d, reason: collision with other inner class name */
        public static final class C0014d extends g {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0014d f499b = new C0014d(ab.b.ONESIGNAL_ID);
        }

        public static final class e extends g {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f500b = new e(ab.b.ONESIGNAL_USER_ID);
        }

        public static final class f extends g {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final f f501b = new f(ab.b.POSTHOG_USER_ID);
        }

        /* JADX INFO: renamed from: ab.d$g$g, reason: collision with other inner class name */
        public static final class C0015g extends g {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0015g f502b = new C0015g(ab.b.TENJIN_ANALYTICS_INSTALLATION_ID);
        }

        public g(ab.b bVar) {
            super(bVar.a());
        }
    }

    public static final class h extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f503b = new h(ab.b.PHONE_NUMBER.a());
    }

    public d(String str) {
        this.f479a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        j.c(obj, "null cannot be cast to non-null type com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey");
        return j.a(this.f479a, ((d) obj).f479a);
    }

    public final int hashCode() {
        return this.f479a.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.c.a(new StringBuilder("SubscriberAttributeKey('"), this.f479a, "')");
    }
}
