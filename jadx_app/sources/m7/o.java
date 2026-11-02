package m7;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public enum o {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);

    private static final SparseArray<o> valueMap;
    private final int value;

    static {
        o oVar = DEFAULT;
        o oVar2 = UNMETERED_ONLY;
        o oVar3 = UNMETERED_OR_DAILY;
        o oVar4 = FAST_IF_RADIO_AWAKE;
        o oVar5 = NEVER;
        o oVar6 = UNRECOGNIZED;
        SparseArray<o> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, oVar);
        sparseArray.put(1, oVar2);
        sparseArray.put(2, oVar3);
        sparseArray.put(3, oVar4);
        sparseArray.put(4, oVar5);
        sparseArray.put(-1, oVar6);
    }

    o(int i10) {
        this.value = i10;
    }
}
