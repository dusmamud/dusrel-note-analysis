package io.flutter.embedding.engine.dart;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DartMessenger.SerialTaskQueue f28491a;

    public /* synthetic */ b(DartMessenger.SerialTaskQueue serialTaskQueue) {
        this.f28491a = serialTaskQueue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28491a.flush();
    }
}
