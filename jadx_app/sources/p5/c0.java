package p5;

import android.view.ViewGroup;
import android.view.WindowId;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowId f32807a;

    public c0(ViewGroup viewGroup) {
        this.f32807a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c0) && ((c0) obj).f32807a.equals(this.f32807a);
    }

    public final int hashCode() {
        return this.f32807a.hashCode();
    }
}
