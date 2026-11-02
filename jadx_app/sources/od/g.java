package od;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f32570a;

    public static final class a implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f32571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f32572b;

        public a(String str, int i10) {
            this.f32571a = str;
            this.f32572b = i10;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.f32571a, this.f32572b);
            kotlin.jvm.internal.j.d(patternCompile, "compile(...)");
            return new g(patternCompile);
        }
    }

    public g(Pattern pattern) {
        this.f32570a = pattern;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        Pattern pattern = this.f32570a;
        String strPattern = pattern.pattern();
        kotlin.jvm.internal.j.d(strPattern, "pattern(...)");
        return new a(strPattern, pattern.flags());
    }

    public final String toString() {
        String string = this.f32570a.toString();
        kotlin.jvm.internal.j.d(string, "toString(...)");
        return string;
    }

    public g(String str) {
        Pattern patternCompile = Pattern.compile(str);
        kotlin.jvm.internal.j.d(patternCompile, "compile(...)");
        this.f32570a = patternCompile;
    }
}
