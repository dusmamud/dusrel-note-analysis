package biz.cunning.cunning_document_scanner.fallback;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lbiz/cunning/cunning_document_scanner/fallback/ImageNotReadyException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "cunning_document_scanner_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ImageNotReadyException extends Exception {
    public ImageNotReadyException() {
        super("The selected image could not be read. If it is stored in the cloud, wait for it to finish downloading and try again.");
    }
}
