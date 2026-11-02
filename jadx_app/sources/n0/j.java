package n0;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static int a(Context context, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId != 0 ? i10 : i11;
    }
}
