package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class x {
    public static String a(g gVar) {
        String string = gVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
