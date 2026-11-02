package io.objectbox.query;

/* JADX INFO: loaded from: classes2.dex */
public interface QueryCondition<T> {
    QueryCondition<T> and(QueryCondition<T> queryCondition);

    QueryCondition<T> or(QueryCondition<T> queryCondition);
}
