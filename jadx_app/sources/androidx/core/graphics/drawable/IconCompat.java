package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f1900k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f1903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f1904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f1907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1908h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f1909i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f1910j;

    public static class a {
        public static Icon a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    public static class b {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    public static class c {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f1901a = -1;
        this.f1903c = null;
        this.f1904d = null;
        this.f1905e = 0;
        this.f1906f = 0;
        this.f1907g = null;
        this.f1908h = f1900k;
        this.f1909i = null;
    }

    public static Bitmap c(Bitmap bitmap, boolean z10) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat d(Resources resources, String str, int i10) {
        str.getClass();
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f1905e = i10;
        if (resources != null) {
            try {
                iconCompat.f1902b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f1902b = str;
        }
        iconCompat.f1910j = str;
        return iconCompat;
    }

    public final int e() {
        int i10 = this.f1901a;
        if (i10 != -1) {
            if (i10 == 2) {
                return this.f1905e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        Object obj = this.f1902b;
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon resource", e11);
            return 0;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon resource", e12);
            return 0;
        }
    }

    public final int f() {
        int i10 = this.f1901a;
        if (i10 != -1) {
            return i10;
        }
        Object obj = this.f1902b;
        if (Build.VERSION.SDK_INT >= 28) {
            return b.c(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e10);
            return -1;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e11);
            return -1;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e12);
            return -1;
        }
    }

    public final Uri g() {
        int i10 = this.f1901a;
        if (i10 != -1) {
            if (i10 == 4 || i10 == 6) {
                return Uri.parse((String) this.f1902b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        Object obj = this.f1902b;
        if (Build.VERSION.SDK_INT >= 28) {
            return b.d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon uri", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon uri", e12);
            return null;
        }
    }

    public final Icon h(Context context) {
        Icon iconCreateWithBitmap;
        int i10 = this.f1901a;
        String strB = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream = null;
        strB = null;
        strB = null;
        switch (i10) {
            case -1:
                return (Icon) this.f1902b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f1902b);
                break;
            case 2:
                if (i10 == -1) {
                    Object obj = this.f1902b;
                    if (Build.VERSION.SDK_INT >= 28) {
                        strB = b.b(obj);
                    } else {
                        try {
                            strB = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e10) {
                            Log.e("IconCompat", "Unable to get icon package", e10);
                        } catch (NoSuchMethodException e11) {
                            Log.e("IconCompat", "Unable to get icon package", e11);
                        } catch (InvocationTargetException e12) {
                            Log.e("IconCompat", "Unable to get icon package", e12);
                        }
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str = this.f1910j;
                    strB = (str == null || TextUtils.isEmpty(str)) ? ((String) this.f1902b).split(":", -1)[0] : this.f1910j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strB, this.f1905e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f1902b, this.f1905e, this.f1906f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f1902b);
                break;
            case 5:
                iconCreateWithBitmap = Build.VERSION.SDK_INT < 26 ? Icon.createWithBitmap(c((Bitmap) this.f1902b, false)) : a.a((Bitmap) this.f1902b);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = c.a(g());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + g());
                    }
                    Uri uriG = g();
                    String scheme = uriG.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriG);
                        } catch (Exception e13) {
                            Log.w("IconCompat", "Unable to load image from URI: " + uriG, e13);
                        }
                        break;
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) this.f1902b));
                        } catch (FileNotFoundException e14) {
                            Log.w("IconCompat", "Unable to load image from path: " + uriG, e14);
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + g());
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(c(BitmapFactory.decodeStream(inputStreamOpenInputStream), false));
                    } else {
                        iconCreateWithBitmap = a.a(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    }
                }
                break;
        }
        ColorStateList colorStateList = this.f1907g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f1908h;
        if (mode != f1900k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f1901a == -1) {
            return String.valueOf(this.f1902b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f1901a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f1901a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f1902b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f1902b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f1910j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(e())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f1905e);
                if (this.f1906f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f1906f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f1902b);
                break;
        }
        if (this.f1907g != null) {
            sb2.append(" tint=");
            sb2.append(this.f1907g);
        }
        if (this.f1908h != f1900k) {
            sb2.append(" mode=");
            sb2.append(this.f1908h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i10) {
        this.f1903c = null;
        this.f1904d = null;
        this.f1905e = 0;
        this.f1906f = 0;
        this.f1907g = null;
        this.f1908h = f1900k;
        this.f1909i = null;
        this.f1901a = i10;
    }
}
