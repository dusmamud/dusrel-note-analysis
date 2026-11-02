package w0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static void a(MenuItem menuItem, char c10, int i10) {
        menuItem.setAlphabeticShortcut(c10, i10);
    }

    public static void b(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void c(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void d(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void e(MenuItem menuItem, char c10, int i10) {
        menuItem.setNumericShortcut(c10, i10);
    }

    public static void f(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
