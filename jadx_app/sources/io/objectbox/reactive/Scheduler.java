package io.objectbox.reactive;

/* JADX INFO: loaded from: classes2.dex */
public interface Scheduler {
    <T> void run(RunWithParam<T> runWithParam, T t6);
}
