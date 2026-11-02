package we;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes2.dex */
public final class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a<T>[] f36083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f36086d;

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f36087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public T f36088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a<T> f36089c;

        public a(long j10, T t6, a<T> aVar) {
            this.f36087a = j10;
            this.f36088b = t6;
            this.f36089c = aVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(long j10, Class cls) {
        int i10 = ((((int) (j10 >>> 32)) ^ ((int) j10)) & Api.BaseClientBuilder.API_PRIORITY_OTHER) % this.f36084b;
        a<T> aVar = this.f36083a[i10];
        for (a<T> aVar2 = aVar; aVar2 != null; aVar2 = aVar2.f36089c) {
            if (aVar2.f36087a == j10) {
                aVar2.f36088b = cls;
                return;
            }
        }
        this.f36083a[i10] = new a<>(j10, cls, aVar);
        this.f36086d++;
        if (this.f36086d > this.f36085c) {
            int i11 = this.f36084b;
            int i12 = i11 * 2;
            a<T>[] aVarArr = new a[i12];
            for (a<T> aVar3 : this.f36083a) {
                while (aVar3 != null) {
                    long j11 = aVar3.f36087a;
                    int i13 = ((((int) j11) ^ ((int) (j11 >>> 32))) & Api.BaseClientBuilder.API_PRIORITY_OTHER) % i12;
                    a<T> aVar4 = aVar3.f36089c;
                    aVar3.f36089c = aVarArr[i13];
                    aVarArr[i13] = aVar3;
                    aVar3 = aVar4;
                }
            }
            this.f36083a = aVarArr;
            this.f36084b = i12;
            this.f36085c = (i11 * 8) / 3;
        }
    }
}
