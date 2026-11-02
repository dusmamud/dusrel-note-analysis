package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.biometric.BiometricManager;
import com.google.mlkit.common.MlKitException;
import f0.d;

/* JADX INFO: loaded from: classes.dex */
public class MockView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f1554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f1555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f1556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f1559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f1560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1564k;

    public MockView(Context context) {
        super(context);
        this.f1554a = new Paint();
        this.f1555b = new Paint();
        this.f1556c = new Paint();
        this.f1557d = true;
        this.f1558e = true;
        this.f1559f = null;
        this.f1560g = new Rect();
        this.f1561h = Color.argb(BiometricManager.Authenticators.BIOMETRIC_WEAK, 0, 0, 0);
        this.f1562i = Color.argb(BiometricManager.Authenticators.BIOMETRIC_WEAK, MlKitException.CODE_SCANNER_UNAVAILABLE, MlKitException.CODE_SCANNER_UNAVAILABLE, MlKitException.CODE_SCANNER_UNAVAILABLE);
        this.f1563j = Color.argb(BiometricManager.Authenticators.BIOMETRIC_WEAK, 50, 50, 50);
        this.f1564k = 4;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f26117q);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.f1559f = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 4) {
                    this.f1557d = typedArrayObtainStyledAttributes.getBoolean(index, this.f1557d);
                } else if (index == 0) {
                    this.f1561h = typedArrayObtainStyledAttributes.getColor(index, this.f1561h);
                } else if (index == 2) {
                    this.f1563j = typedArrayObtainStyledAttributes.getColor(index, this.f1563j);
                } else if (index == 3) {
                    this.f1562i = typedArrayObtainStyledAttributes.getColor(index, this.f1562i);
                } else if (index == 5) {
                    this.f1558e = typedArrayObtainStyledAttributes.getBoolean(index, this.f1558e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f1559f == null) {
            try {
                this.f1559f = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        int i11 = this.f1561h;
        Paint paint = this.f1554a;
        paint.setColor(i11);
        paint.setAntiAlias(true);
        int i12 = this.f1562i;
        Paint paint2 = this.f1555b;
        paint2.setColor(i12);
        paint2.setAntiAlias(true);
        this.f1556c.setColor(this.f1563j);
        this.f1564k = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.f1564k);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f1557d) {
            width--;
            height--;
            float f10 = width;
            float f11 = height;
            canvas2 = canvas;
            canvas2.drawLine(0.0f, 0.0f, f10, f11, this.f1554a);
            canvas2.drawLine(0.0f, f11, f10, 0.0f, this.f1554a);
            canvas2.drawLine(0.0f, 0.0f, f10, 0.0f, this.f1554a);
            canvas2.drawLine(f10, 0.0f, f10, f11, this.f1554a);
            canvas2.drawLine(f10, f11, 0.0f, f11, this.f1554a);
            canvas2.drawLine(0.0f, f11, 0.0f, 0.0f, this.f1554a);
        } else {
            canvas2 = canvas;
        }
        String str = this.f1559f;
        if (str == null || !this.f1558e) {
            return;
        }
        int length = str.length();
        Paint paint = this.f1555b;
        Rect rect = this.f1560g;
        paint.getTextBounds(str, 0, length, rect);
        float fWidth = (width - rect.width()) / 2.0f;
        float fHeight = ((height - rect.height()) / 2.0f) + rect.height();
        rect.offset((int) fWidth, (int) fHeight);
        int i10 = rect.left;
        int i11 = this.f1564k;
        rect.set(i10 - i11, rect.top - i11, rect.right + i11, rect.bottom + i11);
        canvas2.drawRect(rect, this.f1556c);
        canvas2.drawText(this.f1559f, fWidth, fHeight, paint);
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1554a = new Paint();
        this.f1555b = new Paint();
        this.f1556c = new Paint();
        this.f1557d = true;
        this.f1558e = true;
        this.f1559f = null;
        this.f1560g = new Rect();
        this.f1561h = Color.argb(BiometricManager.Authenticators.BIOMETRIC_WEAK, 0, 0, 0);
        this.f1562i = Color.argb(BiometricManager.Authenticators.BIOMETRIC_WEAK, MlKitException.CODE_SCANNER_UNAVAILABLE, MlKitException.CODE_SCANNER_UNAVAILABLE, MlKitException.CODE_SCANNER_UNAVAILABLE);
        this.f1563j = Color.argb(BiometricManager.Authenticators.BIOMETRIC_WEAK, 50, 50, 50);
        this.f1564k = 4;
        a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1554a = new Paint();
        this.f1555b = new Paint();
        this.f1556c = new Paint();
        this.f1557d = true;
        this.f1558e = true;
        this.f1559f = null;
        this.f1560g = new Rect();
        this.f1561h = Color.argb(BiometricManager.Authenticators.BIOMETRIC_WEAK, 0, 0, 0);
        this.f1562i = Color.argb(BiometricManager.Authenticators.BIOMETRIC_WEAK, MlKitException.CODE_SCANNER_UNAVAILABLE, MlKitException.CODE_SCANNER_UNAVAILABLE, MlKitException.CODE_SCANNER_UNAVAILABLE);
        this.f1563j = Color.argb(BiometricManager.Authenticators.BIOMETRIC_WEAK, 50, 50, 50);
        this.f1564k = 4;
        a(context, attributeSet);
    }
}
