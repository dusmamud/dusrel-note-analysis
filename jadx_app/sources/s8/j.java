package s8;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f34095a;

    public j(k kVar) {
        Objects.requireNonNull(kVar);
        this.f34095a = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f34095a.a();
    }
}
