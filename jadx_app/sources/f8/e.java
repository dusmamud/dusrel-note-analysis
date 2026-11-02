package f8;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class e implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f26801a;

    public e(IBinder iBinder) {
        this.f26801a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f26801a;
    }
}
