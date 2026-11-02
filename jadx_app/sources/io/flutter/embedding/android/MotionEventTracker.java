package io.flutter.embedding.android;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class MotionEventTracker {
    private static MotionEventTracker INSTANCE = null;
    private static final String TAG = "MotionEventTracker";
    private final LongSparseArray<MotionEvent> eventById = new LongSparseArray<>();
    private final PriorityQueue<Long> unusedEvents = new PriorityQueue<>();

    public static class MotionEventId {
        private static final AtomicLong ID_COUNTER = new AtomicLong(0);

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final long f28467id;

        private MotionEventId(long j10) {
            this.f28467id = j10;
        }

        public static MotionEventId createUnique() {
            return from(ID_COUNTER.incrementAndGet());
        }

        public static MotionEventId from(long j10) {
            return new MotionEventId(j10);
        }

        public long getId() {
            return this.f28467id;
        }
    }

    private MotionEventTracker() {
    }

    public static MotionEventTracker getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MotionEventTracker();
        }
        return INSTANCE;
    }

    public MotionEvent pop(MotionEventId motionEventId) {
        while (!this.unusedEvents.isEmpty() && this.unusedEvents.peek().longValue() < motionEventId.f28467id) {
            this.eventById.remove(this.unusedEvents.poll().longValue());
        }
        if (!this.unusedEvents.isEmpty() && this.unusedEvents.peek().longValue() == motionEventId.f28467id) {
            this.unusedEvents.poll();
        }
        MotionEvent motionEvent = this.eventById.get(motionEventId.f28467id);
        this.eventById.remove(motionEventId.f28467id);
        return motionEvent;
    }

    public MotionEventId track(MotionEvent motionEvent) {
        MotionEventId motionEventIdCreateUnique = MotionEventId.createUnique();
        this.eventById.put(motionEventIdCreateUnique.f28467id, MotionEvent.obtain(motionEvent));
        this.unusedEvents.add(Long.valueOf(motionEventIdCreateUnique.f28467id));
        return motionEventIdCreateUnique;
    }
}
