package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static int a(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f2544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnimatorSet f2545b;

        public a(Animation animation) {
            this.f2544a = animation;
            this.f2545b = null;
        }

        public a(Animator animator) {
            this.f2544a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f2545b = animatorSet;
            animatorSet.play(animator);
        }
    }

    public static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewGroup f2546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f2547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2548c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2549d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2550e;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2550e = true;
            this.f2546a = viewGroup;
            this.f2547b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j10, Transformation transformation) {
            this.f2550e = true;
            if (this.f2548c) {
                return !this.f2549d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f2548c = true;
                w0.v.a(this.f2546a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10 = this.f2548c;
            ViewGroup viewGroup = this.f2546a;
            if (z10 || !this.f2550e) {
                viewGroup.endViewTransition(this.f2547b);
                this.f2549d = true;
            } else {
                this.f2550e = false;
                viewGroup.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f2550e = true;
            if (this.f2548c) {
                return !this.f2549d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f2548c = true;
                w0.v.a(this.f2546a, this);
            }
            return true;
        }
    }
}
