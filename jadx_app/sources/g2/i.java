package g2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static void a(f fVar) {
        if (fVar != null) {
            try {
                fVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
