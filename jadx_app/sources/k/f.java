package k;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import com.google.android.gms.internal.p000firebaseauthapi.j3;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import q.b0;
import q.q0;
import q.r0;
import w0.c0;
import w0.f0;
import w0.g0;
import w0.l0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends k.e implements androidx.appcompat.view.menu.f.a, LayoutInflater.Factory2 {
    public static final x.h<String, Integer> B0 = new x.h<>();
    public static final int[] C0 = {R.attr.windowBackground};
    public static final boolean D0 = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean E0 = true;
    public boolean A;
    public OnBackInvokedCallback A0;
    public ViewGroup B;
    public TextView C;
    public View D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public m[] f29458f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public m f29459g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f29460h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f29461i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f29462j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f29463j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f29464k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f29465k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Window f29466l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public Configuration f29467l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f29468m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final int f29469m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f29470n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f29471n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k.a f29472o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f29473o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public o.f f29474p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f29475p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f29476q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public k f29477q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public q.r f29478r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public i f29479r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public d f29480s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f29481s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public n f29482t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f29483t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public o.a f29484u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ActionBarContextView f29486v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f29487v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PopupWindow f29488w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public Rect f29489w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public k.h f29490x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Rect f29491x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public r f29493y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public OnBackInvokedDispatcher f29495z0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public l0 f29492y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f29494z = true;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final a f29485u0 = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f fVar = f.this;
            if ((fVar.f29483t0 & 1) != 0) {
                fVar.L(0);
            }
            if ((fVar.f29483t0 & 4096) != 0) {
                fVar.L(108);
            }
            fVar.f29481s0 = false;
            fVar.f29483t0 = 0;
        }
    }

    public class b implements k.b {
    }

    public interface c {
    }

    public final class d implements androidx.appcompat.view.menu.j.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z10) {
            f.this.H(fVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean c(androidx.appcompat.view.menu.f fVar) {
            Window.Callback callback = f.this.f29466l.getCallback();
            if (callback == null) {
                return true;
            }
            callback.onMenuOpened(108, fVar);
            return true;
        }
    }

    public class e implements o.a.InterfaceC0219a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o.a.InterfaceC0219a f29498a;

        public class a extends com.google.android.gms.internal.p000firebaseauthapi.g {
            public a() {
            }

            @Override // w0.m0
            public final void c() {
                f fVar = f.this;
                fVar.f29486v.setVisibility(8);
                PopupWindow popupWindow = fVar.f29488w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.f29486v.getParent() instanceof View) {
                    View view = (View) fVar.f29486v.getParent();
                    WeakHashMap<View, l0> weakHashMap = g0.f35505a;
                    view.requestApplyInsets();
                }
                fVar.f29486v.h();
                fVar.f29492y.d(null);
                fVar.f29492y = null;
                ViewGroup viewGroup = fVar.B;
                WeakHashMap<View, l0> weakHashMap2 = g0.f35505a;
                viewGroup.requestApplyInsets();
            }
        }

        public e(o.a.InterfaceC0219a interfaceC0219a) {
            this.f29498a = interfaceC0219a;
        }

        @Override // o.a.InterfaceC0219a
        public final boolean a(o.a aVar, MenuItem menuItem) {
            return this.f29498a.a(aVar, menuItem);
        }

        @Override // o.a.InterfaceC0219a
        public final boolean b(o.a aVar, Menu menu) {
            ViewGroup viewGroup = f.this.B;
            WeakHashMap<View, l0> weakHashMap = g0.f35505a;
            viewGroup.requestApplyInsets();
            return this.f29498a.b(aVar, menu);
        }

        @Override // o.a.InterfaceC0219a
        public final boolean c(o.a aVar, Menu menu) {
            return this.f29498a.c(aVar, menu);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, k.c] */
        @Override // o.a.InterfaceC0219a
        public final void d(o.a aVar) {
            this.f29498a.d(aVar);
            f fVar = f.this;
            if (fVar.f29488w != null) {
                fVar.f29466l.getDecorView().removeCallbacks(fVar.f29490x);
            }
            if (fVar.f29486v != null) {
                l0 l0Var = fVar.f29492y;
                if (l0Var != null) {
                    l0Var.b();
                }
                l0 l0VarA = g0.a(fVar.f29486v);
                l0VarA.a(0.0f);
                fVar.f29492y = l0VarA;
                l0VarA.d(new a());
            }
            ?? r10 = fVar.f29470n;
            if (r10 != 0) {
                r10.onSupportActionModeFinished(fVar.f29484u);
            }
            fVar.f29484u = null;
            ViewGroup viewGroup = fVar.B;
            WeakHashMap<View, l0> weakHashMap = g0.f35505a;
            viewGroup.requestApplyInsets();
            fVar.Y();
        }
    }

    /* JADX INFO: renamed from: k.f$f, reason: collision with other inner class name */
    public static class C0191f {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static s0.h b(Configuration configuration) {
            return s0.h.a(configuration.getLocales().toLanguageTags());
        }

        public static void c(s0.h hVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(hVar.f34025a.f34026a.toLanguageTags()));
        }

        public static void d(Configuration configuration, s0.h hVar) {
            configuration.setLocales(LocaleList.forLanguageTags(hVar.f34025a.f34026a.toLanguageTags()));
        }
    }

    public static class g {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.window.OnBackInvokedCallback, k.o] */
        public static OnBackInvokedCallback b(Object obj, final f fVar) {
            Objects.requireNonNull(fVar);
            ?? r10 = new OnBackInvokedCallback() { // from class: k.o
                public final void onBackInvoked() {
                    fVar.T();
                }
            };
            k.k.a(obj).registerOnBackInvokedCallback(1000000, r10);
            return r10;
        }

        public static void c(Object obj, Object obj2) {
            k.k.a(obj).unregisterOnBackInvokedCallback(k.j.b(obj2));
        }
    }

    public class i extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PowerManager f29506c;

        public i(Context context) {
            super();
            this.f29506c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // k.f.j
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // k.f.j
        public final int c() {
            return this.f29506c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // k.f.j
        public final void d() throws IllegalAccessException {
            f.this.D(true, true);
        }
    }

    public abstract class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f29508a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                j.this.d();
            }
        }

        public j() {
        }

        public final void a() {
            a aVar = this.f29508a;
            if (aVar != null) {
                try {
                    f.this.f29464k.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f29508a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f29508a == null) {
                this.f29508a = new a();
            }
            f.this.f29464k.registerReceiver(this.f29508a, intentFilterB);
        }
    }

    public class k extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final w f29511c;

        public k(w wVar) {
            super();
            this.f29511c = wVar;
        }

        @Override // k.f.j
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // k.f.j
        public final int c() {
            Location location;
            boolean z10;
            long j10;
            Location lastKnownLocation;
            w wVar = this.f29511c;
            w.a aVar = wVar.f29584c;
            LocationManager locationManager = wVar.f29583b;
            if (aVar.f29586b > System.currentTimeMillis()) {
                z10 = aVar.f29585a;
            } else {
                Context context = wVar.f29582a;
                Location lastKnownLocation2 = null;
                if (j3.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    try {
                        lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                    } catch (Exception e10) {
                        Log.d("TwilightManager", "Failed to get last known location", e10);
                    }
                    location = lastKnownLocation;
                } else {
                    location = null;
                }
                if (j3.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("gps")) {
                            lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                        }
                    } catch (Exception e11) {
                        Log.d("TwilightManager", "Failed to get last known location", e11);
                    }
                }
                if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                    location = lastKnownLocation2;
                }
                z10 = false;
                if (location != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (v.f29577d == null) {
                        v.f29577d = new v();
                    }
                    v vVar = v.f29577d;
                    vVar.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                    vVar.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                    z10 = vVar.f29580c == 1;
                    long j11 = vVar.f29579b;
                    long j12 = vVar.f29578a;
                    vVar.a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                    long j13 = vVar.f29579b;
                    if (j11 == -1 || j12 == -1) {
                        j10 = jCurrentTimeMillis + 43200000;
                    } else {
                        if (jCurrentTimeMillis > j12) {
                            j11 = j13;
                        } else if (jCurrentTimeMillis > j11) {
                            j11 = j12;
                        }
                        j10 = j11 + 60000;
                    }
                    aVar.f29585a = z10;
                    aVar.f29586b = j10;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i10 = Calendar.getInstance().get(11);
                    if (i10 < 6 || i10 >= 22) {
                        z10 = true;
                    }
                }
            }
            return z10 ? 2 : 1;
        }

        @Override // k.f.j
        public final void d() throws IllegalAccessException {
            f.this.D(true, true);
        }
    }

    public class l extends ContentFrameLayout {
        public l(o.c cVar) {
            super(cVar);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.K(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x4 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (x4 < -5 || y10 < -5 || x4 > getWidth() + 5 || y10 > getHeight() + 5) {
                    f fVar = f.this;
                    fVar.I(fVar.P(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i10) {
            setBackgroundDrawable(l.a.b(getContext(), i10));
        }
    }

    public static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f29514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f29515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f29516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f29517d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public l f29518e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f29519f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f29520g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public androidx.appcompat.view.menu.f f29521h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public androidx.appcompat.view.menu.d f29522i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public o.c f29523j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f29524k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f29525l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f29526m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f29527n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f29528o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Bundle f29529p;
    }

    public final class n implements androidx.appcompat.view.menu.j.a {
        public n() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z10) {
            m mVar;
            androidx.appcompat.view.menu.f fVarK = fVar.k();
            int i10 = 0;
            boolean z11 = fVarK != fVar;
            if (z11) {
                fVar = fVarK;
            }
            f fVar2 = f.this;
            m[] mVarArr = fVar2.f29458f0;
            int length = mVarArr != null ? mVarArr.length : 0;
            while (true) {
                if (i10 < length) {
                    mVar = mVarArr[i10];
                    if (mVar != null && mVar.f29521h == fVar) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    mVar = null;
                    break;
                }
            }
            if (mVar != null) {
                if (!z11) {
                    fVar2.I(mVar, z10);
                } else {
                    fVar2.G(mVar.f29514a, mVar, fVarK);
                    fVar2.I(mVar, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean c(androidx.appcompat.view.menu.f fVar) {
            Window.Callback callback;
            if (fVar != fVar.k()) {
                return true;
            }
            f fVar2 = f.this;
            if (!fVar2.G || (callback = fVar2.f29466l.getCallback()) == null || fVar2.f29465k0) {
                return true;
            }
            callback.onMenuOpened(108, fVar);
            return true;
        }
    }

    public f(Context context, Window window, k.c cVar, Object obj) {
        AppCompatActivity appCompatActivity = null;
        this.f29469m0 = -100;
        this.f29464k = context;
        this.f29470n = cVar;
        this.f29462j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AppCompatActivity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    appCompatActivity = (AppCompatActivity) context;
                    break;
                }
            }
            if (appCompatActivity != null) {
                this.f29469m0 = appCompatActivity.getDelegate().h();
            }
        }
        if (this.f29469m0 == -100) {
            String name = this.f29462j.getClass().getName();
            x.h<String, Integer> hVar = B0;
            Integer num = hVar.get(name);
            if (num != null) {
                this.f29469m0 = num.intValue();
                hVar.remove(this.f29462j.getClass().getName());
            }
        }
        if (window != null) {
            E(window);
        }
        q.g.c();
    }

    public static s0.h F(Context context) {
        s0.h hVar;
        s0.h hVar2;
        if (Build.VERSION.SDK_INT >= 33 || (hVar = k.e.f29451c) == null) {
            return null;
        }
        s0.h hVarB = C0191f.b(context.getApplicationContext().getResources().getConfiguration());
        LocaleList localeList = hVar.f34025a.f34026a;
        if (localeList.isEmpty()) {
            hVar2 = s0.h.f34024b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i10 = 0;
            while (i10 < hVarB.f34025a.f34026a.size() + localeList.size()) {
                Locale locale = i10 < localeList.size() ? localeList.get(i10) : hVarB.f34025a.f34026a.get(i10 - localeList.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i10++;
            }
            hVar2 = new s0.h(new s0.j(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return hVar2.f34025a.f34026a.isEmpty() ? hVarB : hVar2;
    }

    public static Configuration J(Context context, int i10, s0.h hVar, Configuration configuration, boolean z10) {
        int i11;
        if (i10 == 1) {
            i11 = 16;
        } else if (i10 != 2) {
            i11 = z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i11 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (hVar != null) {
            C0191f.d(configuration2, hVar);
        }
        return configuration2;
    }

    @Override // k.e
    public final void A(int i10) {
        this.f29471n0 = i10;
    }

    @Override // k.e
    public final void B(CharSequence charSequence) {
        this.f29476q = charSequence;
        q.r rVar = this.f29478r;
        if (rVar != null) {
            rVar.setWindowTitle(charSequence);
            return;
        }
        k.a aVar = this.f29472o;
        if (aVar != null) {
            aVar.n(charSequence);
            return;
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x016f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0183  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k.c] */
    @Override // k.e
    public final o.a C(o.a.InterfaceC0219a interfaceC0219a) {
        o.a aVarOnWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        if (interfaceC0219a == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        o.a aVar = this.f29484u;
        if (aVar != null) {
            aVar.c();
        }
        e eVar = new e(interfaceC0219a);
        Q();
        k.a aVar2 = this.f29472o;
        ?? r10 = this.f29470n;
        if (aVar2 != null) {
            o.a aVarO = aVar2.o(eVar);
            this.f29484u = aVarO;
            if (aVarO != null && r10 != 0) {
                r10.onSupportActionModeStarted(aVarO);
            }
        }
        if (this.f29484u == null) {
            l0 l0Var = this.f29492y;
            if (l0Var != null) {
                l0Var.b();
            }
            o.a aVar3 = this.f29484u;
            if (aVar3 != null) {
                aVar3.c();
            }
            if (r10 == 0 || this.f29465k0) {
                aVarOnWindowStartingSupportActionMode = null;
            } else {
                try {
                    aVarOnWindowStartingSupportActionMode = r10.onWindowStartingSupportActionMode(eVar);
                } catch (AbstractMethodError unused) {
                    aVarOnWindowStartingSupportActionMode = null;
                }
            }
            if (aVarOnWindowStartingSupportActionMode != null) {
                this.f29484u = aVarOnWindowStartingSupportActionMode;
            } else {
                if (this.f29486v == null) {
                    boolean z10 = this.X;
                    Context context = this.f29464k;
                    if (z10) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.inotesapp.inotes.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            o.c cVar = new o.c(context, 0);
                            cVar.getTheme().setTo(themeNewTheme);
                            context = cVar;
                        }
                        this.f29486v = new ActionBarContextView(context);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.inotesapp.inotes.R.attr.actionModePopupWindowStyle);
                        this.f29488w = popupWindow;
                        popupWindow.setWindowLayoutType(2);
                        this.f29488w.setContentView(this.f29486v);
                        this.f29488w.setWidth(-1);
                        context.getTheme().resolveAttribute(com.inotesapp.inotes.R.attr.actionBarSize, typedValue, true);
                        this.f29486v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.f29488w.setHeight(-2);
                        this.f29490x = new k.h(this);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.B.findViewById(com.inotesapp.inotes.R.id.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            Q();
                            k.a aVar4 = this.f29472o;
                            Context contextE = aVar4 != null ? aVar4.e() : null;
                            if (contextE != null) {
                                context = contextE;
                            }
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                            this.f29486v = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (this.f29486v != null) {
                    l0 l0Var2 = this.f29492y;
                    if (l0Var2 != null) {
                        l0Var2.b();
                    }
                    this.f29486v.h();
                    Context context2 = this.f29486v.getContext();
                    ActionBarContextView actionBarContextView = this.f29486v;
                    o.d dVar = new o.d();
                    dVar.f32023c = context2;
                    dVar.f32024d = actionBarContextView;
                    dVar.f32025e = eVar;
                    androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(actionBarContextView.getContext());
                    fVar.f781l = 1;
                    dVar.f32028h = fVar;
                    fVar.f774e = dVar;
                    if (eVar.f29498a.c(dVar, fVar)) {
                        dVar.i();
                        this.f29486v.f(dVar);
                        this.f29484u = dVar;
                        if (!this.A || (viewGroup = this.B) == null) {
                            this.f29486v.setAlpha(1.0f);
                            this.f29486v.setVisibility(0);
                            if (this.f29486v.getParent() instanceof View) {
                                View view = (View) this.f29486v.getParent();
                                WeakHashMap<View, l0> weakHashMap = g0.f35505a;
                                view.requestApplyInsets();
                            }
                        } else {
                            WeakHashMap<View, l0> weakHashMap2 = g0.f35505a;
                            if (viewGroup.isLaidOut()) {
                                this.f29486v.setAlpha(0.0f);
                                l0 l0VarA = g0.a(this.f29486v);
                                l0VarA.a(1.0f);
                                this.f29492y = l0VarA;
                                l0VarA.d(new k.i(this));
                            } else {
                                this.f29486v.setAlpha(1.0f);
                                this.f29486v.setVisibility(0);
                                if (this.f29486v.getParent() instanceof View) {
                                    View view2 = (View) this.f29486v.getParent();
                                    WeakHashMap<View, l0> weakHashMap3 = g0.f35505a;
                                    view2.requestApplyInsets();
                                }
                            }
                        }
                        if (this.f29488w != null) {
                            this.f29466l.getDecorView().post(this.f29490x);
                        }
                    } else {
                        this.f29484u = null;
                    }
                }
            }
            o.a aVar5 = this.f29484u;
            if (aVar5 != null && r10 != 0) {
                r10.onSupportActionModeStarted(aVar5);
            }
            Y();
            this.f29484u = this.f29484u;
        }
        Y();
        return this.f29484u;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00e2  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean D(boolean z10, boolean z11) throws IllegalAccessException {
        int i10;
        boolean z12;
        Object obj;
        Object obj2;
        if (this.f29465k0) {
            return false;
        }
        int i11 = this.f29469m0;
        if (i11 == -100) {
            i11 = k.e.f29450b;
        }
        Context context = this.f29464k;
        int iS = S(context, i11);
        int i12 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        s0.h hVarF = i12 < 33 ? F(context) : null;
        if (!z11 && hVarF != null) {
            hVarF = C0191f.b(context.getResources().getConfiguration());
        }
        Configuration configurationJ = J(context, iS, hVarF, null, false);
        boolean z13 = this.f29475p0;
        boolean z14 = true;
        Object obj3 = this.f29462j;
        if (z13 || !(obj3 instanceof Activity)) {
            this.f29475p0 = true;
            i10 = this.f29473o0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i10 = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i12 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.f29473o0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                    this.f29473o0 = 0;
                }
                this.f29475p0 = true;
                i10 = this.f29473o0;
            }
        }
        Configuration configuration = this.f29467l0;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i13 = configuration.uiMode & 48;
        int i14 = configurationJ.uiMode & 48;
        s0.h hVarB = C0191f.b(configuration);
        s0.h hVarB2 = hVarF == null ? null : C0191f.b(configurationJ);
        int i15 = i13 != i14 ? 512 : 0;
        if (hVarB2 != null && !hVarB.equals(hVarB2)) {
            i15 |= 8196;
        }
        if (((~i10) & i15) != 0 && z10 && this.f29461i0 && ((D0 || this.f29463j0) && (obj3 instanceof Activity))) {
            final Activity activity = (Activity) obj3;
            if (activity.isChild()) {
                z12 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new Runnable() { // from class: j0.a
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r4v1 */
                        /* JADX WARN: Type inference failed for: r4v10 */
                        /* JADX WARN: Type inference failed for: r4v2 */
                        /* JADX WARN: Type inference failed for: r4v3 */
                        /* JADX WARN: Type inference failed for: r4v4, types: [android.app.Application] */
                        /* JADX WARN: Type inference failed for: r4v5 */
                        /* JADX WARN: Type inference failed for: r4v9 */
                        /* JADX WARN: Type inference failed for: r5v1 */
                        /* JADX WARN: Type inference failed for: r5v2 */
                        /* JADX WARN: Type inference failed for: r5v3, types: [j0.f$a] */
                        /* JADX WARN: Type inference failed for: r5v4 */
                        /* JADX WARN: Type inference failed for: r5v5 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object obj4;
                            ?? r10;
                            ?? r11;
                            Activity activity2 = activity;
                            if (activity2.isFinishing()) {
                                return;
                            }
                            Handler handler = f.f29025g;
                            Method method = f.f29024f;
                            int i16 = Build.VERSION.SDK_INT;
                            if (i16 >= 28) {
                                activity2.recreate();
                                return;
                            }
                            f.a aVar = 27;
                            if (((i16 != 26 && i16 != 27) || method != null) && (f.f29023e != null || f.f29022d != null)) {
                                try {
                                    Object obj5 = f.f29021c.get(activity2);
                                    if (obj5 != null && (obj4 = f.f29020b.get(activity2)) != null) {
                                        Application application = activity2.getApplication();
                                        aVar = new f.a(activity2);
                                        application.registerActivityLifecycleCallbacks(aVar);
                                        handler.post(new c(aVar, obj5));
                                        application = (i16 == 26 || i16 == 27) ? 1 : 0;
                                        try {
                                            if (application != 0) {
                                                try {
                                                    Boolean bool = Boolean.FALSE;
                                                    method.invoke(obj4, obj5, null, null, 0, bool, null, null, bool, bool);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    r11 = application;
                                                    r10 = aVar;
                                                    handler.post(new d(r11, r10));
                                                    throw th;
                                                }
                                            } else {
                                                activity2.recreate();
                                            }
                                            handler.post(new d(application, aVar));
                                            return;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r11 = application;
                                            r10 = aVar;
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                            activity2.recreate();
                        }
                    });
                }
                z12 = true;
            }
        } else {
            z12 = false;
        }
        if (z12 || i15 == 0) {
            z14 = z12;
        } else {
            boolean z15 = (i10 & i15) == i15;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i14;
            if (hVarB2 != null) {
                C0191f.d(configuration2, hVarB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i16 = Build.VERSION.SDK_INT;
            if (i16 < 26 && i16 < 28) {
                if (!t.f29562h) {
                    try {
                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                        t.f29561g = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException e11) {
                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e11);
                    }
                    t.f29562h = true;
                }
                Field field = t.f29561g;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (IllegalAccessException e12) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e12);
                        obj = null;
                    }
                    if (obj != null) {
                        if (!t.f29556b) {
                            try {
                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                t.f29555a = declaredField2;
                                declaredField2.setAccessible(true);
                            } catch (NoSuchFieldException e13) {
                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e13);
                            }
                            t.f29556b = true;
                        }
                        Field field2 = t.f29555a;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (IllegalAccessException e14) {
                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e14);
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!t.f29558d) {
                                try {
                                    t.f29557c = Class.forName("android.content.res.ThemedResourceCache");
                                } catch (ClassNotFoundException e15) {
                                    Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e15);
                                }
                                t.f29558d = true;
                            }
                            Class<?> cls = t.f29557c;
                            if (cls != null) {
                                if (!t.f29560f) {
                                    try {
                                        Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                        t.f29559e = declaredField3;
                                        declaredField3.setAccessible(true);
                                    } catch (NoSuchFieldException e16) {
                                        Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e16);
                                    }
                                    t.f29560f = true;
                                }
                                Field field3 = t.f29559e;
                                if (field3 != null) {
                                    try {
                                        longSparseArray = (LongSparseArray) field3.get(obj2);
                                    } catch (IllegalAccessException e17) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e17);
                                    }
                                    if (longSparseArray != null) {
                                        t.a.a(longSparseArray);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i17 = this.f29471n0;
            if (i17 != 0) {
                context.setTheme(i17);
                context.getTheme().applyStyle(this.f29471n0, true);
            }
            if (z15 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof androidx.lifecycle.n) {
                    if (((androidx.lifecycle.n) activity2).getLifecycle().b().a(androidx.lifecycle.j.b.CREATED)) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f29463j0 && !this.f29465k0) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z14 && (obj3 instanceof AppCompatActivity)) {
            if ((i15 & 512) != 0) {
                ((AppCompatActivity) obj3).onNightModeChanged(iS);
            }
            if ((i15 & 4) != 0) {
                ((AppCompatActivity) obj3).onLocalesChanged(hVarF);
            }
        }
        if (z14 && hVarB2 != null) {
            C0191f.c(C0191f.b(context.getResources().getConfiguration()));
        }
        if (i11 == 0) {
            O(context).e();
        } else {
            k kVar = this.f29477q0;
            if (kVar != null) {
                kVar.a();
            }
        }
        if (i11 == 3) {
            if (this.f29479r0 == null) {
                this.f29479r0 = new i(context);
            }
            this.f29479r0.e();
        } else {
            i iVar = this.f29479r0;
            if (iVar != null) {
                iVar.a();
            }
        }
        return z14;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    public final void E(Window window) {
        Drawable drawableD;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f29466l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof h) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        h hVar = new h(callback);
        this.f29468m = hVar;
        window.setCallback(hVar);
        Context context = this.f29464k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableD = null;
        } else {
            q.g gVarA = q.g.a();
            synchronized (gVarA) {
                drawableD = gVarA.f33089a.d(context, resourceId, true);
            }
        }
        if (drawableD != null) {
            window.setBackgroundDrawable(drawableD);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f29466l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f29495z0) != null) {
            return;
        }
        Object obj = this.f29462j;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.A0) != null) {
            g.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.A0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f29495z0 = g.a(activity);
            } else {
                this.f29495z0 = null;
            }
        } else {
            this.f29495z0 = null;
        }
        Y();
    }

    public final void G(int i10, m mVar, androidx.appcompat.view.menu.f fVar) {
        if (fVar == null) {
            if (mVar == null && i10 >= 0) {
                m[] mVarArr = this.f29458f0;
                if (i10 < mVarArr.length) {
                    mVar = mVarArr[i10];
                }
            }
            if (mVar != null) {
                fVar = mVar.f29521h;
            }
        }
        if ((mVar == null || mVar.f29526m) && !this.f29465k0) {
            h hVar = this.f29468m;
            Window.Callback callback = this.f29466l.getCallback();
            hVar.getClass();
            try {
                hVar.f29504e = true;
                callback.onPanelClosed(i10, fVar);
            } finally {
                hVar.f29504e = false;
            }
        }
    }

    public final void H(androidx.appcompat.view.menu.f fVar) {
        if (this.Z) {
            return;
        }
        this.Z = true;
        this.f29478r.i();
        Window.Callback callback = this.f29466l.getCallback();
        if (callback != null && !this.f29465k0) {
            callback.onPanelClosed(108, fVar);
        }
        this.Z = false;
    }

    public final void I(m mVar, boolean z10) {
        l lVar;
        q.r rVar;
        if (z10 && mVar.f29514a == 0 && (rVar = this.f29478r) != null && rVar.b()) {
            H(mVar.f29521h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f29464k.getSystemService("window");
        if (windowManager != null && mVar.f29526m && (lVar = mVar.f29518e) != null) {
            windowManager.removeView(lVar);
            if (z10) {
                G(mVar.f29514a, mVar, null);
            }
        }
        mVar.f29524k = false;
        mVar.f29525l = false;
        mVar.f29526m = false;
        mVar.f29519f = null;
        mVar.f29527n = true;
        if (this.f29459g0 == mVar) {
            this.f29459g0 = null;
        }
        if (mVar.f29514a == 0) {
            Y();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe A[RETURN] */
    public final boolean K(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        m mVarP;
        q.r rVar;
        Context context;
        boolean z10;
        boolean zF;
        boolean zW;
        AudioManager audioManager;
        m mVarP2;
        Object obj = this.f29462j;
        if ((!(obj instanceof w0.h.a) && !(obj instanceof q)) || (decorView = this.f29466l.getDecorView()) == null || !w0.h.a(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                h hVar = this.f29468m;
                Window.Callback callback = this.f29466l.getCallback();
                hVar.getClass();
                try {
                    hVar.f29503d = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    hVar.f29503d = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.f29460h0 = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    mVarP2 = P(0);
                                    if (!mVarP2.f29526m) {
                                        W(mVarP2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.f29484u == null) {
                                    mVarP = P(0);
                                    rVar = this.f29478r;
                                    context = this.f29464k;
                                    if (rVar != null || !rVar.d() || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                        z10 = mVarP.f29526m;
                                        if (!z10 || mVarP.f29525l) {
                                            I(mVarP, true);
                                            zF = z10;
                                        } else if (mVarP.f29524k) {
                                            if (mVarP.f29528o) {
                                                mVarP.f29524k = false;
                                                zW = W(mVarP, keyEvent);
                                            } else {
                                                zW = true;
                                            }
                                            if (zW) {
                                                U(mVarP, keyEvent);
                                                zF = true;
                                            } else {
                                                zF = false;
                                            }
                                        } else {
                                            zF = false;
                                        }
                                    } else if (this.f29478r.b()) {
                                        zF = this.f29478r.f();
                                    } else if (this.f29465k0 || !W(mVarP, keyEvent)) {
                                        zF = false;
                                    } else {
                                        zF = this.f29478r.g();
                                    }
                                    if (zF) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (T()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    hVar.f29503d = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.f29460h0 = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            mVarP2 = P(0);
                            if (!mVarP2.f29526m) {
                                W(mVarP2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.f29484u == null) {
                            mVarP = P(0);
                            rVar = this.f29478r;
                            context = this.f29464k;
                            if (rVar != null) {
                                z10 = mVarP.f29526m;
                                if (z10) {
                                    I(mVarP, true);
                                    zF = z10;
                                } else {
                                    I(mVarP, true);
                                    zF = z10;
                                }
                            } else {
                                z10 = mVarP.f29526m;
                                if (z10) {
                                    I(mVarP, true);
                                    zF = z10;
                                } else {
                                    I(mVarP, true);
                                    zF = z10;
                                }
                            }
                            if (zF) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (T()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void L(int i10) {
        m mVarP = P(i10);
        if (mVarP.f29521h != null) {
            Bundle bundle = new Bundle();
            mVarP.f29521h.t(bundle);
            if (bundle.size() > 0) {
                mVarP.f29529p = bundle;
            }
            mVarP.f29521h.w();
            mVarP.f29521h.clear();
        }
        mVarP.f29528o = true;
        mVarP.f29527n = true;
        if ((i10 == 108 || i10 == 0) && this.f29478r != null) {
            m mVarP2 = P(0);
            mVarP2.f29524k = false;
            W(mVarP2, null);
        }
    }

    public final void M() {
        ViewGroup viewGroup;
        if (this.A) {
            return;
        }
        Context context = this.f29464k;
        int[] iArr = j.a.f28995k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            v(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            v(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            v(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            v(10);
        }
        this.X = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        N();
        this.f29466l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.Y) {
            viewGroup = this.I ? (ViewGroup) layoutInflaterFrom.inflate(com.inotesapp.inotes.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.inotesapp.inotes.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.X) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.inotesapp.inotes.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.H = false;
            this.G = false;
        } else if (this.G) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.inotesapp.inotes.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new o.c(context, typedValue.resourceId) : context).inflate(com.inotesapp.inotes.R.layout.abc_screen_toolbar, (ViewGroup) null);
            q.r rVar = (q.r) viewGroup.findViewById(com.inotesapp.inotes.R.id.decor_content_parent);
            this.f29478r = rVar;
            rVar.setWindowCallback(this.f29466l.getCallback());
            if (this.H) {
                this.f29478r.h(109);
            }
            if (this.E) {
                this.f29478r.h(2);
            }
            if (this.F) {
                this.f29478r.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.G + ", windowActionBarOverlay: " + this.H + ", android:windowIsFloating: " + this.X + ", windowActionModeOverlay: " + this.I + ", windowNoTitle: " + this.Y + " }");
        }
        com.google.android.gms.internal.consent_sdk.s sVar = new com.google.android.gms.internal.consent_sdk.s(this);
        WeakHashMap<View, l0> weakHashMap = g0.f35505a;
        g0.d.c(viewGroup, sVar);
        if (this.f29478r == null) {
            this.C = (TextView) viewGroup.findViewById(com.inotesapp.inotes.R.id.title);
        }
        Method method = r0.f33176a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, null);
        } catch (IllegalAccessException e10) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e11) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e11);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.inotesapp.inotes.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f29466l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f29466l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new k.g(this));
        this.B = viewGroup;
        Object obj = this.f29462j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f29476q;
        if (!TextUtils.isEmpty(title)) {
            q.r rVar2 = this.f29478r;
            if (rVar2 != null) {
                rVar2.setWindowTitle(title);
            } else {
                k.a aVar = this.f29472o;
                if (aVar != null) {
                    aVar.n(title);
                } else {
                    TextView textView = this.C;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.B.findViewById(R.id.content);
        View decorView = this.f29466l.getDecorView();
        contentFrameLayout2.f1020g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap<View, l0> weakHashMap2 = g0.f35505a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.A = true;
        m mVarP = P(0);
        if (this.f29465k0 || mVarP.f29521h != null) {
            return;
        }
        R(108);
    }

    public final void N() {
        if (this.f29466l == null) {
            Object obj = this.f29462j;
            if (obj instanceof Activity) {
                E(((Activity) obj).getWindow());
            }
        }
        if (this.f29466l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final j O(Context context) {
        if (this.f29477q0 == null) {
            if (w.f29581d == null) {
                Context applicationContext = context.getApplicationContext();
                w.f29581d = new w(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f29477q0 = new k(w.f29581d);
        }
        return this.f29477q0;
    }

    public final m P(int i10) {
        m[] mVarArr = this.f29458f0;
        if (mVarArr == null || mVarArr.length <= i10) {
            m[] mVarArr2 = new m[i10 + 1];
            if (mVarArr != null) {
                System.arraycopy(mVarArr, 0, mVarArr2, 0, mVarArr.length);
            }
            this.f29458f0 = mVarArr2;
            mVarArr = mVarArr2;
        }
        m mVar = mVarArr[i10];
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m();
        mVar2.f29514a = i10;
        mVar2.f29527n = false;
        mVarArr[i10] = mVar2;
        return mVar2;
    }

    public final void Q() {
        M();
        if (this.G && this.f29472o == null) {
            Object obj = this.f29462j;
            if (obj instanceof Activity) {
                this.f29472o = new x((Activity) obj, this.H);
            } else if (obj instanceof Dialog) {
                this.f29472o = new x((Dialog) obj);
            }
            k.a aVar = this.f29472o;
            if (aVar != null) {
                aVar.l(this.f29487v0);
            }
        }
    }

    public final void R(int i10) {
        this.f29483t0 = (1 << i10) | this.f29483t0;
        if (this.f29481s0) {
            return;
        }
        View decorView = this.f29466l.getDecorView();
        WeakHashMap<View, l0> weakHashMap = g0.f35505a;
        decorView.postOnAnimation(this.f29485u0);
        this.f29481s0 = true;
    }

    public final int S(Context context, int i10) {
        if (i10 != -100) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1 && i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f29479r0 == null) {
                            this.f29479r0 = new i(context);
                        }
                        return this.f29479r0.c();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return O(context).c();
                }
            }
            return i10;
        }
        return -1;
    }

    public final boolean T() {
        boolean z10 = this.f29460h0;
        this.f29460h0 = false;
        m mVarP = P(0);
        if (!mVarP.f29526m) {
            o.a aVar = this.f29484u;
            if (aVar != null) {
                aVar.c();
                return true;
            }
            Q();
            k.a aVar2 = this.f29472o;
            if (aVar2 == null || !aVar2.b()) {
                return false;
            }
        } else if (!z10) {
            I(mVarP, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
    
        if (r2.f760f.getCount() > 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(k.f.m r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.f.U(k.f$m, android.view.KeyEvent):void");
    }

    public final boolean V(m mVar, int i10, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((mVar.f29524k || W(mVar, keyEvent)) && (fVar = mVar.f29521h) != null) {
            return fVar.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00da  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:82:0x010f  */
    public final boolean W(m mVar, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        q.r rVar;
        q.r rVar2;
        Resources.Theme themeNewTheme;
        q.r rVar3;
        q.r rVar4;
        if (!this.f29465k0) {
            boolean z10 = mVar.f29524k;
            int i10 = mVar.f29514a;
            if (z10) {
                return true;
            }
            m mVar2 = this.f29459g0;
            if (mVar2 != null && mVar2 != mVar) {
                I(mVar2, false);
            }
            Window.Callback callback = this.f29466l.getCallback();
            if (callback != null) {
                mVar.f29520g = callback.onCreatePanelView(i10);
            }
            boolean z11 = i10 == 0 || i10 == 108;
            if (z11 && (rVar4 = this.f29478r) != null) {
                rVar4.c();
            }
            if (mVar.f29520g == null && (!z11 || !(this.f29472o instanceof u))) {
                androidx.appcompat.view.menu.f fVar2 = mVar.f29521h;
                if (fVar2 == null || mVar.f29528o) {
                    if (fVar2 == null) {
                        Context context = this.f29464k;
                        if ((i10 == 0 || i10 == 108) && this.f29478r != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.inotesapp.inotes.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.inotesapp.inotes.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.inotesapp.inotes.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                o.c cVar = new o.c(context, 0);
                                cVar.getTheme().setTo(themeNewTheme);
                                context = cVar;
                            }
                        }
                        androidx.appcompat.view.menu.f fVar3 = new androidx.appcompat.view.menu.f(context);
                        fVar3.f774e = this;
                        androidx.appcompat.view.menu.f fVar4 = mVar.f29521h;
                        if (fVar3 != fVar4) {
                            if (fVar4 != null) {
                                fVar4.r(mVar.f29522i);
                            }
                            mVar.f29521h = fVar3;
                            androidx.appcompat.view.menu.d dVar = mVar.f29522i;
                            if (dVar != null) {
                                fVar3.b(dVar, fVar3.f770a);
                            }
                        }
                        if (mVar.f29521h != null) {
                            if (z11 && (rVar2 = this.f29478r) != null) {
                                if (this.f29480s == null) {
                                    this.f29480s = new d();
                                }
                                rVar2.a(mVar.f29521h, this.f29480s);
                            }
                            mVar.f29521h.w();
                            if (callback.onCreatePanelMenu(i10, mVar.f29521h)) {
                                mVar.f29528o = false;
                            } else {
                                fVar = mVar.f29521h;
                                if (fVar != null) {
                                    if (fVar != null) {
                                        fVar.r(mVar.f29522i);
                                    }
                                    mVar.f29521h = null;
                                }
                                if (z11 && (rVar = this.f29478r) != null) {
                                    rVar.a(null, this.f29480s);
                                }
                            }
                        }
                    } else {
                        if (z11) {
                            if (this.f29480s == null) {
                                this.f29480s = new d();
                            }
                            rVar2.a(mVar.f29521h, this.f29480s);
                        }
                        mVar.f29521h.w();
                        if (callback.onCreatePanelMenu(i10, mVar.f29521h)) {
                            fVar = mVar.f29521h;
                            if (fVar != null) {
                                if (fVar != null) {
                                    fVar.r(mVar.f29522i);
                                }
                                mVar.f29521h = null;
                            }
                            if (z11) {
                                rVar.a(null, this.f29480s);
                            }
                        } else {
                            mVar.f29528o = false;
                        }
                    }
                }
                mVar.f29521h.w();
                Bundle bundle = mVar.f29529p;
                if (bundle != null) {
                    mVar.f29521h.s(bundle);
                    mVar.f29529p = null;
                }
                if (!callback.onPreparePanel(0, mVar.f29520g, mVar.f29521h)) {
                    if (z11 && (rVar3 = this.f29478r) != null) {
                        rVar3.a(null, this.f29480s);
                    }
                    mVar.f29521h.v();
                    return false;
                }
                mVar.f29521h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                mVar.f29521h.v();
            }
            mVar.f29524k = true;
            mVar.f29525l = false;
            this.f29459g0 = mVar;
            return true;
        }
        return false;
    }

    public final void X() {
        if (this.A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void Y() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.f29495z0 != null && (P(0).f29526m || this.f29484u != null)) {
                z10 = true;
            }
            if (z10 && this.A0 == null) {
                this.A0 = g.b(this.f29495z0, this);
            } else {
                if (z10 || (onBackInvokedCallback = this.A0) == null) {
                    return;
                }
                g.c(this.f29495z0, onBackInvokedCallback);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        m mVar;
        Window.Callback callback = this.f29466l.getCallback();
        if (callback != null && !this.f29465k0) {
            androidx.appcompat.view.menu.f fVarK = fVar.k();
            m[] mVarArr = this.f29458f0;
            int length = mVarArr != null ? mVarArr.length : 0;
            for (int i10 = 0; i10 < length; i10++) {
                mVar = mVarArr[i10];
                if (mVar != null && mVar.f29521h == fVarK) {
                    if (mVar != null) {
                        return callback.onMenuItemSelected(mVar.f29514a, menuItem);
                    }
                }
            }
            mVar = null;
            if (mVar != null) {
                return callback.onMenuItemSelected(mVar.f29514a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) {
        q.r rVar = this.f29478r;
        if (rVar == null || !rVar.d() || (ViewConfiguration.get(this.f29464k).hasPermanentMenuKey() && !this.f29478r.e())) {
            m mVarP = P(0);
            mVarP.f29527n = true;
            I(mVarP, false);
            U(mVarP, null);
            return;
        }
        Window.Callback callback = this.f29466l.getCallback();
        if (this.f29478r.b()) {
            this.f29478r.f();
            if (this.f29465k0) {
                return;
            }
            callback.onPanelClosed(108, P(0).f29521h);
            return;
        }
        if (callback == null || this.f29465k0) {
            return;
        }
        if (this.f29481s0 && (1 & this.f29483t0) != 0) {
            View decorView = this.f29466l.getDecorView();
            a aVar = this.f29485u0;
            decorView.removeCallbacks(aVar);
            aVar.run();
        }
        m mVarP2 = P(0);
        androidx.appcompat.view.menu.f fVar2 = mVarP2.f29521h;
        if (fVar2 == null || mVarP2.f29528o || !callback.onPreparePanel(0, mVarP2.f29520g, fVar2)) {
            return;
        }
        callback.onMenuOpened(108, mVarP2.f29521h);
        this.f29478r.g();
    }

    @Override // k.e
    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        M();
        ((ViewGroup) this.B.findViewById(R.id.content)).addView(view, layoutParams);
        this.f29468m.a(this.f29466l.getCallback());
    }

    @Override // k.e
    public final Context d(Context context) {
        Configuration configuration;
        this.f29461i0 = true;
        int i10 = this.f29469m0;
        if (i10 == -100) {
            i10 = k.e.f29450b;
        }
        int iS = S(context, i10);
        int i11 = 0;
        if (k.e.m(context) && k.e.m(context)) {
            if (!s0.b.b()) {
                synchronized (k.e.f29457i) {
                    try {
                        s0.h hVar = k.e.f29451c;
                        if (hVar == null) {
                            if (k.e.f29452d == null) {
                                k.e.f29452d = s0.h.a(s.b(context));
                            }
                            if (!k.e.f29452d.f34025a.f34026a.isEmpty()) {
                                k.e.f29451c = k.e.f29452d;
                            }
                        } else if (!hVar.equals(k.e.f29452d)) {
                            s0.h hVar2 = k.e.f29451c;
                            k.e.f29452d = hVar2;
                            s.a(context, hVar2.f34025a.f34026a.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!k.e.f29454f) {
                k.e.f29449a.execute(new k.d(context, i11));
            }
        }
        s0.h hVarF = F(context);
        if (E0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(J(context, iS, hVarF, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof o.c) {
            try {
                ((o.c) context).a(J(context, iS, hVarF, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!D0) {
            return context;
        }
        int i12 = Build.VERSION.SDK_INT;
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (configuration3.equals(configuration4)) {
            configuration = null;
        } else {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f10 = configuration3.fontScale;
                float f11 = configuration4.fontScale;
                if (f10 != f11) {
                    configuration.fontScale = f11;
                }
                int i13 = configuration3.mcc;
                int i14 = configuration4.mcc;
                if (i13 != i14) {
                    configuration.mcc = i14;
                }
                int i15 = configuration3.mnc;
                int i16 = configuration4.mnc;
                if (i15 != i16) {
                    configuration.mnc = i16;
                }
                C0191f.a(configuration3, configuration4, configuration);
                int i17 = configuration3.touchscreen;
                int i18 = configuration4.touchscreen;
                if (i17 != i18) {
                    configuration.touchscreen = i18;
                }
                int i19 = configuration3.keyboard;
                int i20 = configuration4.keyboard;
                if (i19 != i20) {
                    configuration.keyboard = i20;
                }
                int i21 = configuration3.keyboardHidden;
                int i22 = configuration4.keyboardHidden;
                if (i21 != i22) {
                    configuration.keyboardHidden = i22;
                }
                int i23 = configuration3.navigation;
                int i24 = configuration4.navigation;
                if (i23 != i24) {
                    configuration.navigation = i24;
                }
                int i25 = configuration3.navigationHidden;
                int i26 = configuration4.navigationHidden;
                if (i25 != i26) {
                    configuration.navigationHidden = i26;
                }
                int i27 = configuration3.orientation;
                int i28 = configuration4.orientation;
                if (i27 != i28) {
                    configuration.orientation = i28;
                }
                int i29 = configuration3.screenLayout & 15;
                int i30 = configuration4.screenLayout & 15;
                if (i29 != i30) {
                    configuration.screenLayout |= i30;
                }
                int i31 = configuration3.screenLayout & 192;
                int i32 = configuration4.screenLayout & 192;
                if (i31 != i32) {
                    configuration.screenLayout |= i32;
                }
                int i33 = configuration3.screenLayout & 48;
                int i34 = configuration4.screenLayout & 48;
                if (i33 != i34) {
                    configuration.screenLayout |= i34;
                }
                int i35 = configuration3.screenLayout & 768;
                int i36 = configuration4.screenLayout & 768;
                if (i35 != i36) {
                    configuration.screenLayout |= i36;
                }
                if (i12 >= 26) {
                    if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                        configuration.colorMode |= configuration4.colorMode & 3;
                    }
                    if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                        configuration.colorMode |= configuration4.colorMode & 12;
                    }
                }
                int i37 = configuration3.uiMode & 15;
                int i38 = configuration4.uiMode & 15;
                if (i37 != i38) {
                    configuration.uiMode |= i38;
                }
                int i39 = configuration3.uiMode & 48;
                int i40 = configuration4.uiMode & 48;
                if (i39 != i40) {
                    configuration.uiMode |= i40;
                }
                int i41 = configuration3.screenWidthDp;
                int i42 = configuration4.screenWidthDp;
                if (i41 != i42) {
                    configuration.screenWidthDp = i42;
                }
                int i43 = configuration3.screenHeightDp;
                int i44 = configuration4.screenHeightDp;
                if (i43 != i44) {
                    configuration.screenHeightDp = i44;
                }
                int i45 = configuration3.smallestScreenWidthDp;
                int i46 = configuration4.smallestScreenWidthDp;
                if (i45 != i46) {
                    configuration.smallestScreenWidthDp = i46;
                }
                int i47 = configuration3.densityDpi;
                int i48 = configuration4.densityDpi;
                if (i47 != i48) {
                    configuration.densityDpi = i48;
                }
            }
        }
        Configuration configurationJ = J(context, iS, hVarF, configuration, true);
        o.c cVar = new o.c(context, com.inotesapp.inotes.R.style.Theme_AppCompat_Empty);
        cVar.a(configurationJ);
        try {
            if (context.getTheme() != null) {
                Resources.Theme theme = cVar.getTheme();
                if (i12 >= 29) {
                    n0.i.a(theme);
                } else {
                    synchronized (n0.h.f31508a) {
                        if (!n0.h.f31510c) {
                            try {
                                Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                n0.h.f31509b = declaredMethod;
                                declaredMethod.setAccessible(true);
                            } catch (NoSuchMethodException e10) {
                                Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                            }
                            n0.h.f31510c = true;
                        }
                        Method method = n0.h.f31509b;
                        if (method != null) {
                            try {
                                method.invoke(theme, null);
                            } catch (IllegalAccessException | InvocationTargetException e11) {
                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                                n0.h.f31509b = null;
                            }
                        }
                    }
                }
            }
        } catch (NullPointerException unused3) {
        }
        return cVar;
    }

    @Override // k.e
    public final <T extends View> T e(int i10) {
        M();
        return (T) this.f29466l.findViewById(i10);
    }

    @Override // k.e
    public final Context f() {
        return this.f29464k;
    }

    @Override // k.e
    public final b g() {
        return new b();
    }

    @Override // k.e
    public final int h() {
        return this.f29469m0;
    }

    @Override // k.e
    public final MenuInflater i() {
        if (this.f29474p == null) {
            Q();
            k.a aVar = this.f29472o;
            this.f29474p = new o.f(aVar != null ? aVar.e() : this.f29464k);
        }
        return this.f29474p;
    }

    @Override // k.e
    public final k.a j() {
        Q();
        return this.f29472o;
    }

    @Override // k.e
    public final void k() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f29464k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof f) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // k.e
    public final void l() {
        if (this.f29472o != null) {
            Q();
            if (this.f29472o.f()) {
                return;
            }
            R(0);
        }
    }

    @Override // k.e
    public final void n(Configuration configuration) throws IllegalAccessException {
        if (this.G && this.A) {
            Q();
            k.a aVar = this.f29472o;
            if (aVar != null) {
                aVar.g();
            }
        }
        q.g gVarA = q.g.a();
        Context context = this.f29464k;
        synchronized (gVarA) {
            b0 b0Var = gVarA.f33089a;
            synchronized (b0Var) {
                x.e<WeakReference<Drawable.ConstantState>> eVar = b0Var.f33031b.get(context);
                if (eVar != null) {
                    eVar.a();
                }
            }
        }
        this.f29467l0 = new Configuration(this.f29464k.getResources().getConfiguration());
        D(false, false);
    }

    @Override // k.e
    public final void o() throws IllegalAccessException {
        String strC;
        this.f29461i0 = true;
        D(false, true);
        N();
        Object obj = this.f29462j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = j0.i.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                k.a aVar = this.f29472o;
                if (aVar == null) {
                    this.f29487v0 = true;
                } else {
                    aVar.l(true);
                }
            }
            synchronized (k.e.f29456h) {
                k.e.u(this);
                k.e.f29455g.add(new WeakReference<>(this));
            }
        }
        this.f29467l0 = new Configuration(this.f29464k.getResources().getConfiguration());
        this.f29463j0 = true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View appCompatRatingBar;
        View view2 = null;
        if (this.f29493y0 == null) {
            int[] iArr = j.a.f28995k;
            Context context2 = this.f29464k;
            String string = context2.obtainStyledAttributes(iArr).getString(116);
            if (string == null) {
                this.f29493y0 = new r();
            } else {
                try {
                    this.f29493y0 = (r) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f29493y0 = new r();
                }
            }
        }
        r rVar = this.f29493y0;
        int i10 = q0.f33175a;
        rVar.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.A, 0, 0);
        byte b10 = 4;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        Context cVar = (resourceId == 0 || ((context instanceof o.c) && ((o.c) context).f32018a == resourceId)) ? context : new o.c(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b10 = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b10 = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b10 = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b10 = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b10 = -1;
                }
                break;
            case -658531749:
                b10 = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b10 = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b10 = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b10 = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b10 = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b10 = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b10 = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b10 = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b10 = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                appCompatRatingBar = new AppCompatRatingBar(cVar, attributeSet);
                break;
            case 1:
                appCompatRatingBar = new AppCompatCheckedTextView(cVar, attributeSet);
                break;
            case 2:
                appCompatRatingBar = new AppCompatMultiAutoCompleteTextView(cVar, attributeSet);
                break;
            case 3:
                appCompatRatingBar = new AppCompatTextView(cVar, attributeSet);
                break;
            case 4:
                appCompatRatingBar = new AppCompatImageButton(cVar, attributeSet);
                break;
            case 5:
                appCompatRatingBar = new AppCompatSeekBar(cVar, attributeSet);
                break;
            case 6:
                appCompatRatingBar = new AppCompatSpinner(cVar, attributeSet);
                break;
            case 7:
                appCompatRatingBar = new AppCompatRadioButton(cVar, attributeSet);
                break;
            case 8:
                appCompatRatingBar = new AppCompatToggleButton(cVar, attributeSet);
                break;
            case 9:
                appCompatRatingBar = new AppCompatImageView(cVar, attributeSet);
                break;
            case 10:
                appCompatRatingBar = new AppCompatAutoCompleteTextView(cVar, attributeSet);
                break;
            case 11:
                appCompatRatingBar = new AppCompatCheckBox(cVar, attributeSet);
                break;
            case 12:
                appCompatRatingBar = new AppCompatEditText(cVar, attributeSet);
                break;
            case 13:
                appCompatRatingBar = new AppCompatButton(cVar, attributeSet);
                break;
            default:
                appCompatRatingBar = null;
                break;
        }
        if (appCompatRatingBar == null && context != cVar) {
            Object[] objArr = rVar.f29546a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = cVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i11 = 0;
                    while (true) {
                        String[] strArr = r.f29544g;
                        if (i11 < 3) {
                            View viewA = rVar.a(cVar, str, strArr[i11]);
                            if (viewA != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewA;
                            } else {
                                i11++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewA2 = rVar.a(cVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewA2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            appCompatRatingBar = view2;
        }
        if (appCompatRatingBar != null) {
            Context context3 = appCompatRatingBar.getContext();
            if (context3 instanceof ContextWrapper) {
                WeakHashMap<View, l0> weakHashMap = g0.f35505a;
                if (appCompatRatingBar.hasOnClickListeners()) {
                    TypedArray typedArrayObtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, r.f29540c);
                    String string2 = typedArrayObtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        appCompatRatingBar.setOnClickListener(new r.a(string2, appCompatRatingBar));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes3 = cVar.obtainStyledAttributes(attributeSet, r.f29541d);
                if (typedArrayObtainStyledAttributes3.hasValue(0)) {
                    boolean z10 = typedArrayObtainStyledAttributes3.getBoolean(0, false);
                    WeakHashMap<View, l0> weakHashMap2 = g0.f35505a;
                    new f0(com.inotesapp.inotes.R.id.tag_accessibility_heading, Boolean.class, 0, 28).c(appCompatRatingBar, Boolean.valueOf(z10));
                }
                typedArrayObtainStyledAttributes3.recycle();
                TypedArray typedArrayObtainStyledAttributes4 = cVar.obtainStyledAttributes(attributeSet, r.f29542e);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    g0.j(appCompatRatingBar, typedArrayObtainStyledAttributes4.getString(0));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = cVar.obtainStyledAttributes(attributeSet, r.f29543f);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    boolean z11 = typedArrayObtainStyledAttributes5.getBoolean(0, false);
                    WeakHashMap<View, l0> weakHashMap3 = g0.f35505a;
                    new c0(com.inotesapp.inotes.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28).c(appCompatRatingBar, Boolean.valueOf(z11));
                }
                typedArrayObtainStyledAttributes5.recycle();
            }
        }
        return appCompatRatingBar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // k.e
    public final void p() {
        if (this.f29462j instanceof Activity) {
            synchronized (k.e.f29456h) {
                k.e.u(this);
            }
        }
        if (this.f29481s0) {
            this.f29466l.getDecorView().removeCallbacks(this.f29485u0);
        }
        this.f29465k0 = true;
        if (this.f29469m0 != -100) {
            Object obj = this.f29462j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                B0.put(this.f29462j.getClass().getName(), Integer.valueOf(this.f29469m0));
            } else {
                B0.remove(this.f29462j.getClass().getName());
            }
        } else {
            B0.remove(this.f29462j.getClass().getName());
        }
        k.a aVar = this.f29472o;
        if (aVar != null) {
            aVar.h();
        }
        k kVar = this.f29477q0;
        if (kVar != null) {
            kVar.a();
        }
        i iVar = this.f29479r0;
        if (iVar != null) {
            iVar.a();
        }
    }

    @Override // k.e
    public final void q() {
        M();
    }

    @Override // k.e
    public final void r() {
        Q();
        k.a aVar = this.f29472o;
        if (aVar != null) {
            aVar.m(true);
        }
    }

    @Override // k.e
    public final void s() throws IllegalAccessException {
        D(true, false);
    }

    @Override // k.e
    public final void t() {
        Q();
        k.a aVar = this.f29472o;
        if (aVar != null) {
            aVar.m(false);
        }
    }

    @Override // k.e
    public final boolean v(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.Y && i10 == 108) {
            return false;
        }
        if (this.G && i10 == 1) {
            this.G = false;
        }
        if (i10 == 1) {
            X();
            this.Y = true;
            return true;
        }
        if (i10 == 2) {
            X();
            this.E = true;
            return true;
        }
        if (i10 == 5) {
            X();
            this.F = true;
            return true;
        }
        if (i10 == 10) {
            X();
            this.I = true;
            return true;
        }
        if (i10 == 108) {
            X();
            this.G = true;
            return true;
        }
        if (i10 != 109) {
            return this.f29466l.requestFeature(i10);
        }
        X();
        this.H = true;
        return true;
    }

    @Override // k.e
    public final void w(int i10) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f29464k).inflate(i10, viewGroup);
        this.f29468m.a(this.f29466l.getCallback());
    }

    @Override // k.e
    public final void x(View view) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f29468m.a(this.f29466l.getCallback());
    }

    @Override // k.e
    public final void y(View view, ViewGroup.LayoutParams layoutParams) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f29468m.a(this.f29466l.getCallback());
    }

    @Override // k.e
    public final void z(Toolbar toolbar) {
        Object obj = this.f29462j;
        if (obj instanceof Activity) {
            Q();
            k.a aVar = this.f29472o;
            if (aVar instanceof x) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f29474p = null;
            if (aVar != null) {
                aVar.h();
            }
            this.f29472o = null;
            if (toolbar != null) {
                u uVar = new u(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.f29476q, this.f29468m);
                this.f29472o = uVar;
                this.f29468m.f29501b = uVar.f29565c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f29468m.f29501b = null;
            }
            l();
        }
    }

    public class h extends o.h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f29501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f29502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f29503d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f29504e;

        public h(Window.Callback callback) {
            super(callback);
        }

        public final void a(Window.Callback callback) {
            try {
                this.f29502c = true;
                callback.onContentChanged();
            } finally {
                this.f29502c = false;
            }
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            boolean z10 = this.f29503d;
            Window.Callback callback = this.f32079a;
            if (z10) {
                return callback.dispatchKeyEvent(keyEvent);
            }
            return f.this.K(keyEvent) || callback.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!this.f32079a.dispatchKeyShortcutEvent(keyEvent)) {
                int keyCode = keyEvent.getKeyCode();
                f fVar = f.this;
                fVar.Q();
                k.a aVar = fVar.f29472o;
                if (aVar == null || !aVar.i(keyCode, keyEvent)) {
                    m mVar = fVar.f29459g0;
                    if (mVar == null || !fVar.V(mVar, keyEvent.getKeyCode(), keyEvent)) {
                        if (fVar.f29459g0 == null) {
                            m mVarP = fVar.P(0);
                            fVar.W(mVarP, keyEvent);
                            boolean zV = fVar.V(mVarP, keyEvent.getKeyCode(), keyEvent);
                            mVarP.f29524k = false;
                            if (zV) {
                            }
                        }
                        return false;
                    }
                    m mVar2 = fVar.f29459g0;
                    if (mVar2 != null) {
                        mVar2.f29525l = true;
                        return true;
                    }
                }
            }
            return true;
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            if (this.f29502c) {
                this.f32079a.onContentChanged();
            }
        }

        @Override // android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.f)) {
                return this.f32079a.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public final View onCreatePanelView(int i10) {
            c cVar = this.f29501b;
            if (cVar != null) {
                View view = i10 == 0 ? new View(u.this.f29563a.f1207a.getContext()) : null;
                if (view != null) {
                    return view;
                }
            }
            return this.f32079a.onCreatePanelView(i10);
        }

        @Override // o.h, android.view.Window.Callback
        public final boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            f fVar = f.this;
            if (i10 == 108) {
                fVar.Q();
                k.a aVar = fVar.f29472o;
                if (aVar != null) {
                    aVar.c(true);
                }
            } else {
                fVar.getClass();
            }
            return true;
        }

        @Override // o.h, android.view.Window.Callback
        public final void onPanelClosed(int i10, Menu menu) {
            if (this.f29504e) {
                this.f32079a.onPanelClosed(i10, menu);
                return;
            }
            super.onPanelClosed(i10, menu);
            f fVar = f.this;
            if (i10 == 108) {
                fVar.Q();
                k.a aVar = fVar.f29472o;
                if (aVar != null) {
                    aVar.c(false);
                    return;
                }
                return;
            }
            if (i10 == 0) {
                m mVarP = fVar.P(i10);
                if (mVarP.f29526m) {
                    fVar.I(mVarP, false);
                }
            }
        }

        @Override // android.view.Window.Callback
        public final boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.f fVar = menu instanceof androidx.appcompat.view.menu.f ? (androidx.appcompat.view.menu.f) menu : null;
            if (i10 == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.f793x = true;
            }
            c cVar = this.f29501b;
            if (cVar != null) {
                u.e eVar = (u.e) cVar;
                if (i10 == 0) {
                    u uVar = u.this;
                    if (!uVar.f29566d) {
                        uVar.f29563a.f1218l = true;
                        uVar.f29566d = true;
                    }
                }
            }
            boolean zOnPreparePanel = this.f32079a.onPreparePanel(i10, view, menu);
            if (fVar != null) {
                fVar.f793x = false;
            }
            return zOnPreparePanel;
        }

        @Override // o.h, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.f fVar = f.this.P(0).f29521h;
            if (fVar != null) {
                super.onProvideKeyboardShortcuts(list, fVar, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            }
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            f fVar = f.this;
            if (!fVar.f29494z || i10 != 0) {
                return o.h.a.b(this.f32079a, callback, i10);
            }
            o.e.a aVar = new o.e.a(fVar.f29464k, callback);
            o.a aVarC = fVar.C(aVar);
            if (aVarC != null) {
                return aVar.e(aVarC);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
