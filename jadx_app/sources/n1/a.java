package n1;

import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0209a f31522a;

    /* JADX INFO: renamed from: n1.a$a, reason: collision with other inner class name */
    public static class C0209a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditText f31523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f31524b;

        public C0209a(EditText editText) {
            this.f31523a = editText;
            g gVar = new g(editText);
            this.f31524b = gVar;
            editText.addTextChangedListener(gVar);
            if (n1.b.f31526b == null) {
                synchronized (n1.b.f31525a) {
                    try {
                        if (n1.b.f31526b == null) {
                            n1.b bVar = new n1.b();
                            try {
                                n1.b.f31527c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, n1.b.class.getClassLoader());
                            } catch (Throwable unused) {
                            }
                            n1.b.f31526b = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            editText.setEditableFactory(n1.b.f31526b);
        }
    }

    public static class b {
    }

    public a(EditText editText) {
        this.f31522a = new C0209a(editText);
    }
}
