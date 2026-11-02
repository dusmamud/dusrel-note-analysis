package cd;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class d extends IOException {
    public d(File file, File file2, String str) {
        kotlin.jvm.internal.j.e(file, "file");
        StringBuilder sb2 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb2.append(" -> " + file2);
        }
        sb2.append(": ".concat(str));
        String string = sb2.toString();
        kotlin.jvm.internal.j.d(string, "toString(...)");
        super(string);
    }
}
