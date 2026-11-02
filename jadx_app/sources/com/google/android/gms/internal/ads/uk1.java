package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class uk1 {
    public static int a(SQLiteDatabase sQLiteDatabase, int i10) {
        int i11 = 0;
        if (i10 == 2) {
            return 0;
        }
        Cursor cursorC = c(sQLiteDatabase, i10);
        if (cursorC.getCount() > 0) {
            cursorC.moveToNext();
            i11 = cursorC.getInt(cursorC.getColumnIndexOrThrow(com.amazon.a.a.o.b.Y));
        }
        cursorC.close();
        return i11;
    }

    public static void b(SQLiteDatabase sQLiteDatabase, long j10, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j10));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j10)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static Cursor c(SQLiteDatabase sQLiteDatabase, int i10) {
        String[] strArr = {com.amazon.a.a.o.b.Y};
        String[] strArr2 = new String[1];
        if (i10 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i10 == 1) {
            strArr2[0] = "total_requests";
        } else if (i10 != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    public static void d(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.amazon.a.a.o.b.Y, (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    public static void e(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put(com.amazon.a.a.o.b.Y, (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }
}
