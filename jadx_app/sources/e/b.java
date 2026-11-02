package e;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e.a f25425a;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* JADX INFO: renamed from: e.b$b, reason: collision with other inner class name */
    public class BinderC0136b extends e.a.AbstractBinderC0134a {
        public BinderC0136b() {
            attachInterface(this, e.a.U);
        }

        @Override // e.a
        public final void n2(int i10, Bundle bundle) {
            b.this.a(i10, bundle);
        }
    }

    public b(Parcel parcel) {
        e.a aVar;
        IBinder strongBinder = parcel.readStrongBinder();
        int i10 = e.a.AbstractBinderC0134a.f25423a;
        if (strongBinder == null) {
            aVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(e.a.U);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e.a)) {
                e.a.AbstractBinderC0134a.C0135a c0135a = new e.a.AbstractBinderC0134a.C0135a();
                c0135a.f25424a = strongBinder;
                aVar = c0135a;
            } else {
                aVar = (e.a) iInterfaceQueryLocalInterface;
            }
        }
        this.f25425a = aVar;
    }

    public final void b(int i10, Bundle bundle) {
        e.a aVar = this.f25425a;
        if (aVar != null) {
            try {
                aVar.n2(i10, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f25425a == null) {
                    this.f25425a = new BinderC0136b();
                }
                parcel.writeStrongBinder(this.f25425a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i10, Bundle bundle) {
    }
}
