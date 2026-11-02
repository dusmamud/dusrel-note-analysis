package com.google.android.gms.internal.consent_sdk;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f20759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1[] f20761c;

    public /* synthetic */ g0(String str, String str2, d1[] d1VarArr) {
        this.f20759a = str;
        this.f20760b = str2;
        this.f20761c = d1VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final JSONObject jSONObject;
        String str = this.f20759a;
        if (TextUtils.isEmpty(str)) {
            Log.d("UserMessagingPlatform", "Error on action: empty action name");
            return;
        }
        final String lowerCase = str.toLowerCase();
        String str2 = this.f20760b;
        if (TextUtils.isEmpty(str2)) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject(str2);
            } catch (JSONException unused) {
                Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: failed to parse args: " + str2);
                return;
            }
        }
        Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: " + jSONObject.toString());
        int i10 = 0;
        while (true) {
            d1[] d1VarArr = this.f20761c;
            if (i10 >= d1VarArr.length) {
                return;
            }
            final d1 d1Var = d1VarArr[i10];
            FutureTask futureTask = new FutureTask(new Callable() { // from class: com.google.android.gms.internal.consent_sdk.l
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(d1Var.a(lowerCase, jSONObject));
                }
            });
            d1Var.zza().execute(futureTask);
            try {
                if (((Boolean) futureTask.get()).booleanValue()) {
                    return;
                } else {
                    i10++;
                }
            } catch (InterruptedException e10) {
                Log.d("UserMessagingPlatform", "Thread interrupted for Action[" + lowerCase + "]: ", e10);
            } catch (ExecutionException e11) {
                Log.d("UserMessagingPlatform", j2.g.a("Failed to run Action[", lowerCase, "]: "), e11.getCause());
            }
        }
    }
}
