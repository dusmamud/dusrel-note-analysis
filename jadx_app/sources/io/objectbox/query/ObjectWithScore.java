package io.objectbox.query;

/* JADX INFO: loaded from: classes2.dex */
public class ObjectWithScore<T> {
    private final T object;
    private final double score;

    public ObjectWithScore(T t6, double d10) {
        this.object = t6;
        this.score = d10;
    }

    public T get() {
        return this.object;
    }

    public double getScore() {
        return this.score;
    }
}
