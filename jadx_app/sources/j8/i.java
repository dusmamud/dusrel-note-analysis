package j8;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29217b;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f29216a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new j(this);
    }
}
