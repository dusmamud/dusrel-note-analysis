package f1;

import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26242a;

    public o0(FileNotFoundException fileNotFoundException) {
        super(fileNotFoundException);
        this.f26242a = "Encountered a [" + fileNotFoundException.getMessage() + "]. If you are trying to use DataStore during direct boot, this exception likely indicates that your DataStore file is not located in the Device Encrypted Storage and therefore is not available for write access during direct boot mode. DataStore to be used during direct boot must be initialized using `DataStoreFactory.createInDeviceProtectedStorage()`.";
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f26242a;
    }
}
