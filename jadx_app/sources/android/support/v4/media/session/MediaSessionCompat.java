package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionCompat {

    @SuppressLint({"BanParcelableUsage"})
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ResultReceiver f581a;

        public class a implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper[] newArray(int i10) {
                return new ResultReceiverWrapper[i10];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f581a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            this.f581a.writeToParcel(parcel, i10);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f582a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f584c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public r5.d f585d;

        public class a implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            public final Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Token[] newArray(int i10) {
                return new Token[i10];
            }
        }

        public Token(Object obj, b bVar) {
            this.f583b = obj;
            this.f584c = bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = ((Token) obj).f583b;
            Object obj3 = this.f583b;
            if (obj3 == null) {
                return obj2 == null;
            }
            if (obj2 == null) {
                return false;
            }
            return obj3.equals(obj2);
        }

        public final int hashCode() {
            Object obj = this.f583b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable((Parcelable) this.f583b, i10);
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static Bundle b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaDescriptionCompat f579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f580b;

        public class a implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            public final QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final QueueItem[] newArray(int i10) {
                return new QueueItem[i10];
            }
        }

        public static class b {
            public static MediaSession.QueueItem a(MediaDescription mediaDescription, long j10) {
                return new MediaSession.QueueItem(mediaDescription, j10);
            }

            public static MediaDescription b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            public static long c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j10 == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f579a = mediaDescriptionCompat;
            this.f580b = j10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MediaSession.QueueItem {Description=");
            sb2.append(this.f579a);
            sb2.append(", Id=");
            return e.a(sb2, this.f580b, " }");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            this.f579a.writeToParcel(parcel, i10);
            parcel.writeLong(this.f580b);
        }

        public QueueItem(Parcel parcel) {
            this.f579a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f580b = parcel.readLong();
        }
    }
}
