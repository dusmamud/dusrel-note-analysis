package o2;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e extends LinkedHashMap<Uri, byte[]> {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
        return size() > 4;
    }
}
