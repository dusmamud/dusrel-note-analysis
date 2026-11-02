package rd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
public interface n0<T> extends p1 {
    Object await(Continuation<? super T> continuation);

    T getCompleted();

    Throwable getCompletionExceptionOrNull();

    zd.b<T> getOnAwait();
}
