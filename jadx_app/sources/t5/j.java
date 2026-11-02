package t5;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebSettingsBoundaryInterface f34358a;

    public j(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f34358a = webSettingsBoundaryInterface;
    }

    public void a(boolean z10) {
        this.f34358a.setPaymentRequestEnabled(z10);
    }

    public void b(int i10) {
        this.f34358a.setWebauthnSupport(i10);
    }
}
