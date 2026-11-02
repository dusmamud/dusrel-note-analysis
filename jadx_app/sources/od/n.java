package od;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements nd.g<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CharSequence f32574a;

    public n(CharSequence charSequence) {
        this.f32574a = charSequence;
    }

    @Override // nd.g
    public final Iterator<String> iterator() {
        return new e(this.f32574a);
    }
}
