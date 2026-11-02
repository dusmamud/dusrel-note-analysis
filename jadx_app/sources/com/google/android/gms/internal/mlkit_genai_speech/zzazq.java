package com.google.android.gms.internal.mlkit_genai_speech;

import android.content.ComponentName;
import android.content.Intent;
import android.os.UserHandle;
import java.net.SocketAddress;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzazq extends SocketAddress {
    private final Intent zza;
    private final UserHandle zzb;

    public static zzazq zzc(ComponentName componentName) {
        return new zzazq(new Intent("grpc.io.action.BIND").setComponent(componentName), null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzazq) {
            zzazq zzazqVar = (zzazq) obj;
            if (this.zza.filterEquals(zzazqVar.zza) && Objects.equals(this.zzb, zzazqVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.zza;
        if (intent.getPackage() != null) {
            intent = intent.cloneFilter().setPackage(null);
        }
        return intent.filterHashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidComponentAddress[");
        UserHandle userHandle = this.zzb;
        if (userHandle != null) {
            sb2.append(userHandle);
            sb2.append("@");
        }
        sb2.append(this.zza);
        sb2.append("]");
        return sb2.toString();
    }

    public final Intent zza() {
        return this.zza.cloneFilter();
    }

    public final UserHandle zzb() {
        return this.zzb;
    }

    public final String zzd() {
        Intent intent = this.zza;
        return intent.getPackage() != null ? intent.getPackage() : intent.getComponent().getPackageName();
    }

    private zzazq(Intent intent, UserHandle userHandle) {
        boolean z10 = true;
        if (intent.getComponent() == null && intent.getPackage() == null) {
            z10 = false;
        }
        zzgo.zzf(z10, "'bindIntent' must be explicit. Specify either a package or ComponentName.");
        this.zza = intent;
        this.zzb = userHandle;
    }
}
