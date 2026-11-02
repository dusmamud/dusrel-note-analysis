package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.inotesapp.inotes.R;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f32017f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f32019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f32020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f32021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f32022e;

    public static class a {
        public static Context a(c cVar, Configuration configuration) {
            return cVar.createConfigurationContext(configuration);
        }
    }

    public c() {
        super(null);
    }

    public final void a(Configuration configuration) {
        if (this.f32022e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f32021d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f32021d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f32019b == null) {
            this.f32019b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f32019b.setTo(theme);
            }
        }
        this.f32019b.applyStyle(this.f32018a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f32022e == null) {
            Configuration configuration = this.f32021d;
            if (configuration == null) {
                this.f32022e = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f32017f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f32017f = configuration2;
                    }
                    if (configuration.equals(f32017f)) {
                        this.f32022e = super.getResources();
                    }
                }
                this.f32022e = a.a(this, this.f32021d).getResources();
            }
        }
        return this.f32022e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f32020c == null) {
            this.f32020c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f32020c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f32019b;
        if (theme != null) {
            return theme;
        }
        if (this.f32018a == 0) {
            this.f32018a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f32019b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        if (this.f32018a != i10) {
            this.f32018a = i10;
            b();
        }
    }

    public c(Context context, int i10) {
        super(context);
        this.f32018a = i10;
    }
}
