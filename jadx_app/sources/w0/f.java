package w0;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f35499a;

    public static class a {
        public static int a(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public f(DisplayCutout displayCutout) {
        this.f35499a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f35499a, ((f) obj).f35499a);
    }

    public final int hashCode() {
        return this.f35499a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f35499a + "}";
    }
}
