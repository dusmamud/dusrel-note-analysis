package ue;

import io.objectbox.model.PropertyFlags;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f35092a = 0;

    static {
        char c10 = File.separatorChar;
        System.lineSeparator();
        f.LF.getClass();
        f.CRLF.getClass();
        final a aVar = new a();
        new ThreadLocal() { // from class: ue.c
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                aVar.getClass();
                return new byte[PropertyFlags.UNSIGNED];
            }
        };
        final b bVar = new b();
        new ThreadLocal() { // from class: ue.d
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                bVar.getClass();
                return new char[PropertyFlags.UNSIGNED];
            }
        };
    }
}
