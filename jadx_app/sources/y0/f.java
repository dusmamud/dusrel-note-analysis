package y0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f36776a;

    public interface c {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f36776a = new a(uri, clipDescription, uri2);
        } else {
            this.f36776a = new b(uri, clipDescription, uri2);
        }
    }

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputContentInfo f36777a;

        public a(Object obj) {
            this.f36777a = (InputContentInfo) obj;
        }

        @Override // y0.f.c
        public final Uri a() {
            return this.f36777a.getContentUri();
        }

        @Override // y0.f.c
        public final void b() {
            this.f36777a.requestPermission();
        }

        @Override // y0.f.c
        public final Uri c() {
            return this.f36777a.getLinkUri();
        }

        @Override // y0.f.c
        public final Object d() {
            return this.f36777a;
        }

        @Override // y0.f.c
        public final ClipDescription getDescription() {
            return this.f36777a.getDescription();
        }

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f36777a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public f(a aVar) {
        this.f36776a = aVar;
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f36778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ClipDescription f36779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f36780c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f36778a = uri;
            this.f36779b = clipDescription;
            this.f36780c = uri2;
        }

        @Override // y0.f.c
        public final Uri a() {
            return this.f36778a;
        }

        @Override // y0.f.c
        public final Uri c() {
            return this.f36780c;
        }

        @Override // y0.f.c
        public final Object d() {
            return null;
        }

        @Override // y0.f.c
        public final ClipDescription getDescription() {
            return this.f36779b;
        }

        @Override // y0.f.c
        public final void b() {
        }
    }
}
