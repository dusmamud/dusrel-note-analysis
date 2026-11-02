package l8;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class f1 extends IOException {
    public f1(Exception exc) {
        super("Error in decoding CborValue from bytes", exc);
    }
}
