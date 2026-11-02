package n1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class g implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f31541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f31542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31543c = true;

    public static class a extends androidx.emoji2.text.d.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f31544a;

        public a(EditText editText) {
            this.f31544a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.d.e
        public final void b() {
            g.a((EditText) this.f31544a.get(), 1);
        }
    }

    public g(EditText editText) {
        this.f31541a = editText;
    }

    public static void a(EditText editText, int i10) {
        int length;
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.d dVarA = androidx.emoji2.text.d.a();
            if (editableText == null) {
                length = 0;
            } else {
                dVarA.getClass();
                length = editableText.length();
            }
            dVarA.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        EditText editText = this.f31541a;
        if (editText.isInEditMode() || !this.f31543c || androidx.emoji2.text.d.f2244j == null || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = androidx.emoji2.text.d.a().b();
        if (iB != 0) {
            if (iB == 1) {
                androidx.emoji2.text.d.a().e((Spannable) charSequence, i10, i12 + i10);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        androidx.emoji2.text.d dVarA = androidx.emoji2.text.d.a();
        if (this.f31542b == null) {
            this.f31542b = new a(editText);
        }
        dVarA.f(this.f31542b);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
