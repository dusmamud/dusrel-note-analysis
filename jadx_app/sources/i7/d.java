package i7;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes.dex */
public final class d implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f28362a;

    public d(String str) {
        this.f28362a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File dir, String filename) {
        return filename.startsWith(this.f28362a);
    }
}
