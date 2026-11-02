package de;

import kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    public static final class a extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25311a = new a();
    }

    public static final class b extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25312a = new b();
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        String strB = w.a(getClass()).b();
        kotlin.jvm.internal.j.b(strB);
        return strB;
    }
}
