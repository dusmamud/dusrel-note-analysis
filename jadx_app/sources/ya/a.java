package ya;

import com.revenuecat.purchases.common.sdksettings.DiagnosticsSettings;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f37212b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DiagnosticsSettings f37213a;

    public a() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && j.a(this.f37213a, ((a) obj).f37213a);
    }

    public final int hashCode() {
        DiagnosticsSettings diagnosticsSettings = this.f37213a;
        if (diagnosticsSettings == null) {
            return 0;
        }
        return diagnosticsSettings.hashCode();
    }

    public final String toString() {
        return "SdkSettings(diagnostics=" + this.f37213a + ')';
    }

    public a(DiagnosticsSettings diagnosticsSettings) {
        this.f37213a = diagnosticsSettings;
    }
}
