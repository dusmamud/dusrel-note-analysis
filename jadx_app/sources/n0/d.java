package n0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    public interface a {
    }

    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c[] f31485a;

        public b(c[] cVarArr) {
            this.f31485a = cVarArr;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f31487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f31488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f31489d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f31490e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f31491f;

        public c(int i10, int i11, int i12, String str, String str2, boolean z10) {
            this.f31486a = str;
            this.f31487b = i10;
            this.f31488c = z10;
            this.f31489d = str2;
            this.f31490e = i11;
            this.f31491f = i12;
        }
    }

    /* JADX INFO: renamed from: n0.d$d, reason: collision with other inner class name */
    public static final class C0208d implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f31492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f31493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f31494c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f31495d;

        public C0208d(ArrayList arrayList, int i10, int i11, String str) {
            this.f31492a = arrayList;
            this.f31494c = i10;
            this.f31493b = i11;
            this.f31495d = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x011b A[Catch: all -> 0x0157, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x011f A[Catch: all -> 0x0157, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x014c A[Catch: all -> 0x0157, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0150 A[Catch: all -> 0x0157, TRY_LEAVE, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    public static a a(XmlResourceParser xmlResourceParser, Resources resources) throws Exception {
        int next;
        int i10;
        int i11;
        ?? r10;
        long j10;
        Throwable th;
        ?? r11;
        ExecutorService executorService;
        boolean zIsTerminated;
        boolean zIsTerminated2;
        do {
            next = xmlResourceParser.next();
            i10 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            c(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), i0.a.f27787b);
        int i12 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i13 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), i0.a.f27788c);
                        int i14 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z10 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i15 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i16 = typedArrayObtainAttributes2.getInt(i15, 0);
                        int i17 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i17, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i17);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            c(xmlResourceParser);
                        }
                        arrayList.add(new c(i14, i16, resourceId2, string7, string6, z10));
                    } else {
                        c(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new b((c[]) arrayList.toArray(new c[0]));
        }
        List<List<byte[]>> listB = b(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i13) {
            if (xmlResourceParser.getEventType() == i10) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), i0.a.f27789d);
                    int i18 = integer;
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i12);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i10);
                        if (string8 == null) {
                            r10 = typedArrayObtainAttributes3;
                            j10 = 1;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != 3) {
                            try {
                                c(xmlResourceParser);
                            } catch (Throwable th2) {
                                th = th2;
                                r11 = typedArrayObtainAttributes3;
                                j10 = 1;
                            }
                        }
                        try {
                            r10 = typedArrayObtainAttributes3;
                            i11 = i18;
                            j10 = 1;
                            try {
                                t0.f fVar = new t0.f(string, string2, string8, listB, string9, string10);
                                if (r10 instanceof AutoCloseable) {
                                    ((AutoCloseable) r10).close();
                                } else if (r10 instanceof ExecutorService) {
                                    ExecutorService executorService2 = (ExecutorService) r10;
                                    if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService2.isTerminated())) {
                                        executorService2.shutdown();
                                        boolean z11 = false;
                                        while (!zIsTerminated2) {
                                            try {
                                                zIsTerminated2 = executorService2.awaitTermination(1L, TimeUnit.DAYS);
                                            } catch (InterruptedException unused) {
                                                if (!z11) {
                                                    executorService2.shutdownNow();
                                                    z11 = true;
                                                }
                                            }
                                        }
                                        if (z11) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r10.recycle();
                                }
                                arrayList2.add(fVar);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r10 = typedArrayObtainAttributes3;
                            j10 = 1;
                            th = th;
                            r11 = r10;
                            if (r11 != 0) {
                                throw th;
                            }
                            try {
                                if (!(r11 instanceof AutoCloseable)) {
                                    ((AutoCloseable) r11).close();
                                    throw th;
                                }
                                if (r11 instanceof ExecutorService) {
                                    r11.recycle();
                                    throw th;
                                }
                                executorService = (ExecutorService) r11;
                                if (executorService != ForkJoinPool.commonPool()) {
                                    throw th;
                                }
                                throw th;
                            } catch (Throwable th5) {
                                th.addSuppressed(th5);
                                throw th;
                            }
                        }
                        th = th3;
                    } catch (Throwable th6) {
                        th = th6;
                        r10 = typedArrayObtainAttributes3;
                    }
                    th = th;
                    r11 = r10;
                    if (r11 != 0) {
                        throw th;
                    }
                    if (!(r11 instanceof AutoCloseable)) {
                        ((AutoCloseable) r11).close();
                        throw th;
                    }
                    if (r11 instanceof ExecutorService) {
                        r11.recycle();
                        throw th;
                    }
                    executorService = (ExecutorService) r11;
                    if (executorService != ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                        throw th;
                    }
                    executorService.shutdown();
                    boolean z12 = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(j10, TimeUnit.DAYS);
                        } catch (InterruptedException unused2) {
                            if (!z12) {
                                executorService.shutdownNow();
                                z12 = true;
                            }
                        }
                    }
                    if (!z12) {
                        throw th;
                    }
                    Thread.currentThread().interrupt();
                    throw th;
                }
                i11 = integer;
                c(xmlResourceParser);
                integer = i11;
                string3 = string3;
                string4 = string4;
                i10 = 2;
                i12 = 0;
                i13 = 3;
            }
        }
        int i19 = integer;
        String str = string3;
        String str2 = string4;
        if (!arrayList2.isEmpty()) {
            return new C0208d(arrayList2, i19, integer2, string5);
        }
        if (str == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new t0.f(string, string2, str, listB, null, null));
        if (str2 != null) {
            arrayList2.add(new t0.f(string, string2, str2, listB, null, null));
        }
        return new C0208d(arrayList2, i19, integer2, string5);
    }

    public static List<List<byte[]>> b(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i10);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }
}
