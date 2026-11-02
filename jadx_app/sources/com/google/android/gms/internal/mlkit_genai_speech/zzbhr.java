package com.google.android.gms.internal.mlkit_genai_speech;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbhr {
    public static Boolean zza(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static Double zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    public static Integer zzc(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        Double d10 = (Double) obj;
        int iIntValue = d10.intValue();
        if (iIntValue == d10.doubleValue()) {
            return Integer.valueOf(iIntValue);
        }
        throw new ClassCastException("Number expected to be integer: ".concat(String.valueOf(d10)));
    }

    public static Long zzd(Map map, String str) {
        boolean z10;
        int iCharAt;
        String strZze = zze(map, str);
        if (strZze == null) {
            return null;
        }
        try {
            if (strZze.isEmpty() || strZze.charAt(strZze.length() - 1) != 's') {
                throw new ParseException("Invalid duration string: ".concat(strZze), 0);
            }
            if (strZze.charAt(0) == '-') {
                strZze = strZze.substring(1);
                z10 = true;
            } else {
                z10 = false;
            }
            String strSubstring = strZze.substring(0, strZze.length() - 1);
            String strSubstring2 = "";
            int iIndexOf = strSubstring.indexOf(46);
            if (iIndexOf != -1) {
                strSubstring2 = strSubstring.substring(iIndexOf + 1);
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            long j10 = Long.parseLong(strSubstring);
            if (strSubstring2.isEmpty()) {
                iCharAt = 0;
            } else {
                iCharAt = 0;
                for (int i10 = 0; i10 < 9; i10++) {
                    iCharAt *= 10;
                    if (i10 < strSubstring2.length()) {
                        if (strSubstring2.charAt(i10) < '0' || strSubstring2.charAt(i10) > '9') {
                            throw new ParseException("Invalid nanoseconds.", 0);
                        }
                        iCharAt = (strSubstring2.charAt(i10) - '0') + iCharAt;
                    }
                }
            }
            if (j10 < 0) {
                throw new ParseException("Invalid duration string: ".concat(strZze), 0);
            }
            if (z10) {
                j10 = -j10;
                iCharAt = -iCharAt;
            }
            if (iCharAt <= -1000000000 || iCharAt >= 1000000000) {
                try {
                    long j11 = iCharAt / 1000000000;
                    long j12 = j10 + j11;
                    if (!((j10 ^ j12) >= 0) && !((j11 ^ j10) < 0)) {
                        throw new ArithmeticException();
                    }
                    iCharAt %= 1000000000;
                    j10 = j12;
                } catch (IllegalArgumentException unused) {
                    throw new ParseException("Duration value is out of range.", 0);
                }
            }
            if (j10 > 0 && iCharAt < 0) {
                iCharAt += 1000000000;
                j10--;
            }
            if (j10 < 0 && iCharAt > 0) {
                iCharAt -= 1000000000;
                j10++;
            }
            if (j10 < -315576000000L || j10 > 315576000000L) {
                throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + j10 + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + iCharAt + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
            }
            long nanos = TimeUnit.SECONDS.toNanos(j10);
            long j13 = iCharAt;
            long j14 = nanos + j13;
            if (!(((nanos ^ j14) >= 0) | ((j13 ^ nanos) < 0))) {
                j14 = ((j14 >>> 63) ^ 1) + Long.MAX_VALUE;
            }
            return Long.valueOf(j14);
        } catch (ParseException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String zze(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static List zzf(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!(list.get(i10) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i10), Integer.valueOf(i10), list));
            }
        }
        return list;
    }

    public static List zzg(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List zzh(Map map, String str) {
        List listZzg = zzg(map, str);
        if (listZzg == null) {
            return null;
        }
        zzf(listZzg);
        return listZzg;
    }

    public static List zzi(Map map, String str) {
        List listZzg = zzg(map, str);
        if (listZzg == null) {
            return null;
        }
        for (int i10 = 0; i10 < listZzg.size(); i10++) {
            if (!(listZzg.get(i10) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", listZzg.get(i10), Integer.valueOf(i10), listZzg));
            }
        }
        return listZzg;
    }

    public static Map zzj(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }
}
