package com.google.firebase.platforminfo;

import sc.g;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    public static String detectVersion() {
        try {
            g.f34196b.getClass();
            return "2.2.20";
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
