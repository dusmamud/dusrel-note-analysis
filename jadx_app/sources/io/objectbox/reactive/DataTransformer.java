package io.objectbox.reactive;

/* JADX INFO: loaded from: classes2.dex */
public interface DataTransformer<FROM, TO> {
    TO transform(FROM from) throws Exception;
}
