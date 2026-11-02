package n7;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class i implements p7.b<Executor> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f31704a = new i();
    }

    @Override // rc.a
    public final Object get() {
        return new k(Executors.newSingleThreadExecutor());
    }
}
