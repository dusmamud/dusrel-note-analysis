package m8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f31383a = new d();

    public static boolean a(Context context) {
        String strEncodeToString;
        d dVar = f31383a;
        try {
            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                dVar.a("Play Store package is disabled.");
                return false;
            }
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    dVar.a("Play Store package is not signed -- possibly self-built package. Could not verify.");
                    return false;
                }
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(byteArray);
                        strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        strEncodeToString = "";
                    }
                    arrayList.add(strEncodeToString);
                    if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                        return true;
                    }
                    String str = Build.TAGS;
                    if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                        return true;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb2.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        }
                        sb2.append((CharSequence) ", ");
                    }
                }
                dVar.a("Play Store package certs are not valid. Found these sha256 certs: [" + sb2.toString() + "].");
                return false;
            } catch (PackageManager.NameNotFoundException unused2) {
                dVar.a("Play Store package is not found.");
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            dVar.a("Play Store package is not found.");
        }
    }
}
