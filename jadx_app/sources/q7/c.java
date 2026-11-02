package q7;

import com.google.firebase.encoders.proto.ProtoEnum;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f33313b;

    public enum a implements ProtoEnum {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        a(int i10) {
            this.number_ = i10;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public final int getNumber() {
            return this.number_;
        }
    }

    public c(long j10, a aVar) {
        this.f33312a = j10;
        this.f33313b = aVar;
    }
}
