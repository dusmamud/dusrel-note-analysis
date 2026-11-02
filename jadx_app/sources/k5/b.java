package k5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import kotlin.jvm.internal.j;
import l5.d;

/* JADX INFO: loaded from: classes.dex */
public interface b extends Closeable {

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29933a;

        public a(int i10) {
            this.f29933a = i10;
        }

        public static void a(String str) {
            if (str.equalsIgnoreCase(":memory:")) {
                return;
            }
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = j.f(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: ".concat(str));
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        public abstract void b(d dVar);

        public abstract void c(d dVar, int i10, int i11);

        public abstract void d(d dVar);

        public abstract void e(d dVar, int i10, int i11);
    }

    /* JADX INFO: renamed from: k5.b$b, reason: collision with other inner class name */
    public static final class C0195b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f29934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f29935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f29936c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f29937d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f29938e;

        public C0195b(Context context, String str, a callback, boolean z10, boolean z11) {
            j.e(context, "context");
            j.e(callback, "callback");
            this.f29934a = context;
            this.f29935b = str;
            this.f29936c = callback;
            this.f29937d = z10;
            this.f29938e = z11;
        }
    }

    public interface c {
        b a(C0195b c0195b);
    }

    k5.a C();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}
