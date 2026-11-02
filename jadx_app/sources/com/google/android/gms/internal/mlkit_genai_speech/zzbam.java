package com.google.android.gms.internal.mlkit_genai_speech;

import android.content.ComponentName;
import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbam extends zzbat implements zzbdr, zzbac {
    private final zzbju zzf;
    private final Executor zzg;
    private final zzbab zzh;
    private final zzbad zzi;
    private final AtomicInteger zzj;
    private final long zzk;
    private final zzbcb zzl;
    private final boolean zzm;
    private zzbjq zzn;
    private int zzo;
    private ScheduledFuture zzp;
    private final zzbak zzq;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.gms.internal.mlkit_genai_speech.zzbah] */
    public zzbam(zzbap zzbapVar, zzazq zzazqVar, zzbdo zzbdoVar) {
        zzbju zzbjuVar = zzbapVar.zzd;
        zzatu zzatuVarZza = zzbdoVar.zza();
        Context context = zzbapVar.zza;
        zzazy zzazyVar = zzbapVar.zzh;
        zzatr zzatrVarZza = zzatu.zza();
        zzatrVarZza.zzb(zzbgj.zza, zzayv.NONE);
        zzatrVarZza.zzb(zzbgj.zzb, zzatuVarZza);
        zzatrVarZza.zzb(zzavn.zzb, zzazq.zzc(new ComponentName(context, context.getClass())));
        zzatrVarZza.zzb(zzavn.zza, zzazqVar);
        zzatrVarZza.zzb(zzbat.zzb, zzazyVar);
        super(zzbjuVar, zzatrVarZza.zzc(), zzbapVar.zzk, zzawd.zzb(zzbam.class, zzbapVar.zza.getClass().getSimpleName() + "->" + String.valueOf(zzazqVar)));
        this.zzo = 1001;
        zzbju zzbjuVar2 = zzbapVar.zze;
        this.zzf = zzbjuVar2;
        this.zzh = zzbapVar.zzf;
        this.zzg = (Executor) zzbjuVar2.zza();
        this.zzk = 60000L;
        Boolean bool = (Boolean) zzbdoVar.zza().zzc(zzazr.zzc);
        this.zzm = bool != null ? bool.booleanValue() : false;
        this.zzq = new zzbak(this, null);
        this.zzj = new AtomicInteger();
        this.zzl = new zzbcb(zzgx.zza(), new Object(this) { // from class: com.google.android.gms.internal.mlkit_genai_speech.zzbah
        });
        this.zzi = new zzbcf(zzbapVar.zzc, zzbapVar.zza, zzbapVar.zzb, zzazqVar.zza(), zzazqVar.zzb(), zzbapVar.zzg.zza(), this);
    }

    private final d9.b zzI(final int i10) {
        zzbab zzbabVar = this.zzh;
        return zzbabVar instanceof zzazs ? ((zzazs) zzbabVar).zzb(i10) : zzja.zza(new Callable() { // from class: com.google.android.gms.internal.mlkit_genai_speech.zzbae
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzh.zza(i10);
            }
        }, this.zzg);
    }

    private static zzbdk zzJ(zzazd zzazdVar, zzatu zzatuVar, zzaxq zzaxqVar, zzaum[] zzaumVarArr) {
        zzbng.zza(zzaumVarArr, zzatuVar, zzaxqVar).zzd();
        return new zzbgb(zzazdVar, zzbdl.PROCESSED, zzaumVarArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzK(zzazd zzazdVar) {
        if (zzH(2)) {
            if (!zzazdVar.zzj()) {
                zzA(zzazdVar, true);
                return;
            }
            zzbam zzbamVar = this.zzq.zza;
            zzbamVar.zzG(3);
            zzbjq zzbjqVar = zzbamVar.zzn;
            zzatu zzatuVar = zzbamVar.zzd;
            zzbjqVar.zza(zzatuVar);
            zzbamVar.zzd = zzatuVar;
            zzbamVar.zzn.zze();
            ScheduledFuture scheduledFuture = zzbamVar.zzp;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                zzbamVar.zzp = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzL(Throwable th) {
        zzA(zzazd.zzi.zze("Could not evaluate SecurityPolicy").zzd(th), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzM(zzazd zzazdVar) {
        if (zzH(2)) {
            if (zzazdVar.zzj()) {
                this.zzi.zzb();
            } else {
                zzA(zzazdVar, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzN() {
        if (zzH(2)) {
            this.zzp = null;
            long j10 = this.zzk;
            zzA(zzazd.zzd.zze("Connect timeout " + j10 + "ms lapsed"), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzO() {
        try {
            if (zzH(1)) {
                zzG(2);
                try {
                    if (this.zzm) {
                        d9.b bVarZzI = zzI(this.zzi.zza().applicationInfo.uid);
                        zzu(bVarZzI);
                        zzja.zzb(bVarZzI, new zzbai(this), this.zzg);
                    } else {
                        this.zzi.zzb();
                    }
                    this.zzp = zzv().schedule(new Runnable() { // from class: com.google.android.gms.internal.mlkit_genai_speech.zzbaf
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzN();
                        }
                    }, this.zzk, TimeUnit.MILLISECONDS);
                } catch (zzaze e10) {
                    zzA(e10.zza(), true);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* bridge */ /* synthetic */ void zzi(zzbam zzbamVar, int i10) {
        d9.b bVarZzI = zzbamVar.zzI(i10);
        zzbamVar.zzu(bVarZzI);
        zzja.zzb(bVarZzI, new zzbaj(zzbamVar), zzbamVar.zzg);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzbac
    public final synchronized void zza(IBinder iBinder) {
        this.zzq.zza.zzy(zzbbv.zzb(iBinder, this.zzg));
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzbac
    public final synchronized void zzb(zzazd zzazdVar) {
        zzA(zzazdVar, true);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzbdn
    public final synchronized zzbdk zze(zzaxv zzaxvVar, zzaxq zzaxqVar, zzatz zzatzVar, zzaum[] zzaumVarArr) throws Throwable {
        Throwable th;
        try {
            try {
                try {
                    if (!zzH(3)) {
                        return zzJ(zzE() ? this.zze : zzazd.zzi.zze("newStream() before transportReady()"), this.zzd, zzaxqVar, zzaumVarArr);
                    }
                    int i10 = this.zzo;
                    int i11 = i10 + 1;
                    this.zzo = i11;
                    if (i11 == 16777215) {
                        this.zzo = 1001;
                    }
                    zzbng zzbngVarZza = zzbng.zza(zzaumVarArr, this.zzd, zzaxqVar);
                    zzbax zzbaxVar = new zzbax(this, this.zzd, i10, !Boolean.TRUE.equals(zzatzVar.zzl(zzbgr.zzh)));
                    if (this.zzc.putIfAbsent(Integer.valueOf(i10), zzbaxVar) != null) {
                        zzazd zzazdVarZze = zzazd.zzi.zze("Clashing call IDs");
                        zzA(zzazdVarZze, true);
                        return zzJ(zzazdVarZze, this.zzd, zzaxqVar, zzaumVarArr);
                    }
                    if (zzbaxVar.zze() && this.zzj.getAndIncrement() == 0) {
                        this.zzn.zzd(true);
                    }
                    zzbbw zzbbwVar = new zzbbw(this, i10, zzaxvVar, zzaxqVar, zzbngVarZza);
                    if (zzaxvVar.zzb().zza()) {
                        return new zzbcg(zzbaxVar, zzbbwVar, this.zzd);
                    }
                    return new zzbbq(zzbaxVar, zzbbwVar, this.zzd);
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzbjr
    public final synchronized Runnable zzf(zzbjq zzbjqVar) {
        this.zzn = zzbjqVar;
        return new Runnable() { // from class: com.google.android.gms.internal.mlkit_genai_speech.zzbag
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzO();
            }
        };
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzbat
    public final void zzm(Parcel parcel) {
        this.zzl.zza(parcel.readInt());
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzbat
    public final void zzn(Parcel parcel) {
        if (zzH(2)) {
            if (parcel.readInt() != 1) {
                zzA(zzazd.zzj.zze("Wire format version mismatch"), true);
                return;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzA(zzazd.zzj.zze("Malformed SETUP_TRANSPORT data"), true);
                return;
            }
            if (!zzF(zzbbv.zzb(strongBinder, this.zzg))) {
                zzA(zzazd.zzj.zze("Failed to observe outgoing binder"), true);
                return;
            }
            zzbam zzbamVar = this.zzq.zza;
            int callingUid = Binder.getCallingUid();
            zzbamVar.zzw(callingUid);
            zzatr zzatrVarZzb = zzbamVar.zzd.zzb();
            zzatrVarZzb.zzb(zzbat.zza, Integer.valueOf(callingUid));
            zzatrVarZzb.zzb(zzbgj.zza, callingUid == Process.myUid() ? zzayv.PRIVACY_AND_INTEGRITY : zzayv.INTEGRITY);
            zzbamVar.zzd = zzatrVarZzb.zzc();
            zzi(zzbamVar, callingUid);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzbat
    public final void zzo(zzazd zzazdVar) {
        this.zzn.zzf(zzazdVar, zzbnf.UNKNOWN);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzbat
    public final void zzp() {
        if (this.zzj.getAndSet(0) > 0) {
            this.zzn.zzd(false);
        }
        ScheduledFuture scheduledFuture = this.zzp;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.zzp = null;
        }
        ((zzbcf) this.zzi).zze(zzazd.zzb);
        this.zzn.zzg();
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzbat
    public final void zzq() {
        super.zzq();
        this.zzf.zzb(this.zzg);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzbjr
    public final synchronized void zzr(zzazd zzazdVar) {
        zzgo.zzc(zzazdVar, "reason");
        zzA(zzazdVar, false);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzbat
    public final void zzs(zzbbb zzbbbVar) {
        if (zzbbbVar.zze() && this.zzj.decrementAndGet() == 0) {
            this.zzn.zzd(false);
        }
        zzB(zzbbbVar.zzc);
    }
}
