package za;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String message, Exception exc) {
        super(message, exc);
        j.e(message, "message");
    }
}
