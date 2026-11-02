package biz.cunning.cunning_document_scanner.fallback.models;

import android.graphics.PointF;
import kotlin.Metadata;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lbiz/cunning/cunning_document_scanner/fallback/models/Line;", "", "fromPoint", "Landroid/graphics/PointF;", "toPoint", "<init>", "(Landroid/graphics/PointF;Landroid/graphics/PointF;)V", "from", "getFrom", "()Landroid/graphics/PointF;", "to", "getTo", "cunning_document_scanner_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Line {
    private final PointF from;
    private final PointF to;

    public Line(PointF fromPoint, PointF toPoint) {
        j.e(fromPoint, "fromPoint");
        j.e(toPoint, "toPoint");
        this.from = fromPoint;
        this.to = toPoint;
    }

    public final PointF getFrom() {
        return this.from;
    }

    public final PointF getTo() {
        return this.to;
    }
}
