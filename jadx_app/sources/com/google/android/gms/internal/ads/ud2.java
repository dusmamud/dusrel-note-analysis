package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes.dex */
public abstract class ud2 extends SQLiteOpenHelper {
    public ud2(Context context, String str, int i10) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, i10);
    }
}
