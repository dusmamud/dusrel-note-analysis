package io.objectbox.internal;

import io.objectbox.annotation.apihint.Internal;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@Internal
public class ReflectionCache {
    private static final ReflectionCache instance = new ReflectionCache();
    private final Map<Class<?>, Map<String, Field>> fields = new HashMap();

    public static ReflectionCache getInstance() {
        return instance;
    }

    public synchronized Field getField(Class<?> cls, String str) {
        Field declaredField;
        try {
            Map<String, Field> map = this.fields.get(cls);
            if (map == null) {
                map = new HashMap<>();
                this.fields.put(cls, map);
            }
            declaredField = map.get(str);
            if (declaredField == null) {
                try {
                    declaredField = cls.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    map.put(str, declaredField);
                } catch (NoSuchFieldException e10) {
                    throw new IllegalStateException(e10);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return declaredField;
    }
}
