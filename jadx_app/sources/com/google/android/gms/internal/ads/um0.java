package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class um0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JsPromptResult f17122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f17123b;

    public um0(JsPromptResult jsPromptResult, EditText editText) {
        this.f17122a = jsPromptResult;
        this.f17123b = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f17122a.confirm(this.f17123b.getText().toString());
    }
}
