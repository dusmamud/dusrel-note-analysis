package n1;

import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f31525a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile b f31526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class<?> f31527c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f31527c;
        return cls != null ? new l1.f(cls, charSequence) : super.newEditable(charSequence);
    }
}
