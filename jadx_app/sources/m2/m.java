package m2;

import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f31125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f31126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f31127c;

    public m(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f31125a = arrayList;
        this.f31126b = arrayList2;
        this.f31127c = arrayList3;
    }

    public final String a(long j10, int i10, String str, long j11) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f31126b;
            int size = arrayList.size();
            ArrayList arrayList2 = this.f31125a;
            if (i11 >= size) {
                sb2.append((String) arrayList2.get(arrayList.size()));
                return sb2.toString();
            }
            sb2.append((String) arrayList2.get(i11));
            if (((Integer) arrayList.get(i11)).intValue() == 1) {
                sb2.append(str);
            } else {
                int iIntValue = ((Integer) arrayList.get(i11)).intValue();
                ArrayList arrayList3 = this.f31127c;
                if (iIntValue == 2) {
                    sb2.append(String.format(Locale.US, (String) arrayList3.get(i11), Long.valueOf(j10)));
                } else if (((Integer) arrayList.get(i11)).intValue() == 3) {
                    sb2.append(String.format(Locale.US, (String) arrayList3.get(i11), Integer.valueOf(i10)));
                } else if (((Integer) arrayList.get(i11)).intValue() == 4) {
                    sb2.append(String.format(Locale.US, (String) arrayList3.get(i11), Long.valueOf(j11)));
                }
            }
            i11++;
        }
    }
}
