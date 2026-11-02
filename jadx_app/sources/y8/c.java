package y8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements i<Character> {

    public static abstract class a extends c {
        @Override // y8.i
        @Deprecated
        public final boolean apply(Character character) {
            return a(character.charValue());
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char f37184a;

        public b(char match) {
            this.f37184a = match;
        }

        @Override // y8.c
        public final boolean a(char c10) {
            return c10 == this.f37184a;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CharMatcher.is('");
            char[] cArr = new char[6];
            cArr[0] = '\\';
            cArr[1] = 'u';
            cArr[2] = 0;
            cArr[3] = 0;
            cArr[4] = 0;
            cArr[5] = 0;
            char c10 = this.f37184a;
            for (int i10 = 0; i10 < 4; i10++) {
                cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
                c10 = (char) (c10 >> 4);
            }
            sb2.append(String.copyValueOf(cArr));
            sb2.append("')");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: y8.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0307c extends a {
        public final String toString() {
            return "CharMatcher.none()";
        }
    }

    public static final class d extends AbstractC0307c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f37185a = new d();

        @Override // y8.c
        public final boolean a(char c10) {
            return false;
        }
    }

    public abstract boolean a(char c10);
}
