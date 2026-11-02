package he;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f27752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f27753b;

    static {
        String[] strArr = new String[93];
        for (int i10 = 0; i10 < 32; i10++) {
            strArr[i10] = "\\u" + b(i10 >> 12) + b(i10 >> 8) + b(i10 >> 4) + b(i10);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f27752a = strArr;
        byte[] bArr = new byte[93];
        for (int i11 = 0; i11 < 32; i11++) {
            bArr[i11] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f27753b = bArr;
    }

    public static final void a(StringBuilder sb2, String value) {
        kotlin.jvm.internal.j.e(value, "value");
        sb2.append('\"');
        int length = value.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = value.charAt(i11);
            String[] strArr = f27752a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb2.append((CharSequence) value, i10, i11);
                sb2.append(strArr[cCharAt]);
                i10 = i11 + 1;
            }
        }
        if (i10 != 0) {
            sb2.append((CharSequence) value, i10, value.length());
        } else {
            sb2.append(value);
        }
        sb2.append('\"');
    }

    public static final char b(int i10) {
        int i11 = i10 & 15;
        return (char) (i11 < 10 ? i11 + 48 : i11 + 87);
    }
}
