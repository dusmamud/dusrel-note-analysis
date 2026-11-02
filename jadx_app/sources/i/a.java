package i;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<I, O> {

    /* JADX INFO: renamed from: i.a$a, reason: collision with other inner class name */
    public static final class C0174a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f27779a;

        public C0174a(T t6) {
            this.f27779a = t6;
        }
    }

    public abstract Intent a(Context context, I i10);

    public C0174a<O> b(Context context, I i10) {
        return null;
    }

    public abstract O c(int i10, Intent intent);
}
