package r8;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public interface h extends IInterface {
    void C1(String str, String str2, String str3, Bundle bundle, com.google.android.play.core.hsdp.service.c cVar) throws RemoteException;

    void O0(Bundle bundle, com.google.android.play.core.hsdp.service.c cVar) throws RemoteException;

    void y(String str, ArrayList arrayList, com.google.android.play.core.hsdp.service.b bVar) throws RemoteException;
}
