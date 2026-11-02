package androidx.media;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f2698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2699b = -1;

    public static class a implements AudioAttributesImpl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributes.Builder f2700a = new AudioAttributes.Builder();

        @Override // androidx.media.AudioAttributesImpl.a
        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(int i10) {
            if (i10 == 16) {
                i10 = 12;
            }
            this.f2700a.setUsage(i10);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi21(this.f2700a.build(), 0);
        }
    }

    public AudioAttributesImplApi21() {
    }

    @Override // androidx.media.AudioAttributesImpl
    public final int a() {
        int i10 = this.f2699b;
        return i10 != -1 ? i10 : AudioAttributesCompat.c(this.f2698a.getFlags(), this.f2698a.getUsage());
    }

    @Override // androidx.media.AudioAttributesImpl
    public final Object b() {
        return this.f2698a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f2698a.equals(((AudioAttributesImplApi21) obj).f2698a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2698a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f2698a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i10) {
        this.f2698a = audioAttributes;
    }
}
