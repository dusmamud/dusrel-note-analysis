package n0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f31496a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<b, SparseArray<a>> f31497b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f31498c = new Object();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColorStateList f31499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Configuration f31500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f31501c;

        public a(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f31499a = colorStateList;
            this.f31500b = configuration;
            this.f31501c = theme == null ? 0 : theme.hashCode();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f31502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Resources.Theme f31503b;

        public b(Resources resources, Resources.Theme theme) {
            this.f31502a = resources;
            this.f31503b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f31502a.equals(bVar.f31502a) && Objects.equals(this.f31503b, bVar.f31503b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.f31502a, this.f31503b);
        }
    }

    public static abstract class c {
        public final void a() {
            new Handler(Looper.getMainLooper()).post(new g(this, 0));
        }

        public abstract void b(Typeface typeface);
    }
}
