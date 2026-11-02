package j8;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.biometric.BiometricManager;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes.dex */
public final class j extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f29219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29220c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29222e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f29225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f29226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f29227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f29228k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f29229l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f29230m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f29231n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29232o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29218a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29221d = BiometricManager.Authenticators.BIOMETRIC_WEAK;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29223f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f29224g = true;

    public j(i iVar) {
        i iVar2 = new i();
        if (iVar != null) {
            iVar2.f29216a = iVar.f29216a;
            iVar2.f29217b = iVar.f29217b;
        }
        this.f29226i = iVar2;
    }

    public final boolean a() {
        if (!this.f29229l) {
            boolean z10 = false;
            if (this.f29227j.getConstantState() != null && this.f29228k.getConstantState() != null) {
                z10 = true;
            }
            this.f29230m = z10;
            this.f29229l = true;
        }
        return this.f29230m;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        int i10;
        int i11 = this.f29218a;
        int i12 = 0;
        if (i11 == 1) {
            this.f29219b = SystemClock.uptimeMillis();
            this.f29218a = 2;
            z10 = false;
        } else if (i11 == 2 && this.f29219b >= 0) {
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.f29219b) / this.f29222e;
            z10 = fUptimeMillis >= 1.0f;
            if (z10) {
                this.f29218a = 0;
            }
            this.f29223f = (int) ((this.f29220c * Math.min(fUptimeMillis, 1.0f)) + 0.0f);
        } else {
            z10 = true;
        }
        int i13 = this.f29223f;
        Drawable drawable = this.f29227j;
        Drawable drawable2 = this.f29228k;
        boolean z11 = this.f29224g;
        if (!z10) {
            if (z11) {
                drawable.setAlpha(this.f29221d - i13);
                i12 = 1;
            }
            drawable.draw(canvas);
            if (i12 != 0) {
                drawable.setAlpha(this.f29221d);
            }
            if (i13 > 0) {
                drawable2.setAlpha(i13);
                drawable2.draw(canvas);
                drawable2.setAlpha(this.f29221d);
            }
            invalidateSelf();
            return;
        }
        if (z11) {
            if (i13 == 0) {
            }
            i10 = this.f29221d;
            if (i13 == i10) {
                drawable2.setAlpha(i10);
                drawable2.draw(canvas);
            }
        }
        i12 = i13;
        drawable.draw(canvas);
        i13 = i12;
        i10 = this.f29221d;
        if (i13 == i10) {
            drawable2.setAlpha(i10);
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        i iVar = this.f29226i;
        return changingConfigurations | iVar.f29216a | iVar.f29217b;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!a()) {
            return null;
        }
        int changingConfigurations = getChangingConfigurations();
        i iVar = this.f29226i;
        iVar.f29216a = changingConfigurations;
        return iVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f29227j.getIntrinsicHeight(), this.f29228k.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f29227j.getIntrinsicWidth(), this.f29228k.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.f29231n) {
            this.f29232o = Drawable.resolveOpacity(this.f29227j.getOpacity(), this.f29228k.getOpacity());
            this.f29231n = true;
        }
        return this.f29232o;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @CanIgnoreReturnValue
    public final Drawable mutate() {
        if (this.f29225h || super.mutate() != this) {
            return this;
        }
        if (!a()) {
            throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
        }
        this.f29227j.mutate();
        this.f29228k.mutate();
        this.f29225h = true;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f29227j.setBounds(rect);
        this.f29228k.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f29223f == this.f29221d) {
            this.f29223f = i10;
        }
        this.f29221d = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29227j.setColorFilter(colorFilter);
        this.f29228k.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
