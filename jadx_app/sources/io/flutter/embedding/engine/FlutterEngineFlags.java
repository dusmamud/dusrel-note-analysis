package io.flutter.embedding.engine;

import com.amazon.a.a.o.b.f;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class FlutterEngineFlags {
    public static final List<Flag> ALL_FLAGS;
    public static final Flag AOT_SHARED_LIBRARY_NAME;
    private static final Flag DART_FLAGS;

    @Deprecated
    public static final Flag DEPRECATED_AOT_SHARED_LIBRARY_NAME;
    private static final Map<Flag, Flag> DEPRECATED_FLAGS_BY_REPLACEMENT;

    @Deprecated
    public static final Flag DEPRECATED_FLUTTER_ASSETS_DIR;
    private static final List<Flag> DISABLED_FLAGS;
    public static final Flag DISABLE_MERGED_PLATFORM_UI_THREAD;
    private static final Flag DISABLE_SERVICE_AUTH_CODES;
    private static final Flag DISABLE_SERVICE_ORIGIN_CHECK;
    private static final Flag DUMP_SKP_ON_SHADER_COMPILATION;
    private static final Flag ENABLE_DART_PROFILING;
    private static final Flag ENABLE_FLUTTER_GPU;
    private static final Flag ENABLE_HCPP;
    private static final Flag ENABLE_IMPELLER;
    public static final Flag ENABLE_SOFTWARE_RENDERING;
    private static final Flag ENABLE_VULKAN_VALIDATION;
    private static final Flag ENDLESS_TRACE_BUFFER;
    private static final Map<String, Flag> FLAG_BY_COMMAND_LINE_ARG;
    private static final Map<String, Flag> FLAG_BY_META_DATA_KEY;
    public static final Flag FLUTTER_ASSETS_DIR;
    private static final Flag IMPELLER_ANTIALIAS_LINES;
    private static final Flag IMPELLER_BACKEND;
    private static final Flag IMPELLER_LAZY_SHADER_MODER;
    private static final Flag IMPELLER_OPENGL_GPU_TRACING;
    private static final Flag IMPELLER_VULKAN_GPU_TRACING;
    public static final Flag ISOLATE_SNAPSHOT_DATA;
    public static final Flag LEAK_VM;
    private static final Flag MERGED_PLATFORM_UI_THREAD;
    public static final Flag OLD_GEN_HEAP_SIZE;
    private static final Flag PROFILE_MICROTASKS;
    private static final Flag PROFILE_STARTUP;
    private static final Flag PURGE_PERSISTENT_CACHE;
    private static final Flag SKIA_DETERMINISTIC_RENDERING;
    private static final Flag START_PAUSED;
    public static final Flag TEST_FLAG;
    private static final Flag TRACE_SKIA;
    private static final Flag TRACE_SKIA_ALLOWLIST;
    private static final Flag TRACE_STARTUP;
    private static final Flag TRACE_SYSTRACE;
    private static final Flag TRACE_TO_FILE;
    private static final Flag USE_TEST_FONTS;
    private static final Flag VERBOSE_LOGGING;
    private static final Flag VM_SERVICE_PORT;
    public static final Flag VM_SNAPSHOT_DATA;

    static {
        boolean z10 = true;
        Flag flag = new Flag("--aot-shared-library-name=", "AOTSharedLibraryName", z10);
        AOT_SHARED_LIBRARY_NAME = flag;
        Flag flag2 = new Flag("--aot-shared-library-name=", "aot-shared-library-name", "io.flutter.embedding.engine.loader.FlutterLoader.", true);
        DEPRECATED_AOT_SHARED_LIBRARY_NAME = flag2;
        Flag flag3 = new Flag("--flutter-assets-dir=", "FlutterAssetsDir", z10);
        FLUTTER_ASSETS_DIR = flag3;
        Flag flag4 = new Flag("--flutter-assets-dir=", "flutter-assets-dir", "io.flutter.embedding.engine.loader.FlutterLoader.", true);
        DEPRECATED_FLUTTER_ASSETS_DIR = flag4;
        Flag flag5 = new Flag("--old-gen-heap-size=", "OldGenHeapSize", z10);
        OLD_GEN_HEAP_SIZE = flag5;
        Flag flag6 = new Flag("--enable-impeller=", "EnableImpeller", z10);
        ENABLE_IMPELLER = flag6;
        Flag flag7 = new Flag("--impeller-backend=", "ImpellerBackend", z10);
        IMPELLER_BACKEND = flag7;
        Flag flag8 = new Flag(FlutterShellArgs.ARG_ENABLE_DART_PROFILING, "EnableDartProfiling", z10);
        ENABLE_DART_PROFILING = flag8;
        Flag flag9 = new Flag(FlutterShellArgs.ARG_PROFILE_STARTUP, "ProfileStartup", z10);
        PROFILE_STARTUP = flag9;
        Flag flag10 = new Flag(FlutterShellArgs.ARG_TRACE_STARTUP, "TraceStartup", z10);
        TRACE_STARTUP = flag10;
        Flag flag11 = new Flag("--merged-platform-ui-thread", "MergedPlatformUIThread", z10);
        MERGED_PLATFORM_UI_THREAD = flag11;
        Flag flag12 = new Flag("--vm-snapshot-data=", "VmSnapshotData", z10);
        VM_SNAPSHOT_DATA = flag12;
        Flag flag13 = new Flag("--isolate-snapshot-data=", "IsolateSnapshotData", z10);
        ISOLATE_SNAPSHOT_DATA = flag13;
        Flag flag14 = new Flag("--enable-hcpp-and-surface-control", "EnableHcpp", z10);
        ENABLE_HCPP = flag14;
        Flag flag15 = new Flag(FlutterShellArgs.ARG_ENABLE_FLUTTER_GPU, "EnableFlutterGPU", z10);
        ENABLE_FLUTTER_GPU = flag15;
        Flag flag16 = new Flag("--impeller-lazy-shader-mode", "ImpellerLazyShaderInitialization", z10);
        IMPELLER_LAZY_SHADER_MODER = flag16;
        Flag flag17 = new Flag("--impeller-antialias-lines", "ImpellerAntialiasLines", z10);
        IMPELLER_ANTIALIAS_LINES = flag17;
        Flag flag18 = new Flag("--enable-opengl-gpu-tracing", "EnableOpenGLGPUTracing");
        IMPELLER_OPENGL_GPU_TRACING = flag18;
        Flag flag19 = new Flag("--enable-vulkan-gpu-tracing", "EnableVulkanGPUTracing");
        IMPELLER_VULKAN_GPU_TRACING = flag19;
        Flag flag20 = new Flag(FlutterShellArgs.ARG_SKIA_DETERMINISTIC_RENDERING, "SkiaDeterministicRendering");
        SKIA_DETERMINISTIC_RENDERING = flag20;
        Flag flag21 = new Flag(FlutterShellArgs.ARG_ENABLE_SOFTWARE_RENDERING, "EnableSoftwareRendering");
        ENABLE_SOFTWARE_RENDERING = flag21;
        Flag flag22 = new Flag(FlutterShellArgs.ARG_USE_TEST_FONTS, "UseTestFonts");
        USE_TEST_FONTS = flag22;
        Flag flag23 = new Flag(FlutterShellArgs.ARG_VM_SERVICE_PORT, "VMServicePort");
        VM_SERVICE_PORT = flag23;
        Flag flag24 = new Flag(FlutterShellArgs.ARG_ENABLE_VULKAN_VALIDATION, "EnableVulkanValidation");
        ENABLE_VULKAN_VALIDATION = flag24;
        Flag flag25 = new Flag("--test-flag", "TestFlag");
        TEST_FLAG = flag25;
        Flag flag26 = new Flag("--leak-vm=", "LeakVM");
        LEAK_VM = flag26;
        Flag flag27 = new Flag(FlutterShellArgs.ARG_START_PAUSED, "StartPaused");
        START_PAUSED = flag27;
        Flag flag28 = new Flag(FlutterShellArgs.ARG_DISABLE_SERVICE_AUTH_CODES, "DisableServiceAuthCodes");
        DISABLE_SERVICE_AUTH_CODES = flag28;
        Flag flag29 = new Flag("--disable-service-origin-check", "DisableServiceOriginCheck");
        DISABLE_SERVICE_ORIGIN_CHECK = flag29;
        Flag flag30 = new Flag(FlutterShellArgs.ARG_ENDLESS_TRACE_BUFFER, "EndlessTraceBuffer");
        ENDLESS_TRACE_BUFFER = flag30;
        Flag flag31 = new Flag(FlutterShellArgs.ARG_TRACE_SKIA, "TraceSkia");
        TRACE_SKIA = flag31;
        Flag flag32 = new Flag(FlutterShellArgs.ARG_TRACE_SKIA_ALLOWLIST, "TraceSkiaAllowList");
        TRACE_SKIA_ALLOWLIST = flag32;
        Flag flag33 = new Flag(FlutterShellArgs.ARG_TRACE_SYSTRACE, "TraceSystrace");
        TRACE_SYSTRACE = flag33;
        Flag flag34 = new Flag("--trace-to-file=", "TraceToFile");
        TRACE_TO_FILE = flag34;
        Flag flag35 = new Flag(FlutterShellArgs.ARG_PROFILE_MICROTASKS, "ProfileMicrotasks");
        PROFILE_MICROTASKS = flag35;
        Flag flag36 = new Flag(FlutterShellArgs.ARG_DUMP_SHADER_SKP_ON_SHADER_COMPILATION, "DumpSkpOnShaderCompilation");
        DUMP_SKP_ON_SHADER_COMPILATION = flag36;
        Flag flag37 = new Flag(FlutterShellArgs.ARG_PURGE_PERSISTENT_CACHE, "PurgePersistentCache");
        PURGE_PERSISTENT_CACHE = flag37;
        Flag flag38 = new Flag(FlutterShellArgs.ARG_VERBOSE_LOGGING, "VerboseLogging");
        VERBOSE_LOGGING = flag38;
        Flag flag39 = new Flag("--dart-flags=", "DartFlags");
        DART_FLAGS = flag39;
        Flag flag40 = new Flag("--no-enable-merged-platform-ui-thread", "DisableMergedPlatformUIThread");
        DISABLE_MERGED_PLATFORM_UI_THREAD = flag40;
        List<Flag> listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(flag23, flag22, flag21, flag20, flag, flag3, flag6, flag7, flag24, flag27, flag28, flag29, flag30, flag8, flag9, flag31, flag32, flag33, flag34, flag35, flag36, flag38, flag39, flag11, flag40, flag2, flag4, flag5, flag12, flag13, flag37, flag10, flag26, flag25, flag15, flag16, flag17, flag18, flag19, flag14));
        ALL_FLAGS = listUnmodifiableList;
        DISABLED_FLAGS = Collections.unmodifiableList(Arrays.asList(flag40));
        DEPRECATED_FLAGS_BY_REPLACEMENT = new HashMap<Flag, Flag>() { // from class: io.flutter.embedding.engine.FlutterEngineFlags.1
            {
                put(FlutterEngineFlags.DEPRECATED_AOT_SHARED_LIBRARY_NAME, FlutterEngineFlags.AOT_SHARED_LIBRARY_NAME);
                put(FlutterEngineFlags.DEPRECATED_FLUTTER_ASSETS_DIR, FlutterEngineFlags.FLUTTER_ASSETS_DIR);
            }
        };
        HashMap map = new HashMap(listUnmodifiableList.size());
        HashMap map2 = new HashMap(listUnmodifiableList.size());
        for (Flag flag41 : listUnmodifiableList) {
            map.put(flag41.engineArgument, flag41);
            map2.put(flag41.metadataKey, flag41);
        }
        FLAG_BY_COMMAND_LINE_ARG = Collections.unmodifiableMap(map);
        FLAG_BY_META_DATA_KEY = Collections.unmodifiableMap(map2);
    }

    private FlutterEngineFlags() {
    }

    public static Flag getFlagByEngineArgument(String str) {
        int iIndexOf = str.indexOf(61);
        Map<String, Flag> map = FLAG_BY_COMMAND_LINE_ARG;
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf + 1);
        }
        Flag flag = map.get(str);
        Flag replacementFlagIfDeprecated = getReplacementFlagIfDeprecated(flag);
        return replacementFlagIfDeprecated != null ? replacementFlagIfDeprecated : flag;
    }

    public static Flag getFlagFromIntentKey(String str) {
        Flag flagByEngineArgument = getFlagByEngineArgument(str);
        if (flagByEngineArgument == null) {
            flagByEngineArgument = getFlagByEngineArgument("--" + str);
        }
        if (flagByEngineArgument != null) {
            return flagByEngineArgument;
        }
        return getFlagByEngineArgument("--" + str + f.f5856b);
    }

    public static Flag getReplacementFlagIfDeprecated(Flag flag) {
        return DEPRECATED_FLAGS_BY_REPLACEMENT.get(flag);
    }

    public static boolean isDisabled(Flag flag) {
        return DISABLED_FLAGS.contains(flag);
    }

    public static class Flag {
        public final boolean allowedInRelease;
        public final String engineArgument;
        public final String metadataKey;

        public boolean hasCommandLineValue() {
            return this.engineArgument.endsWith(f.f5856b);
        }

        private Flag(String str, String str2) {
            this(str, str2, "io.flutter.embedding.android.", false);
        }

        private Flag(String str, String str2, boolean z10) {
            this(str, str2, "io.flutter.embedding.android.", z10);
        }

        private Flag(String str, String str2, String str3, boolean z10) {
            this.engineArgument = str;
            this.metadataKey = androidx.concurrent.futures.a.a(str3, str2);
            this.allowedInRelease = z10;
        }
    }
}
