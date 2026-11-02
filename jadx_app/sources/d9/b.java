package d9;

import com.google.errorprone.annotations.DoNotMock;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
@DoNotMock
public interface b<V> extends Future<V> {
    void addListener(Runnable listener, Executor executor);
}
