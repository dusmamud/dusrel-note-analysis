package k9;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final Intent a(long j10, long j11, boolean z10) {
        Intent intentPutExtra = new Intent("android.intent.action.INSERT").putExtra("beginTime", j10).putExtra("endTime", j11).putExtra("allDay", z10).putExtra("dtstart", j10).putExtra("dtend", j11).putExtra("allDay", z10);
        kotlin.jvm.internal.j.d(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }
}
