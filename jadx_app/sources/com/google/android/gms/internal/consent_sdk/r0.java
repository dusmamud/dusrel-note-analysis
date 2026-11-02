package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f20983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f20984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f20985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20987h;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static r0 a(JsonReader jsonReader) throws IOException {
        int i10;
        r0 r0Var = new r0();
        r0Var.f20986g = 1;
        List list = Collections.EMPTY_LIST;
        r0Var.f20983d = list;
        r0Var.f20984e = list;
        r0Var.f20987h = 1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int i11 = 3;
            switch (strNextName.hashCode()) {
                case -2001388947:
                    if (strNextName.equals("consent_signal")) {
                        String strNextString = jsonReader.nextString();
                        switch (strNextString.hashCode()) {
                            case -2058725357:
                                if (!strNextString.equals("CONSENT_SIGNAL_COLLECT_CONSENT")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i11 = 5;
                                r0Var.f20986g = i11;
                                break;
                                break;
                            case -1969035850:
                                if (!strNextString.equals("CONSENT_SIGNAL_ERROR")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i11 = 7;
                                r0Var.f20986g = i11;
                                break;
                                break;
                            case -1263695752:
                                if (!strNextString.equals("CONSENT_SIGNAL_UNKNOWN")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i11 = 1;
                                r0Var.f20986g = i11;
                                break;
                                break;
                            case -954325659:
                                if (!strNextString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                r0Var.f20986g = i11;
                                break;
                            case -918677260:
                                if (!strNextString.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i11 = 8;
                                r0Var.f20986g = i11;
                                break;
                                break;
                            case 429411856:
                                if (!strNextString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i11 = 4;
                                r0Var.f20986g = i11;
                                break;
                                break;
                            case 467888915:
                                if (!strNextString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i11 = 2;
                                r0Var.f20986g = i11;
                                break;
                                break;
                            case 1725474845:
                                if (!strNextString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i11 = 6;
                                r0Var.f20986g = i11;
                                break;
                                break;
                            default:
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1938755376:
                    if (strNextName.equals("error_message")) {
                        r0Var.f20982c = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1851537225:
                    if (strNextName.equals("consent_form_base_url")) {
                        r0Var.f20981b = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1734348803:
                    if (strNextName.equals("client_side_pingback_url")) {
                        r0Var.f20985f = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1324537865:
                    if (strNextName.equals("privacy_options_required")) {
                        String strNextString2 = jsonReader.nextString();
                        int iHashCode = strNextString2.hashCode();
                        if (iHashCode == -1888946261) {
                            if (!strNextString2.equals("NOT_REQUIRED")) {
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                            }
                            r0Var.f20987h = i11;
                        } else if (iHashCode != 389487519) {
                            if (iHashCode != 433141802 || !strNextString2.equals("UNKNOWN")) {
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                            }
                            i11 = 1;
                            r0Var.f20987h = i11;
                        } else {
                            if (!strNextString2.equals("REQUIRED")) {
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                            }
                            i11 = 2;
                            r0Var.f20987h = i11;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1161803523:
                    if (strNextName.equals("actions")) {
                        r0Var.f20984e = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            q0 q0Var = new q0();
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String strNextName2 = jsonReader.nextName();
                                int iHashCode2 = strNextName2.hashCode();
                                if (iHashCode2 != -2105551094) {
                                    if (iHashCode2 == 1583758243 && strNextName2.equals("action_type")) {
                                        String strNextString3 = jsonReader.nextString();
                                        int iHashCode3 = strNextString3.hashCode();
                                        if (iHashCode3 != 64208429) {
                                            if (iHashCode3 != 82862015) {
                                                if (iHashCode3 != 1856333582 || !strNextString3.equals("UNKNOWN_ACTION_TYPE")) {
                                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                                }
                                                i10 = 1;
                                                q0Var.f20958b = i10;
                                            } else {
                                                if (!strNextString3.equals("WRITE")) {
                                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                                }
                                                i10 = 2;
                                                q0Var.f20958b = i10;
                                            }
                                        } else {
                                            if (!strNextString3.equals("CLEAR")) {
                                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                            }
                                            i10 = 3;
                                            q0Var.f20958b = i10;
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                } else if (strNextName2.equals("args_json")) {
                                    q0Var.f20957a = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            r0Var.f20984e.add(q0Var);
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -986806987:
                    if (strNextName.equals("request_info_keys")) {
                        r0Var.f20983d = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            r0Var.f20983d.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -790907624:
                    if (strNextName.equals("consent_form_payload")) {
                        r0Var.f20980a = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return r0Var;
    }
}
