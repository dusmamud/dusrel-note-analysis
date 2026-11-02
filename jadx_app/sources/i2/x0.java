package i2;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.auth.FirebaseAuthHostApi;
import io.flutter.plugins.googlesignin.Messages;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x0 implements e2.k.a, BasicMessageChannel.MessageHandler, MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28193b;

    public /* synthetic */ x0(j2.b.a aVar, g gVar) {
        this.f28192a = 3;
        this.f28193b = gVar;
    }

    @Override // e2.k.a
    public void invoke(Object obj) {
        switch (this.f28192a) {
            case 0:
                ((b2.z.b) obj).a((b2.l0) this.f28193b);
                break;
            default:
                ((j2.b) obj).b((g) this.f28193b);
                break;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.f28192a) {
            case 1:
                FirebaseAuthHostApi.Companion.setUp$lambda$15$0((FirebaseAuthHostApi) this.f28193b, obj, reply);
                break;
            default:
                Messages.GoogleSignInApi.lambda$setUp$1((Messages.GoogleSignInApi) this.f28193b, obj, reply);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r3.equals("glassStarting") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e1, code lost:
    
        if (r3.equals("glassStarted") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e4, code lost:
    
        r8 = kotlin.jvm.internal.j.a(r8.method, "glassStarting");
        new java.lang.Thread(new nc.i(r1, r8)).start();
        r9.success(null);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.content.BroadcastReceiver, dev.liquidglass.liquid_glass.LiquidGlassPlugin$watch$receiver$1] */
    /* JADX WARN: Type inference failed for: r3v4, types: [nc.p] */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r8, final io.flutter.plugin.common.MethodChannel.Result r9) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.x0.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    public /* synthetic */ x0(Object obj, int i10) {
        this.f28192a = i10;
        this.f28193b = obj;
    }
}
