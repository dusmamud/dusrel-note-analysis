package q;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.inotesapp.inotes.R;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f33156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f33157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f33158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f33159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f33160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f33161g;

    public p0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f33158d = layoutParams;
        this.f33159e = new Rect();
        this.f33160f = new int[2];
        this.f33161g = new int[2];
        this.f33155a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f33156b = viewInflate;
        this.f33157c = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(p0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
