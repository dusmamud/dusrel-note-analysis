package m6;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.work.b f31292b;

    public w(androidx.work.b progress, String workSpecId) {
        kotlin.jvm.internal.j.e(workSpecId, "workSpecId");
        kotlin.jvm.internal.j.e(progress, "progress");
        this.f31291a = workSpecId;
        this.f31292b = progress;
    }
}
