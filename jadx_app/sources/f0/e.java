package f0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<a> f26128b = new SparseArray<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<b> f26130b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f26131c;

        public a(Context context, XmlResourceParser xmlResourceParser) {
            this.f26131c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), d.B);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f26129a = typedArrayObtainStyledAttributes.getResourceId(index, this.f26129a);
                } else if (index == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f26131c);
                    this.f26131c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f26132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f26133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f26134c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f26135d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f26136e;

        public b(Context context, XmlResourceParser xmlResourceParser) {
            this.f26132a = Float.NaN;
            this.f26133b = Float.NaN;
            this.f26134c = Float.NaN;
            this.f26135d = Float.NaN;
            this.f26136e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), d.F);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f26136e);
                    this.f26136e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                } else if (index == 1) {
                    this.f26135d = typedArrayObtainStyledAttributes.getDimension(index, this.f26135d);
                } else if (index == 2) {
                    this.f26133b = typedArrayObtainStyledAttributes.getDimension(index, this.f26133b);
                } else if (index == 3) {
                    this.f26134c = typedArrayObtainStyledAttributes.getDimension(index, this.f26134c);
                } else if (index == 4) {
                    this.f26132a = typedArrayObtainStyledAttributes.getDimension(index, this.f26132a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final boolean a(float f10, float f11) {
            float f12 = this.f26132a;
            if (!Float.isNaN(f12) && f10 < f12) {
                return false;
            }
            float f13 = this.f26133b;
            if (!Float.isNaN(f13) && f11 < f13) {
                return false;
            }
            float f14 = this.f26134c;
            if (!Float.isNaN(f14) && f10 > f14) {
                return false;
            }
            float f15 = this.f26135d;
            return Float.isNaN(f15) || f11 <= f15;
        }
    }

    public e(Context context, XmlResourceParser xmlResourceParser) {
        this.f26127a = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), d.C);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f26127a = typedArrayObtainStyledAttributes.getResourceId(index, this.f26127a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                aVar = new a(context, xmlResourceParser);
                                this.f26128b.put(aVar.f26129a, aVar);
                            }
                            break;
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b bVar = new b(context, xmlResourceParser);
                                if (aVar != null) {
                                    aVar.f26130b.add(bVar);
                                }
                            }
                            break;
                    }
                } else if (eventType == 3 && "StateSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e10) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    public final int a(int i10) {
        float f10 = -1;
        int i11 = 0;
        SparseArray<a> sparseArray = this.f26128b;
        if (-1 == i10) {
            a aVarValueAt = i10 == -1 ? sparseArray.valueAt(0) : sparseArray.get(-1);
            if (aVarValueAt != null) {
                ArrayList<b> arrayList = aVarValueAt.f26130b;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        i11 = -1;
                        break;
                    }
                    if (arrayList.get(i11).a(f10, f10)) {
                        break;
                    }
                    i11++;
                }
                if (-1 != i11) {
                    return i11 == -1 ? aVarValueAt.f26131c : arrayList.get(i11).f26136e;
                }
            }
        } else {
            a aVar = sparseArray.get(i10);
            if (aVar != null) {
                ArrayList<b> arrayList2 = aVar.f26130b;
                while (i11 < arrayList2.size()) {
                    if (arrayList2.get(i11).a(f10, f10)) {
                        return i11 == -1 ? aVar.f26131c : arrayList2.get(i11).f26136e;
                    }
                    i11++;
                }
                i11 = -1;
                if (i11 == -1) {
                }
            }
        }
        return -1;
    }
}
