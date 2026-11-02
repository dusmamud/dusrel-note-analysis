package n7;

import android.util.Base64;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class l {

    @AutoValue.Builder
    public static abstract class a {
    }

    public static d.a a() {
        d.a aVar = new d.a();
        k7.d dVar = k7.d.DEFAULT;
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        aVar.f31694c = dVar;
        return aVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract k7.d d();

    public final String toString() {
        String strB = b();
        k7.d dVarD = d();
        String strEncodeToString = c() == null ? "" : Base64.encodeToString(c(), 2);
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(strB);
        sb2.append(", ");
        sb2.append(dVarD);
        sb2.append(", ");
        return androidx.concurrent.futures.c.a(sb2, strEncodeToString, ")");
    }
}
