package n6;

import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static String a() {
        String processName = Application.getProcessName();
        kotlin.jvm.internal.j.d(processName, "getProcessName(...)");
        return processName;
    }
}
