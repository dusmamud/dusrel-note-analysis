package androidx.preference.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.preference.i;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class PreferenceImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3131b;

    public PreferenceImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.f3131b;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.f3130a;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i10);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i10 = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i11);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i11 = View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i10) {
        this.f3131b = i10;
        super.setMaxHeight(i10);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i10) {
        this.f3130a = i10;
        super.setMaxWidth(i10);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3130a = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f3131b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f3126j, i10, 0);
        setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, Api.BaseClientBuilder.API_PRIORITY_OTHER));
        setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Api.BaseClientBuilder.API_PRIORITY_OTHER));
        typedArrayObtainStyledAttributes.recycle();
    }
}
