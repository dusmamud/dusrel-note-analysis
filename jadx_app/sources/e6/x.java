package e6;

import com.google.android.gms.internal.p000firebaseauthapi.hf;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class x {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;
    public static final x CONNECTED;
    public static final x METERED;
    public static final x NOT_REQUIRED;
    public static final x NOT_ROAMING;
    public static final x TEMPORARILY_UNMETERED;
    public static final x UNMETERED;

    static {
        x xVar = new x("NOT_REQUIRED", 0);
        NOT_REQUIRED = xVar;
        x xVar2 = new x("CONNECTED", 1);
        CONNECTED = xVar2;
        x xVar3 = new x("UNMETERED", 2);
        UNMETERED = xVar3;
        x xVar4 = new x("NOT_ROAMING", 3);
        NOT_ROAMING = xVar4;
        x xVar5 = new x("METERED", 4);
        METERED = xVar5;
        x xVar6 = new x("TEMPORARILY_UNMETERED", 5);
        TEMPORARILY_UNMETERED = xVar6;
        x[] xVarArr = {xVar, xVar2, xVar3, xVar4, xVar5, xVar6};
        $VALUES = xVarArr;
        $ENTRIES = hf.e(xVarArr);
    }

    public x() {
        throw null;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }
}
