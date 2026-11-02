package io.flutter.embedding.engine.loader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import io.flutter.embedding.engine.FlutterEngineFlags;

/* JADX INFO: loaded from: classes2.dex */
public final class ApplicationInfoLoader {
    private static ApplicationInfo getApplicationInfo(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static boolean getBoolean(Bundle bundle, String str, boolean z10) {
        return bundle == null ? z10 : bundle.getBoolean(str, z10);
    }

    private static String getString(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str, null);
    }

    private static String getStringWithFallback(Bundle bundle, String str, String str2) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString(str, null);
        return string == null ? bundle.getString(str2) : string;
    }

    public static FlutterApplicationInfo load(Context context) {
        ApplicationInfo applicationInfo = getApplicationInfo(context);
        return new FlutterApplicationInfo(getStringWithFallback(applicationInfo.metaData, FlutterEngineFlags.AOT_SHARED_LIBRARY_NAME.metadataKey, FlutterEngineFlags.DEPRECATED_AOT_SHARED_LIBRARY_NAME.metadataKey), getString(applicationInfo.metaData, FlutterEngineFlags.VM_SNAPSHOT_DATA.metadataKey), getString(applicationInfo.metaData, FlutterEngineFlags.ISOLATE_SNAPSHOT_DATA.metadataKey), getStringWithFallback(applicationInfo.metaData, FlutterEngineFlags.FLUTTER_ASSETS_DIR.metadataKey, FlutterEngineFlags.DEPRECATED_FLUTTER_ASSETS_DIR.metadataKey), applicationInfo.nativeLibraryDir);
    }
}
