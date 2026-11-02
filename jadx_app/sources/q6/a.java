package q6;

import biz.cunning.cunning_document_scanner.fallback.DocumentScannerActivity;
import y4.z;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33290c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f33288a = i10;
        this.f33289b = obj;
        this.f33290c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33288a) {
            case 0:
                DocumentScannerActivity.cropDocumentAndFinishIntent$lambda$0$0((DocumentScannerActivity) this.f33289b, this.f33290c);
                return;
            default:
                Runnable runnable = (Runnable) this.f33289b;
                z zVar = (z) this.f33290c;
                try {
                    runnable.run();
                    return;
                } finally {
                    zVar.a();
                }
        }
    }
}
