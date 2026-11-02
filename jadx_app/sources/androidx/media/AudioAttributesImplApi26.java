package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    public static class a extends AudioAttributesImplApi21.a {
        @Override // androidx.media.AudioAttributesImplApi21.a, androidx.media.AudioAttributesImpl.a
        public final AudioAttributesImpl.a a(int i10) {
            this.f2700a.setUsage(i10);
            return this;
        }

        @Override // androidx.media.AudioAttributesImplApi21.a
        /* JADX INFO: renamed from: b */
        public final AudioAttributesImplApi21.a a(int i10) {
            this.f2700a.setUsage(i10);
            return this;
        }

        @Override // androidx.media.AudioAttributesImplApi21.a, androidx.media.AudioAttributesImpl.a
        public final AudioAttributesImpl build() {
            return new AudioAttributesImplApi26(this.f2700a.build(), 0);
        }
    }
}
