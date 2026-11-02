package ue;

/* JADX INFO: loaded from: classes2.dex */
public enum f {
    CR("\r"),
    CRLF("\r\n"),
    LF("\n");

    private final String lineSeparator;

    f(String str) {
        this.lineSeparator = str;
    }
}
