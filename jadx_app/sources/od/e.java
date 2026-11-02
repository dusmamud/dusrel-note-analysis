package od;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Iterator<String>, gd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f32562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32566e;

    public e(CharSequence string) {
        kotlin.jvm.internal.j.e(string, "string");
        this.f32562a = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f32563b;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f32566e < 0) {
            this.f32563b = 2;
            return false;
        }
        CharSequence charSequence = this.f32562a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i13 = this.f32564c; i13 < length2; i13++) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < charSequence.length() && charSequence.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f32563b = 1;
                this.f32566e = i10;
                this.f32565d = length;
                return true;
            }
        }
        i10 = -1;
        this.f32563b = 1;
        this.f32566e = i10;
        this.f32565d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f32563b = 0;
        int i10 = this.f32565d;
        int i11 = this.f32564c;
        this.f32564c = this.f32566e + i10;
        return this.f32562a.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
