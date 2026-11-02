package k1;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static c b(Context context, Uri uri) {
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        if (DocumentsContract.isDocumentUri(context, uri)) {
            treeDocumentId = DocumentsContract.getDocumentId(uri);
        }
        return new c(context, DocumentsContract.buildDocumentUriUsingTree(uri, treeDocumentId));
    }

    public abstract a a(String str, String str2);

    public abstract Uri c();
}
