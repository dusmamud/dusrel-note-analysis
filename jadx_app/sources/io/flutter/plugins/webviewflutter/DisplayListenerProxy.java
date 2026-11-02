package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
class DisplayListenerProxy {
    private static final String TAG = "DisplayListenerProxy";
    private ArrayList<DisplayManager.DisplayListener> listenersBeforeWebView;

    @SuppressLint({"SoonBlockedPrivateApi"})
    private static ArrayList<DisplayManager.DisplayListener> yoinkDisplayListeners(DisplayManager displayManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new ArrayList<>();
        }
        try {
            Field declaredField = DisplayManager.class.getDeclaredField("mGlobal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(displayManager);
            Field declaredField2 = obj.getClass().getDeclaredField("mDisplayListeners");
            declaredField2.setAccessible(true);
            ArrayList arrayList = (ArrayList) declaredField2.get(obj);
            ArrayList<DisplayManager.DisplayListener> arrayList2 = new ArrayList<>();
            int size = arrayList.size();
            Field field = null;
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                if (field == null) {
                    field = obj2.getClass().getField("mListener");
                    field.setAccessible(true);
                }
                arrayList2.add((DisplayManager.DisplayListener) field.get(obj2));
            }
            return arrayList2;
        } catch (IllegalAccessException | NoSuchFieldException e10) {
            Log.w(TAG, "Could not extract WebView's display listeners. " + e10);
            return new ArrayList<>();
        }
    }

    public void onPostWebViewInitialization(final DisplayManager displayManager) {
        final ArrayList<DisplayManager.DisplayListener> arrayListYoinkDisplayListeners = yoinkDisplayListeners(displayManager);
        arrayListYoinkDisplayListeners.removeAll(this.listenersBeforeWebView);
        if (arrayListYoinkDisplayListeners.isEmpty()) {
            return;
        }
        int size = arrayListYoinkDisplayListeners.size();
        int i10 = 0;
        while (i10 < size) {
            DisplayManager.DisplayListener displayListener = arrayListYoinkDisplayListeners.get(i10);
            i10++;
            displayManager.unregisterDisplayListener(displayListener);
            displayManager.registerDisplayListener(new DisplayManager.DisplayListener() { // from class: io.flutter.plugins.webviewflutter.DisplayListenerProxy.1
                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayAdded(int i11) {
                    ArrayList arrayList = arrayListYoinkDisplayListeners;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        ((DisplayManager.DisplayListener) obj).onDisplayAdded(i11);
                    }
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayChanged(int i11) {
                    if (displayManager.getDisplay(i11) == null) {
                        return;
                    }
                    ArrayList arrayList = arrayListYoinkDisplayListeners;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        ((DisplayManager.DisplayListener) obj).onDisplayChanged(i11);
                    }
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayRemoved(int i11) {
                    ArrayList arrayList = arrayListYoinkDisplayListeners;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        ((DisplayManager.DisplayListener) obj).onDisplayRemoved(i11);
                    }
                }
            }, null);
        }
    }

    public void onPreWebViewInitialization(DisplayManager displayManager) {
        this.listenersBeforeWebView = yoinkDisplayListeners(displayManager);
    }
}
