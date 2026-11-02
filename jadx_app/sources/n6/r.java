package n6;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f31632a = e6.w.g("PackageManagerHelper");

    public static void a(Context context, Class<?> klazz, boolean enabled) {
        String str = f31632a;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, klazz.getName()));
            boolean z10 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z10 = true;
            }
            if (enabled == z10) {
                e6.w.e().a(str, "Skipping component enablement for ".concat(klazz.getName()));
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, klazz.getName()), enabled ? 1 : 2, 1);
            e6.w wVarE = e6.w.e();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(klazz.getName());
            sb2.append(" ");
            sb2.append(enabled ? "enabled" : "disabled");
            wVarE.a(str, sb2.toString());
        } catch (Exception e10) {
            e6.w wVarE2 = e6.w.e();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(klazz.getName());
            sb3.append("could not be ");
            sb3.append(enabled ? "enabled" : "disabled");
            wVarE2.b(str, sb3.toString(), e10);
        }
    }
}
