package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class fk1 extends ud2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk1(Context context) {
        super(context, "OfflineUpload.db", 1);
        int i10 = vd2.f17978a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_signal_contents (timestamp INTEGER PRIMARY_KEY, serialized_proto_data BLOB)");
        sQLiteDatabase.execSQL("CREATE TABLE offline_signal_statistics (statistic_name TEXT PRIMARY_KEY, value INTEGER)");
        uk1.e(sQLiteDatabase, "failed_requests");
        uk1.e(sQLiteDatabase, "total_requests");
        uk1.e(sQLiteDatabase, "completed_requests");
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", "last_successful_request_time");
        contentValues.put(com.amazon.a.a.o.b.Y, (Long) 0L);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        onUpgrade(sQLiteDatabase, i10, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_signal_contents");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_signal_statistics");
    }
}
