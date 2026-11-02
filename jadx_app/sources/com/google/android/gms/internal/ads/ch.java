package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ch {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f7886c = dh.f8335a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7887a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7888b = false;

    public final synchronized void a(long j10, String str) {
        if (this.f7888b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f7887a.add(new bh(j10, SystemClock.elapsedRealtime(), str));
    }

    public final synchronized void b(String str) {
        long j10;
        this.f7888b = true;
        ArrayList arrayList = this.f7887a;
        int i10 = 0;
        if (arrayList.size() == 0) {
            j10 = 0;
        } else {
            j10 = ((bh) arrayList.get(arrayList.size() - 1)).f7233c - ((bh) arrayList.get(0)).f7233c;
        }
        if (j10 > 0) {
            long j11 = ((bh) arrayList.get(0)).f7233c;
            dh.b("(%-4d ms) %s", Long.valueOf(j10), str);
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                bh bhVar = (bh) obj;
                long j12 = bhVar.f7233c;
                dh.b("(+%-4d) [%2d] %s", Long.valueOf(j12 - j11), Long.valueOf(bhVar.f7232b), bhVar.f7231a);
                j11 = j12;
            }
        }
    }

    public final void finalize() throws Throwable {
        if (this.f7888b) {
            return;
        }
        b("Request on the loose");
        dh.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
