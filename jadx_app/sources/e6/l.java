package e6;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f25859c;

    public l(int notificationId, Notification notification, int foregroundServiceType) {
        this.f25857a = notificationId;
        this.f25859c = notification;
        this.f25858b = foregroundServiceType;
    }

    public final boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 == null || l.class != o10.getClass()) {
            return false;
        }
        l lVar = (l) o10;
        if (this.f25857a == lVar.f25857a && this.f25858b == lVar.f25858b) {
            return this.f25859c.equals(lVar.f25859c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25859c.hashCode() + (((this.f25857a * 31) + this.f25858b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f25857a + ", mForegroundServiceType=" + this.f25858b + ", mNotification=" + this.f25859c + '}';
    }
}
