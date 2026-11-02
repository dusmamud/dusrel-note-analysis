package k2;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f29663d = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f29665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f29666c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f29667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f29668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f29669c;

        public final e a() {
            if (this.f29667a || !(this.f29668b || this.f29669c)) {
                return new e(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
    }

    public e(a aVar) {
        this.f29664a = aVar.f29667a;
        this.f29665b = aVar.f29668b;
        this.f29666c = aVar.f29669c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f29664a == eVar.f29664a && this.f29665b == eVar.f29665b && this.f29666c == eVar.f29666c;
    }

    public final int hashCode() {
        return ((this.f29664a ? 1 : 0) << 2) + ((this.f29665b ? 1 : 0) << 1) + (this.f29666c ? 1 : 0);
    }
}
