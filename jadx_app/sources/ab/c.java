package ab;

/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public static final d a(String str) {
        if (str.equals(b.EMAIL.a())) {
            return d.e.f494b;
        }
        if (str.equals(b.DISPLAY_NAME.a())) {
            return d.C0013d.f493b;
        }
        if (str.equals(b.PHONE_NUMBER.a())) {
            return d.h.f503b;
        }
        return str.equals(b.FCM_TOKENS.a()) ? d.f.f495b : new d.c(str);
    }
}
