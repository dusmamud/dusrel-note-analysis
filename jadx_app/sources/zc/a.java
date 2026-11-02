package zc;

import java.lang.reflect.Method;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: zc.a$a, reason: collision with other inner class name */
    public static final class C0321a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Method f37725a;

        static {
            Method method;
            Method[] methods = Throwable.class.getMethods();
            j.b(methods);
            int length = methods.length;
            int i10 = 0;
            while (true) {
                method = null;
                if (i10 >= length) {
                    break;
                }
                Method method2 = methods[i10];
                if (j.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    j.d(parameterTypes, "getParameterTypes(...)");
                    if (j.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                        method = method2;
                        break;
                    }
                }
                i10++;
            }
            f37725a = method;
            int length2 = methods.length;
            for (int i11 = 0; i11 < length2 && !j.a(methods[i11].getName(), "getSuppressed"); i11++) {
            }
        }
    }

    public void a(Throwable cause, Throwable exception) {
        j.e(cause, "cause");
        j.e(exception, "exception");
        Method method = C0321a.f37725a;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }
}
