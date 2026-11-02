package w6;

/* JADX INFO: loaded from: classes.dex */
public final class z extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35909a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(String str, String message) {
        super(message);
        kotlin.jvm.internal.j.e(message, "message");
        this.f35909a = str;
    }
}
