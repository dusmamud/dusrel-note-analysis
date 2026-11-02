package q;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextView f33152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Typeface f33153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f33154c;

    public p(TextView textView, Typeface typeface, int i10) {
        this.f33152a = textView;
        this.f33153b = typeface;
        this.f33154c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33152a.setTypeface(this.f33153b, this.f33154c);
    }
}
