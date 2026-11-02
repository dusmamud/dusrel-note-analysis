package m7;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class k {

    public enum a {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int value;

        a(int i10) {
            this.value = i10;
        }
    }

    public abstract m7.a a();

    public abstract a b();
}
