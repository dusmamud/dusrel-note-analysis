package e0;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25427a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25428b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f25429c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.widget.a> f25430d;

    public static float g(Number number) {
        return number instanceof Float ? ((Float) number).floatValue() : Float.parseFloat(number.toString());
    }

    public abstract void a(HashMap<String, d0.d> map);

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract d clone();

    public d c(d dVar) {
        this.f25427a = dVar.f25427a;
        this.f25428b = dVar.f25428b;
        this.f25429c = dVar.f25429c;
        this.f25430d = dVar.f25430d;
        return this;
    }

    public abstract void d(HashSet<String> hashSet);

    public abstract void e(Context context, AttributeSet attributeSet);

    public void f(HashMap<String, Integer> map) {
    }
}
