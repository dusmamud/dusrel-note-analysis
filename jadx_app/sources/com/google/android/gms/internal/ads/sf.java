package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class sf implements rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileChannel f15897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15899c;

    public sf(FileChannel fileChannel, long j10, long j11) {
        this.f15897a = fileChannel;
        this.f15898b = j10;
        this.f15899c = j11;
    }

    @Override // com.google.android.gms.internal.ads.rf
    public final void d(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        MappedByteBuffer map = this.f15897a.map(FileChannel.MapMode.READ_ONLY, this.f15898b + j10, i10);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // com.google.android.gms.internal.ads.rf
    public final long zza() {
        return this.f15899c;
    }
}
