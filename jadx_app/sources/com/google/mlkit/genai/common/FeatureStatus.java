package com.google.mlkit.genai.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.TYPE_USE, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
public @interface FeatureStatus {
    public static final int AVAILABLE = 3;
    public static final int DOWNLOADABLE = 1;
    public static final int DOWNLOADING = 2;
    public static final int UNAVAILABLE = 0;
}
