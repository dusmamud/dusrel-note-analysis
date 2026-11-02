package k;

import android.content.Context;
import android.location.LocationManager;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static w f29581d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f29583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f29584c = new a();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f29585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f29586b;
    }

    public w(Context context, LocationManager locationManager) {
        this.f29582a = context;
        this.f29583b = locationManager;
    }
}
