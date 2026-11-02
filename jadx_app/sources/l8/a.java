package l8;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f30739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30740b;

    public a(IBinder iBinder, String str) {
        this.f30739a = iBinder;
        this.f30740b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f30739a;
    }
}
