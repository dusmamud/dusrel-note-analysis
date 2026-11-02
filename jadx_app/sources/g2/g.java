package g2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class g extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f27084b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27085a;

    public g(int i10) {
        this.f27085a = i10;
    }

    public g(int i10, Exception exc) {
        super(exc);
        this.f27085a = i10;
    }

    public g(String str, int i10) {
        super(str);
        this.f27085a = i10;
    }

    public g(int i10, String str, Exception exc) {
        super(str, exc);
        this.f27085a = i10;
    }
}
