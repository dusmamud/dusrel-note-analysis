package s0;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f34018a = 0;

    public static final class a {
        public static void a(int i10) {
            SdkExtensions.getExtensionVersion(i10);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            a.a(30);
        }
        if (i10 >= 30) {
            a.a(31);
        }
        if (i10 >= 30) {
            a.a(33);
        }
        if (i10 >= 30) {
            a.a(1000000);
        }
    }

    public static final boolean a(String str) {
        String buildCodename = Build.VERSION.CODENAME;
        Integer num = 0;
        kotlin.jvm.internal.j.e(buildCodename, "buildCodename");
        if (!"REL".equals(buildCodename)) {
            Locale locale = Locale.ROOT;
            String upperCase = buildCodename.toUpperCase(locale);
            kotlin.jvm.internal.j.d(upperCase, "toUpperCase(...)");
            Integer num2 = upperCase.equals("BAKLAVA") ? num : null;
            String upperCase2 = str.toUpperCase(locale);
            kotlin.jvm.internal.j.d(upperCase2, "toUpperCase(...)");
            num = upperCase2.equals("BAKLAVA") ? 0 : null;
            if (num2 == null || num == null) {
                if (num2 == null && num == null) {
                    String upperCase3 = buildCodename.toUpperCase(locale);
                    kotlin.jvm.internal.j.d(upperCase3, "toUpperCase(...)");
                    String upperCase4 = str.toUpperCase(locale);
                    kotlin.jvm.internal.j.d(upperCase4, "toUpperCase(...)");
                    if (upperCase3.compareTo(upperCase4) >= 0) {
                        return true;
                    }
                } else if (num2 != null) {
                    return true;
                }
            } else if (num2.intValue() >= num.intValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return true;
        }
        if (i10 < 32) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        kotlin.jvm.internal.j.d(CODENAME, "CODENAME");
        return a("Tiramisu");
    }
}
