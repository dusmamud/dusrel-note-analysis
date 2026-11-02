package g2;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface f extends b2.i {

    public interface a {
        f a();
    }

    void close() throws IOException;

    void f(x xVar);

    default Map<String, List<String>> h() {
        return Collections.EMPTY_MAP;
    }

    long i(j jVar) throws IOException;

    Uri m();
}
