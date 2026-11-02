package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.ki;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class ViewUtils {
    private ViewUtils() {
    }

    @KeepForSdk
    public static String getXmlAttributeString(String str, String str2, Context context, AttributeSet attributeSet, boolean z10, boolean z11, String str3) {
        String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue != null && attributeValue.startsWith("@string/") && z10) {
            String strSubstring = attributeValue.substring(8);
            String packageName = context.getPackageName();
            TypedValue typedValue = new TypedValue();
            try {
                Resources resources = context.getResources();
                StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 8 + String.valueOf(strSubstring).length());
                sb2.append(packageName);
                sb2.append(":string/");
                sb2.append(strSubstring);
                resources.getValue(sb2.toString(), typedValue, true);
            } catch (Resources.NotFoundException unused) {
                Log.w(str3, ki.c(new StringBuilder(String.valueOf(str2).length() + 30 + attributeValue.length()), "Could not find resource for ", str2, ": ", attributeValue));
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                attributeValue = charSequence.toString();
            } else {
                String string = typedValue.toString();
                Log.w(str3, ki.c(new StringBuilder(String.valueOf(str2).length() + 28 + string.length()), "Resource ", str2, " was not a string: ", string));
            }
        }
        if (z11 && attributeValue == null) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 33);
            sb3.append("Required XML attribute \"");
            sb3.append(str2);
            sb3.append("\" missing");
            Log.w(str3, sb3.toString());
        }
        return attributeValue;
    }
}
