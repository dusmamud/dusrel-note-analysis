package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13630c;

    public o22(int i10, int i11, boolean z10) {
        this.f13628a = i10;
        this.f13629b = i11;
        this.f13630c = z10;
    }

    public static ArrayList a(JsonReader jsonReader) throws IllegalStateException, IOException, NumberFormatException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int iNextInt = 0;
            int iNextInt2 = 0;
            boolean zNextBoolean = false;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if ("width".equals(strNextName)) {
                    iNextInt = jsonReader.nextInt();
                } else if ("height".equals(strNextName)) {
                    iNextInt2 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(strNextName)) {
                    zNextBoolean = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new o22(iNextInt, iNextInt2, zNextBoolean));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
