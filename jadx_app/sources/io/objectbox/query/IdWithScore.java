package io.objectbox.query;

/* JADX INFO: loaded from: classes2.dex */
public class IdWithScore {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f28938id;
    private final double score;

    public IdWithScore(long j10, double d10) {
        this.f28938id = j10;
        this.score = d10;
    }

    public long getId() {
        return this.f28938id;
    }

    public double getScore() {
        return this.score;
    }
}
