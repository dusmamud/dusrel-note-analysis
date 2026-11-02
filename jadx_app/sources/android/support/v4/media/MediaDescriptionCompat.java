package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bitmap f565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri f568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaDescription f569i;

    public class a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    public static class b {
        public static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        public static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        public static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        public static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        public static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        public static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        public static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        public static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        public static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        public static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        public static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        public static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        public static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    public static class c {
        public static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        public static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f561a = str;
        this.f562b = charSequence;
        this.f563c = charSequence2;
        this.f564d = charSequence3;
        this.f565e = bitmap;
        this.f566f = uri;
        this.f567g = bundle;
        this.f568h = uri2;
    }

    public static MediaDescriptionCompat a(Object obj) {
        Bundle bundle;
        if (obj == null) {
            return null;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        String strG = b.g(mediaDescription);
        CharSequence charSequenceI = b.i(mediaDescription);
        CharSequence charSequenceH = b.h(mediaDescription);
        CharSequence charSequenceC = b.c(mediaDescription);
        Bitmap bitmapE = b.e(mediaDescription);
        Uri uriF = b.f(mediaDescription);
        Bundle bundleD = b.d(mediaDescription);
        if (bundleD != null) {
            bundleD = MediaSessionCompat.b(bundleD);
        }
        Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uriA == null) {
            bundle = bundleD;
        } else if (bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleD.size() == 2) {
            bundle = null;
        } else {
            bundleD.remove("android.support.v4.media.description.MEDIA_URI");
            bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleD;
        }
        if (uriA == null) {
            uriA = c.a(mediaDescription);
        }
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
        mediaDescriptionCompat.f569i = mediaDescription;
        return mediaDescriptionCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f562b) + ", " + ((Object) this.f563c) + ", " + ((Object) this.f564d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        MediaDescription mediaDescriptionA = this.f569i;
        if (mediaDescriptionA == null) {
            MediaDescription.Builder builderB = b.b();
            b.n(builderB, this.f561a);
            b.p(builderB, this.f562b);
            b.o(builderB, this.f563c);
            b.j(builderB, this.f564d);
            b.l(builderB, this.f565e);
            b.m(builderB, this.f566f);
            b.k(builderB, this.f567g);
            c.b(builderB, this.f568h);
            mediaDescriptionA = b.a(builderB);
            this.f569i = mediaDescriptionA;
        }
        mediaDescriptionA.writeToParcel(parcel, i10);
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.f561a = parcel.readString();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f562b = (CharSequence) creator.createFromParcel(parcel);
        this.f563c = (CharSequence) creator.createFromParcel(parcel);
        this.f564d = (CharSequence) creator.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f565e = (Bitmap) parcel.readParcelable(classLoader);
        this.f566f = (Uri) parcel.readParcelable(classLoader);
        this.f567g = parcel.readBundle(classLoader);
        this.f568h = (Uri) parcel.readParcelable(classLoader);
    }
}
