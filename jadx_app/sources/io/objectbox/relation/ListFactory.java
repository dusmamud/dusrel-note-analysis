package io.objectbox.relation;

import io.objectbox.annotation.apihint.Experimental;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
@Experimental
public interface ListFactory extends Serializable {

    public static class ArrayListFactory implements ListFactory {
        private static final long serialVersionUID = 8247662514375611729L;

        @Override // io.objectbox.relation.ListFactory
        public <T> List<T> createList() {
            return new ArrayList();
        }
    }

    public static class CopyOnWriteArrayListFactory implements ListFactory {
        private static final long serialVersionUID = 1888039726372206411L;

        @Override // io.objectbox.relation.ListFactory
        public <T> List<T> createList() {
            return new CopyOnWriteArrayList();
        }
    }

    <T> List<T> createList();
}
