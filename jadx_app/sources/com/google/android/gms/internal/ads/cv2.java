package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class cv2 implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f8053a;

    public cv2(Pattern pattern) {
        pattern.getClass();
        this.f8053a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f8053a.matcher(str).matches();
    }
}
