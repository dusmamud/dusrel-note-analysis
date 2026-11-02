package k8;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f29965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f29967c;

    public final void a(Object obj) {
        int i10;
        obj.getClass();
        int length = this.f29965a.length;
        int i11 = this.f29966b;
        int i12 = i11 + 1;
        if (i12 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i12 <= length) {
            i10 = length;
        } else {
            i10 = (length >> 1) + length + 1;
            if (i10 < i12) {
                int iHighestOneBit = Integer.highestOneBit(i11);
                i10 = iHighestOneBit + iHighestOneBit;
            }
            if (i10 < 0) {
                i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
        }
        if (i10 > length || this.f29967c) {
            this.f29965a = Arrays.copyOf(this.f29965a, i10);
            this.f29967c = false;
        }
        Object[] objArr = this.f29965a;
        int i13 = this.f29966b;
        this.f29966b = i13 + 1;
        objArr[i13] = obj;
    }
}
