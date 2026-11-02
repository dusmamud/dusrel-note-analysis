package com.google.android.gms.internal.ads;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sg2 implements androidx.concurrent.futures.f.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ug2 f15920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f15923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f15924e;

    public /* synthetic */ sg2(ug2 ug2Var, String str, boolean z10, String str2, byte[] bArr) {
        this.f15920a = ug2Var;
        this.f15921b = str;
        this.f15922c = z10;
        this.f15923d = str2;
        this.f15924e = bArr;
    }

    @Override // androidx.concurrent.futures.f.c
    public final /* synthetic */ Object a(final androidx.concurrent.futures.f.a aVar) {
        final ug2 ug2Var = this.f15920a;
        final String str = this.f15921b;
        final boolean z10 = this.f15922c;
        final String str2 = this.f15923d;
        final byte[] bArr = this.f15924e;
        ug2Var.f16969a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.rg2
            @Override // java.lang.Runnable
            public final void run() {
                HttpURLConnection httpURLConnection;
                byte[] byteArray;
                ug2 ug2Var2 = ug2Var;
                String str3 = str;
                androidx.concurrent.futures.f.a aVar2 = aVar;
                byte[] bArr2 = bArr;
                HttpURLConnection httpURLConnection2 = null;
                try {
                    try {
                        httpURLConnection = (HttpURLConnection) URI.create(str3).toURL().openConnection();
                        try {
                            Objects.requireNonNull(httpURLConnection);
                            nd1 nd1Var = new nd1(httpURLConnection, 1);
                            ExecutorService executorService = ug2Var2.f16969a;
                            androidx.concurrent.futures.j<Void> jVar = aVar2.f1258c;
                            if (jVar != null) {
                                jVar.addListener(nd1Var, executorService);
                            }
                            httpURLConnection.setRequestProperty("User-Agent", ug2Var2.f16970b);
                            int i10 = (int) ug2Var2.f16971c;
                            httpURLConnection.setConnectTimeout(i10);
                            httpURLConnection.setReadTimeout(i10);
                            if (z10) {
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setRequestMethod("POST");
                                String str4 = str2;
                                if (str4 != null) {
                                    httpURLConnection.setRequestProperty("Content-Type", str4);
                                }
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream.write(bArr2);
                                    bufferedOutputStream.close();
                                } catch (Throwable th) {
                                    try {
                                        bufferedOutputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                            int responseCode = httpURLConnection.getResponseCode();
                            InputStream inputStream = responseCode < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    if (inputStream == null) {
                                        byteArray = new byte[0];
                                        byteArrayOutputStream.close();
                                    } else {
                                        byte[] bArr3 = new byte[4096];
                                        while (true) {
                                            int i11 = inputStream.read(bArr3);
                                            if (i11 == -1) {
                                                break;
                                            } else {
                                                byteArrayOutputStream.write(bArr3, 0, i11);
                                            }
                                        }
                                        byteArray = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        inputStream.close();
                                    }
                                    aVar2.a(new tg2(byteArray, responseCode));
                                } catch (Throwable th3) {
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            } catch (Throwable th5) {
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable th6) {
                                        th5.addSuppressed(th6);
                                    }
                                }
                                throw th5;
                            }
                        } catch (SocketTimeoutException e10) {
                            e = e10;
                            httpURLConnection2 = httpURLConnection;
                            String message = e.getMessage();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 9);
                            sb2.append("Timeout: ");
                            sb2.append(message);
                            aVar2.b(new TimeoutException(sb2.toString()));
                            httpURLConnection = httpURLConnection2;
                        } catch (Throwable th7) {
                            th = th7;
                            httpURLConnection2 = httpURLConnection;
                            aVar2.b(th);
                            httpURLConnection = httpURLConnection2;
                        }
                    } catch (Throwable th8) {
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        throw th8;
                    }
                } catch (SocketTimeoutException e11) {
                    e = e11;
                } catch (Throwable th9) {
                    th = th9;
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        });
        return "";
    }
}
