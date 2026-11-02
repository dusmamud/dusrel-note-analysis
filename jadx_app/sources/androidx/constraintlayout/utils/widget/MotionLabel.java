package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.inotesapp.inotes.R;
import e0.c;
import f0.d;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class MotionLabel extends View implements c {
    public float A;
    public float B;
    public Drawable C;
    public Matrix D;
    public Bitmap E;
    public BitmapShader F;
    public Matrix G;
    public float H;
    public float I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f1572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Path f1573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f1577f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f1578f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f1579g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f1580g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ViewOutlineProvider f1581h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Paint f1582h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RectF f1583i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1584i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f1585j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Rect f1586j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f1587k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Paint f1588k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1589l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f1590l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1591m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f1592m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f1593n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public float f1594n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f1595o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public float f1596o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1597p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f1598p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f1599q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1600r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1601s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1602t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1603u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f1604v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1606x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1607y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f1608z;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            MotionLabel motionLabel = MotionLabel.this;
            int width = motionLabel.getWidth();
            int height = motionLabel.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * motionLabel.f1577f) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            MotionLabel motionLabel = MotionLabel.this;
            outline.setRoundRect(0, 0, motionLabel.getWidth(), motionLabel.getHeight(), motionLabel.f1579g);
        }
    }

    public MotionLabel(Context context) {
        super(context);
        this.f1572a = new TextPaint();
        this.f1573b = new Path();
        this.f1574c = 65535;
        this.f1575d = 65535;
        this.f1576e = false;
        this.f1577f = 0.0f;
        this.f1579g = Float.NaN;
        this.f1585j = 48.0f;
        this.f1587k = Float.NaN;
        this.f1593n = 0.0f;
        this.f1595o = "Hello World";
        this.f1597p = true;
        this.f1599q = new Rect();
        this.f1600r = 1;
        this.f1601s = 1;
        this.f1602t = 1;
        this.f1603u = 1;
        this.f1605w = 8388659;
        this.f1606x = 0;
        this.f1607y = false;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.f1578f0 = 0.0f;
        this.f1580g0 = 0.0f;
        this.f1582h0 = new Paint();
        this.f1584i0 = 0;
        this.f1592m0 = Float.NaN;
        this.f1594n0 = Float.NaN;
        this.f1596o0 = Float.NaN;
        this.f1598p0 = Float.NaN;
        c(context, null);
    }

    private float getHorizontalOffset() {
        float f10 = Float.isNaN(this.f1587k) ? 1.0f : this.f1585j / this.f1587k;
        String str = this.f1595o;
        return ((this.f1578f0 + 1.0f) * ((((Float.isNaN(this.A) ? getMeasuredWidth() : this.A) - getPaddingLeft()) - getPaddingRight()) - (this.f1572a.measureText(str, 0, str.length()) * f10))) / 2.0f;
    }

    private float getVerticalOffset() {
        float f10 = Float.isNaN(this.f1587k) ? 1.0f : this.f1585j / this.f1587k;
        Paint.FontMetrics fontMetrics = this.f1572a.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.B) ? getMeasuredHeight() : this.B) - getPaddingTop()) - getPaddingBottom();
        float f11 = fontMetrics.descent;
        float f12 = fontMetrics.ascent;
        return (((1.0f - this.f1580g0) * (measuredHeight - ((f11 - f12) * f10))) / 2.0f) - (f10 * f12);
    }

    private void setUpTheme(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        int i10 = typedValue.data;
        this.f1574c = i10;
        this.f1572a.setColor(i10);
    }

    @Override // e0.c
    public final void a(float f10, float f11, float f12, float f13) {
        int i10 = (int) (f10 + 0.5f);
        this.f1608z = f10 - i10;
        int i11 = (int) (f12 + 0.5f);
        int i12 = i11 - i10;
        int i13 = (int) (f13 + 0.5f);
        int i14 = (int) (0.5f + f11);
        int i15 = i13 - i14;
        float f14 = f12 - f10;
        this.A = f14;
        float f15 = f13 - f11;
        this.B = f15;
        if (this.G != null) {
            this.A = f14;
            this.B = f15;
            d();
        }
        if (getMeasuredHeight() == i15 && getMeasuredWidth() == i12) {
            super.layout(i10, i14, i11, i13);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
            super.layout(i10, i14, i11, i13);
        }
        if (this.f1607y) {
            Rect rect = this.f1586j0;
            TextPaint textPaint = this.f1572a;
            if (rect == null) {
                this.f1588k0 = new Paint();
                this.f1586j0 = new Rect();
                this.f1588k0.set(textPaint);
                this.f1590l0 = this.f1588k0.getTextSize();
            }
            this.A = f14;
            this.B = f15;
            Paint paint = this.f1588k0;
            String str = this.f1595o;
            paint.getTextBounds(str, 0, str.length(), this.f1586j0);
            int iWidth = this.f1586j0.width();
            float fHeight = this.f1586j0.height() * 1.3f;
            float f16 = (f14 - this.f1601s) - this.f1600r;
            float f17 = (f15 - this.f1603u) - this.f1602t;
            float f18 = iWidth;
            if (f18 * f17 > fHeight * f16) {
                textPaint.setTextSize((this.f1590l0 * f16) / f18);
            } else {
                textPaint.setTextSize((this.f1590l0 * f17) / fHeight);
            }
            if (this.f1576e || !Float.isNaN(this.f1587k)) {
                b(Float.isNaN(this.f1587k) ? 1.0f : this.f1585j / this.f1587k);
            }
        }
    }

    public final void b(float f10) {
        if (this.f1576e || f10 != 1.0f) {
            this.f1573b.reset();
            String str = this.f1595o;
            int length = str.length();
            TextPaint textPaint = this.f1572a;
            Rect rect = this.f1599q;
            textPaint.getTextBounds(str, 0, length, rect);
            textPaint.getTextPath(str, 0, length, 0.0f, 0.0f, this.f1573b);
            if (f10 != 1.0f) {
                Log.v("MotionLabel", e0.a.a() + " scale " + f10);
                Matrix matrix = new Matrix();
                matrix.postScale(f10, f10);
                this.f1573b.transform(matrix);
            }
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.f1597p = false;
        }
    }

    public final void c(Context context, AttributeSet attributeSet) {
        Typeface typefaceCreate;
        setUpTheme(context);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.f26121u);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 5) {
                    setText(typedArrayObtainStyledAttributes.getText(index));
                } else if (index == 7) {
                    this.f1604v = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 11) {
                    this.f1587k = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f1587k);
                } else if (index == 0) {
                    this.f1585j = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f1585j);
                } else if (index == 2) {
                    this.f1589l = typedArrayObtainStyledAttributes.getInt(index, this.f1589l);
                } else if (index == 1) {
                    this.f1591m = typedArrayObtainStyledAttributes.getInt(index, this.f1591m);
                } else if (index == 3) {
                    this.f1574c = typedArrayObtainStyledAttributes.getColor(index, this.f1574c);
                } else if (index == 9) {
                    float dimension = typedArrayObtainStyledAttributes.getDimension(index, this.f1579g);
                    this.f1579g = dimension;
                    setRound(dimension);
                } else if (index == 10) {
                    float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f1577f);
                    this.f1577f = f10;
                    setRoundPercent(f10);
                } else if (index == 4) {
                    setGravity(typedArrayObtainStyledAttributes.getInt(index, -1));
                } else if (index == 8) {
                    this.f1606x = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 17) {
                    this.f1575d = typedArrayObtainStyledAttributes.getInt(index, this.f1575d);
                    this.f1576e = true;
                } else if (index == 18) {
                    this.f1593n = typedArrayObtainStyledAttributes.getDimension(index, this.f1593n);
                    this.f1576e = true;
                } else if (index == 12) {
                    this.C = typedArrayObtainStyledAttributes.getDrawable(index);
                    this.f1576e = true;
                } else if (index == 13) {
                    this.f1592m0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1592m0);
                } else if (index == 14) {
                    this.f1594n0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1594n0);
                } else if (index == 19) {
                    this.f1578f0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1578f0);
                } else if (index == 20) {
                    this.f1580g0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1580g0);
                } else if (index == 15) {
                    this.f1598p0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1598p0);
                } else if (index == 16) {
                    this.f1596o0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1596o0);
                } else if (index == 23) {
                    this.H = typedArrayObtainStyledAttributes.getDimension(index, this.H);
                } else if (index == 24) {
                    this.I = typedArrayObtainStyledAttributes.getDimension(index, this.I);
                } else if (index == 22) {
                    this.f1584i0 = typedArrayObtainStyledAttributes.getInt(index, this.f1584i0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.C != null) {
            this.G = new Matrix();
            int intrinsicWidth = this.C.getIntrinsicWidth();
            int intrinsicHeight = this.C.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.I) ? 128 : (int) this.I;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.H) ? 128 : (int) this.H;
            }
            if (this.f1584i0 != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.E = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.E);
            this.C.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.C.setFilterBitmap(true);
            this.C.draw(canvas);
            if (this.f1584i0 != 0) {
                Bitmap bitmap = this.E;
                int width = bitmap.getWidth() / 2;
                int height = bitmap.getHeight() / 2;
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
                for (int i11 = 0; i11 < 4 && width >= 32 && height >= 32; i11++) {
                    width /= 2;
                    height /= 2;
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, width, height, true);
                }
                this.E = bitmapCreateScaledBitmap;
            }
            Bitmap bitmap2 = this.E;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.F = new BitmapShader(bitmap2, tileMode, tileMode);
        }
        this.f1600r = getPaddingLeft();
        this.f1601s = getPaddingRight();
        this.f1602t = getPaddingTop();
        this.f1603u = getPaddingBottom();
        String str = this.f1604v;
        int i12 = this.f1591m;
        int i13 = this.f1589l;
        TextPaint textPaint = this.f1572a;
        if (str != null) {
            typefaceCreate = Typeface.create(str, i13);
            if (typefaceCreate != null) {
                setTypeface(typefaceCreate);
            }
            textPaint.setColor(this.f1574c);
            textPaint.setStrokeWidth(this.f1593n);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            textPaint.setFlags(128);
            setTextSize(this.f1585j);
            textPaint.setAntiAlias(true);
        }
        typefaceCreate = null;
        if (i12 == 1) {
            typefaceCreate = Typeface.SANS_SERIF;
        } else if (i12 == 2) {
            typefaceCreate = Typeface.SERIF;
        } else if (i12 == 3) {
            typefaceCreate = Typeface.MONOSPACE;
        }
        if (i13 > 0) {
            Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(i13) : Typeface.create(typefaceCreate, i13);
            setTypeface(typefaceDefaultFromStyle);
            int i14 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i13;
            textPaint.setFakeBoldText((i14 & 1) != 0);
            textPaint.setTextSkewX((i14 & 2) != 0 ? -0.25f : 0.0f);
        } else {
            textPaint.setFakeBoldText(false);
            textPaint.setTextSkewX(0.0f);
            setTypeface(typefaceCreate);
        }
        textPaint.setColor(this.f1574c);
        textPaint.setStrokeWidth(this.f1593n);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint.setFlags(128);
        setTextSize(this.f1585j);
        textPaint.setAntiAlias(true);
    }

    public final void d() {
        float f10 = Float.isNaN(this.f1592m0) ? 0.0f : this.f1592m0;
        float f11 = Float.isNaN(this.f1594n0) ? 0.0f : this.f1594n0;
        float f12 = Float.isNaN(this.f1596o0) ? 1.0f : this.f1596o0;
        float f13 = Float.isNaN(this.f1598p0) ? 0.0f : this.f1598p0;
        this.G.reset();
        float width = this.E.getWidth();
        float height = this.E.getHeight();
        float f14 = Float.isNaN(this.I) ? this.A : this.I;
        float f15 = Float.isNaN(this.H) ? this.B : this.H;
        float f16 = f12 * (width * f15 < height * f14 ? f14 / width : f15 / height);
        this.G.postScale(f16, f16);
        float f17 = width * f16;
        float f18 = f14 - f17;
        float f19 = f16 * height;
        float f20 = f15 - f19;
        if (!Float.isNaN(this.H)) {
            f20 = this.H / 2.0f;
        }
        if (!Float.isNaN(this.I)) {
            f18 = this.I / 2.0f;
        }
        this.G.postTranslate((((f10 * f18) + f14) - f17) * 0.5f, (((f11 * f20) + f15) - f19) * 0.5f);
        this.G.postRotate(f13, f14 / 2.0f, f15 / 2.0f);
        this.F.setLocalMatrix(this.G);
    }

    public float getRound() {
        return this.f1579g;
    }

    public float getRoundPercent() {
        return this.f1577f;
    }

    public float getScaleFromTextSize() {
        return this.f1587k;
    }

    public float getTextBackgroundPanX() {
        return this.f1592m0;
    }

    public float getTextBackgroundPanY() {
        return this.f1594n0;
    }

    public float getTextBackgroundRotate() {
        return this.f1598p0;
    }

    public float getTextBackgroundZoom() {
        return this.f1596o0;
    }

    public int getTextOutlineColor() {
        return this.f1575d;
    }

    public float getTextPanX() {
        return this.f1578f0;
    }

    public float getTextPanY() {
        return this.f1580g0;
    }

    public float getTextureHeight() {
        return this.H;
    }

    public float getTextureWidth() {
        return this.I;
    }

    public Typeface getTypeface() {
        return this.f1572a.getTypeface();
    }

    @Override // android.view.View
    public final void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        boolean zIsNaN = Float.isNaN(this.f1587k);
        float f10 = zIsNaN ? 1.0f : this.f1585j / this.f1587k;
        this.A = i12 - i10;
        this.B = i13 - i11;
        if (this.f1607y) {
            Rect rect = this.f1586j0;
            TextPaint textPaint = this.f1572a;
            if (rect == null) {
                this.f1588k0 = new Paint();
                this.f1586j0 = new Rect();
                this.f1588k0.set(textPaint);
                this.f1590l0 = this.f1588k0.getTextSize();
            }
            Paint paint = this.f1588k0;
            String str = this.f1595o;
            paint.getTextBounds(str, 0, str.length(), this.f1586j0);
            int iWidth = this.f1586j0.width();
            int iHeight = (int) (this.f1586j0.height() * 1.3f);
            float f11 = (this.A - this.f1601s) - this.f1600r;
            float f12 = (this.B - this.f1603u) - this.f1602t;
            if (zIsNaN) {
                float f13 = iWidth;
                float f14 = iHeight;
                if (f13 * f12 > f14 * f11) {
                    textPaint.setTextSize((this.f1590l0 * f11) / f13);
                } else {
                    textPaint.setTextSize((this.f1590l0 * f12) / f14);
                }
            } else {
                float f15 = iWidth;
                float f16 = iHeight;
                f10 = f15 * f12 > f16 * f11 ? f11 / f15 : f12 / f16;
            }
        }
        if (this.f1576e || !zIsNaN) {
            float f17 = i10;
            float f18 = i11;
            float f19 = i12;
            float f20 = i13;
            if (this.G != null) {
                this.A = f19 - f17;
                this.B = f20 - f18;
                d();
            }
            b(f10);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10 = Float.isNaN(this.f1587k) ? 1.0f : this.f1585j / this.f1587k;
        super.onDraw(canvas);
        boolean z10 = this.f1576e;
        TextPaint textPaint = this.f1572a;
        if (!z10 && f10 == 1.0f) {
            canvas.drawText(this.f1595o, this.f1608z + this.f1600r + getHorizontalOffset(), this.f1602t + getVerticalOffset(), textPaint);
            return;
        }
        if (this.f1597p) {
            b(f10);
        }
        if (this.D == null) {
            this.D = new Matrix();
        }
        if (!this.f1576e) {
            float horizontalOffset = this.f1600r + getHorizontalOffset();
            float verticalOffset = this.f1602t + getVerticalOffset();
            this.D.reset();
            this.D.preTranslate(horizontalOffset, verticalOffset);
            this.f1573b.transform(this.D);
            textPaint.setColor(this.f1574c);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            textPaint.setStrokeWidth(this.f1593n);
            canvas.drawPath(this.f1573b, textPaint);
            this.D.reset();
            this.D.preTranslate(-horizontalOffset, -verticalOffset);
            this.f1573b.transform(this.D);
            return;
        }
        Paint paint = this.f1582h0;
        paint.set(textPaint);
        this.D.reset();
        float horizontalOffset2 = this.f1600r + getHorizontalOffset();
        float verticalOffset2 = this.f1602t + getVerticalOffset();
        this.D.postTranslate(horizontalOffset2, verticalOffset2);
        this.D.preScale(f10, f10);
        this.f1573b.transform(this.D);
        if (this.F != null) {
            textPaint.setFilterBitmap(true);
            textPaint.setShader(this.F);
        } else {
            textPaint.setColor(this.f1574c);
        }
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setStrokeWidth(this.f1593n);
        canvas.drawPath(this.f1573b, textPaint);
        if (this.F != null) {
            textPaint.setShader(null);
        }
        textPaint.setColor(this.f1575d);
        textPaint.setStyle(Paint.Style.STROKE);
        textPaint.setStrokeWidth(this.f1593n);
        canvas.drawPath(this.f1573b, textPaint);
        this.D.reset();
        this.D.postTranslate(-horizontalOffset2, -verticalOffset2);
        this.f1573b.transform(this.D);
        textPaint.set(paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f1607y = false;
        this.f1600r = getPaddingLeft();
        this.f1601s = getPaddingRight();
        this.f1602t = getPaddingTop();
        this.f1603u = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            String str = this.f1595o;
            int length = str.length();
            TextPaint textPaint = this.f1572a;
            Rect rect = this.f1599q;
            textPaint.getTextBounds(str, 0, length, rect);
            if (mode != 1073741824) {
                size = (int) (rect.width() + 0.99999f);
            }
            size += this.f1600r + this.f1601s;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (textPaint.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f1602t + this.f1603u + fontMetricsInt;
            }
        } else if (this.f1606x != 0) {
            this.f1607y = true;
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i10) {
        if ((i10 & 8388615) == 0) {
            i10 |= 8388611;
        }
        if ((i10 & 112) == 0) {
            i10 |= 48;
        }
        if (i10 != this.f1605w) {
            invalidate();
        }
        this.f1605w = i10;
        int i11 = i10 & 112;
        if (i11 == 48) {
            this.f1580g0 = -1.0f;
        } else if (i11 != 80) {
            this.f1580g0 = 0.0f;
        } else {
            this.f1580g0 = 1.0f;
        }
        int i12 = i10 & 8388615;
        if (i12 != 3) {
            if (i12 != 5) {
                if (i12 != 8388611) {
                    if (i12 != 8388613) {
                        this.f1578f0 = 0.0f;
                        return;
                    }
                }
            }
            this.f1578f0 = 1.0f;
            return;
        }
        this.f1578f0 = -1.0f;
    }

    public void setRound(float f10) {
        if (Float.isNaN(f10)) {
            this.f1579g = f10;
            float f11 = this.f1577f;
            this.f1577f = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z10 = this.f1579g != f10;
        this.f1579g = f10;
        if (f10 != 0.0f) {
            if (this.f1573b == null) {
                this.f1573b = new Path();
            }
            if (this.f1583i == null) {
                this.f1583i = new RectF();
            }
            if (this.f1581h == null) {
                b bVar = new b();
                this.f1581h = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f1583i.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f1573b.reset();
            Path path = this.f1573b;
            RectF rectF = this.f1583i;
            float f12 = this.f1579g;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f10) {
        boolean z10 = this.f1577f != f10;
        this.f1577f = f10;
        if (f10 != 0.0f) {
            if (this.f1573b == null) {
                this.f1573b = new Path();
            }
            if (this.f1583i == null) {
                this.f1583i = new RectF();
            }
            if (this.f1581h == null) {
                a aVar = new a();
                this.f1581h = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f1577f) / 2.0f;
            this.f1583i.set(0.0f, 0.0f, width, height);
            this.f1573b.reset();
            this.f1573b.addRoundRect(this.f1583i, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f10) {
        this.f1587k = f10;
    }

    public void setText(CharSequence charSequence) {
        this.f1595o = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f10) {
        this.f1592m0 = f10;
        d();
        invalidate();
    }

    public void setTextBackgroundPanY(float f10) {
        this.f1594n0 = f10;
        d();
        invalidate();
    }

    public void setTextBackgroundRotate(float f10) {
        this.f1598p0 = f10;
        d();
        invalidate();
    }

    public void setTextBackgroundZoom(float f10) {
        this.f1596o0 = f10;
        d();
        invalidate();
    }

    public void setTextFillColor(int i10) {
        this.f1574c = i10;
        invalidate();
    }

    public void setTextOutlineColor(int i10) {
        this.f1575d = i10;
        this.f1576e = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f10) {
        this.f1593n = f10;
        this.f1576e = true;
        if (Float.isNaN(f10)) {
            this.f1593n = 1.0f;
            this.f1576e = false;
        }
        invalidate();
    }

    public void setTextPanX(float f10) {
        this.f1578f0 = f10;
        invalidate();
    }

    public void setTextPanY(float f10) {
        this.f1580g0 = f10;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f1585j = f10;
        if (!Float.isNaN(this.f1587k)) {
            f10 = this.f1587k;
        }
        this.f1572a.setTextSize(f10);
        b(Float.isNaN(this.f1587k) ? 1.0f : this.f1585j / this.f1587k);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f10) {
        this.H = f10;
        d();
        invalidate();
    }

    public void setTextureWidth(float f10) {
        this.I = f10;
        d();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        TextPaint textPaint = this.f1572a;
        if (Objects.equals(textPaint.getTypeface(), typeface)) {
            return;
        }
        textPaint.setTypeface(typeface);
    }

    public MotionLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1572a = new TextPaint();
        this.f1573b = new Path();
        this.f1574c = 65535;
        this.f1575d = 65535;
        this.f1576e = false;
        this.f1577f = 0.0f;
        this.f1579g = Float.NaN;
        this.f1585j = 48.0f;
        this.f1587k = Float.NaN;
        this.f1593n = 0.0f;
        this.f1595o = "Hello World";
        this.f1597p = true;
        this.f1599q = new Rect();
        this.f1600r = 1;
        this.f1601s = 1;
        this.f1602t = 1;
        this.f1603u = 1;
        this.f1605w = 8388659;
        this.f1606x = 0;
        this.f1607y = false;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.f1578f0 = 0.0f;
        this.f1580g0 = 0.0f;
        this.f1582h0 = new Paint();
        this.f1584i0 = 0;
        this.f1592m0 = Float.NaN;
        this.f1594n0 = Float.NaN;
        this.f1596o0 = Float.NaN;
        this.f1598p0 = Float.NaN;
        c(context, attributeSet);
    }

    public MotionLabel(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1572a = new TextPaint();
        this.f1573b = new Path();
        this.f1574c = 65535;
        this.f1575d = 65535;
        this.f1576e = false;
        this.f1577f = 0.0f;
        this.f1579g = Float.NaN;
        this.f1585j = 48.0f;
        this.f1587k = Float.NaN;
        this.f1593n = 0.0f;
        this.f1595o = "Hello World";
        this.f1597p = true;
        this.f1599q = new Rect();
        this.f1600r = 1;
        this.f1601s = 1;
        this.f1602t = 1;
        this.f1603u = 1;
        this.f1605w = 8388659;
        this.f1606x = 0;
        this.f1607y = false;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.f1578f0 = 0.0f;
        this.f1580g0 = 0.0f;
        this.f1582h0 = new Paint();
        this.f1584i0 = 0;
        this.f1592m0 = Float.NaN;
        this.f1594n0 = Float.NaN;
        this.f1596o0 = Float.NaN;
        this.f1598p0 = Float.NaN;
        c(context, attributeSet);
    }
}
