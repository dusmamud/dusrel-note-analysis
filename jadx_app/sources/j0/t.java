package j0;

import android.app.Person;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    public static class a {
        public static Person a(t tVar) {
            return new Person.Builder().setName(null).setIcon(null).setUri(null).setKey(null).setBot(false).setImportant(false).build();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof t)) {
            return false;
        }
        if ("null".equals("null")) {
            Object obj2 = Boolean.FALSE;
            if (obj2.equals(obj2) && obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Objects.hash(null, null, bool, bool);
    }
}
