package y8;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static boolean a(String s6, CharSequence s10) {
        char c10;
        int length = s10.length();
        if (s10 == s6) {
            return true;
        }
        if (length == s6.length()) {
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = s10.charAt(i10);
                char cCharAt2 = s6.charAt(i10);
                if (cCharAt == cCharAt2 || ((c10 = (char) ((cCharAt | ' ') - 97)) < 26 && c10 == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static String b(String string) {
        int length = string.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = string.charAt(i10);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = string.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return string;
    }

    public static String c(String string) {
        int length = string.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = string.charAt(i10);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = string.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'a' && c10 <= 'z') {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return string;
    }
}
