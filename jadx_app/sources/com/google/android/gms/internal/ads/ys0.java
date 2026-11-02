package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ys0 implements hs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeviceTierManager f19827a;

    public ys0(DeviceTierManager deviceTierManager) {
        this.f19827a = deviceTierManager;
    }

    @Override // com.google.android.gms.internal.ads.hs0
    public final void a(JSONObject jSONObject) {
        DeviceTierManager.AdvertisedMemoryTier advertisedMemoryTierFromValue;
        DeviceTierManager.AvailableProcessorTier availableProcessorTierFromValue;
        DeviceTierManager.AvailableMemoryTier availableMemoryTierFromValue;
        boolean zHas = jSONObject.has("AvailableMemoryTier");
        DeviceTierManager deviceTierManager = this.f19827a;
        if (zHas && (availableMemoryTierFromValue = DeviceTierManager.AvailableMemoryTier.fromValue(jSONObject.optInt("AvailableMemoryTier", -1))) != null) {
            deviceTierManager.setAvailableMemoryTier(availableMemoryTierFromValue);
        }
        if (jSONObject.has("AvailableProcessorTier") && (availableProcessorTierFromValue = DeviceTierManager.AvailableProcessorTier.fromValue(jSONObject.optInt("AvailableProcessorTier", -1))) != null) {
            deviceTierManager.setAvailableProcessorTier(availableProcessorTierFromValue);
        }
        if (!jSONObject.has("AdvertisedMemoryTier") || (advertisedMemoryTierFromValue = DeviceTierManager.AdvertisedMemoryTier.fromValue(jSONObject.optInt("AdvertisedMemoryTier", -1))) == null) {
            return;
        }
        deviceTierManager.setAdvertisedMemoryTier(advertisedMemoryTierFromValue);
    }
}
