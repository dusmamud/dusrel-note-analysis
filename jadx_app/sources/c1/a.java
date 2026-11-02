package c1;

import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import j2.j;
import q.e0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Cursor f4355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0071a f4357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f4358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c1.b f4359g;

    /* JADX INFO: renamed from: c1.a$a, reason: collision with other inner class name */
    public class C0071a extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e0 f4360a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0071a(e0 e0Var) {
            super(new Handler());
            this.f4360a = e0Var;
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z10) {
            Cursor cursor;
            e0 e0Var = this.f4360a;
            if (!e0Var.f4354b || (cursor = e0Var.f4355c) == null || cursor.isClosed()) {
                return;
            }
            e0Var.f4353a = e0Var.f4355c.requery();
        }
    }

    public class b extends DataSetObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e0 f4361a;

        public b(e0 e0Var) {
            this.f4361a = e0Var;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            e0 e0Var = this.f4361a;
            e0Var.f4353a = true;
            e0Var.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            e0 e0Var = this.f4361a;
            e0Var.f4353a = false;
            e0Var.notifyDataSetInvalidated();
        }
    }

    public abstract void b(View view, Cursor cursor);

    public void c(Cursor cursor) {
        Cursor cursor2 = this.f4355c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0071a c0071a = this.f4357e;
                if (c0071a != null) {
                    cursor2.unregisterContentObserver(c0071a);
                }
                b bVar = this.f4358f;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f4355c = cursor;
            if (cursor != null) {
                C0071a c0071a2 = this.f4357e;
                if (c0071a2 != null) {
                    cursor.registerContentObserver(c0071a2);
                }
                b bVar2 = this.f4358f;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f4356d = cursor.getColumnIndexOrThrow("_id");
                this.f4353a = true;
                notifyDataSetChanged();
            } else {
                this.f4356d = -1;
                this.f4353a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String d(Cursor cursor);

    public abstract View e(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f4353a || (cursor = this.f4355c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f4353a) {
            return null;
        }
        this.f4355c.moveToPosition(i10);
        if (view == null) {
            c cVar = (c) this;
            view = cVar.f4365j.inflate(cVar.f4364i, viewGroup, false);
        }
        b(view, this.f4355c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f4359g == null) {
            c1.b bVar = new c1.b();
            bVar.f4362a = this;
            this.f4359g = bVar;
        }
        return this.f4359g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        Cursor cursor;
        if (!this.f4353a || (cursor = this.f4355c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f4355c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        Cursor cursor;
        if (this.f4353a && (cursor = this.f4355c) != null && cursor.moveToPosition(i10)) {
            return this.f4355c.getLong(this.f4356d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f4353a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f4355c.moveToPosition(i10)) {
            throw new IllegalStateException(j.a(i10, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = e(viewGroup);
        }
        b(view, this.f4355c);
        return view;
    }
}
