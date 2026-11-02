package io.objectbox.model;

/* JADX INFO: loaded from: classes2.dex */
public final class HnswDistanceType {
    public static final short Cosine = 2;
    public static final short DotProduct = 3;
    public static final short DotProductNonNormalized = 10;
    public static final short Euclidean = 1;
    public static final short Geo = 6;
    public static final short Unknown = 0;
    public static final String[] names = {"Unknown", "Euclidean", "Cosine", "DotProduct", "", "", "Geo", "", "", "", "DotProductNonNormalized"};

    private HnswDistanceType() {
    }

    public static String name(int i10) {
        return names[i10];
    }
}
