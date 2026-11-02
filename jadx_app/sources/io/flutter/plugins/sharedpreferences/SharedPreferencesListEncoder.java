package io.flutter.plugins.sharedpreferences;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0007\u001a\u00020\u0003H&¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;", "", "encode", "", "list", "", "decode", "listString", "shared_preferences_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SharedPreferencesListEncoder {
    List<String> decode(String listString);

    String encode(List<String> list);
}
