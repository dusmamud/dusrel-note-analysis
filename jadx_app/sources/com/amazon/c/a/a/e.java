package com.amazon.c.a.a;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f6020a = "A valid instance of e is required to have at least one non-blank ID, either developerId or certificateId, and at least one non-blank name, either developerName or commonName.";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f6021b = "A valid instance of e is required to have a certificate ID.";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f6023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f6024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f6025f;

    public static String a() {
        return f6020a;
    }

    public static String b() {
        return f6021b;
    }

    public boolean c() {
        return (StringUtils.isBlank(e()) || StringUtils.isBlank(f())) ? false : true;
    }

    public boolean d() {
        return !StringUtils.isBlank(e());
    }

    public String e() {
        return StringUtils.isBlank(this.f6024e) ? this.f6022c : this.f6024e;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return new EqualsBuilder().append(this.f6024e, eVar.f6024e).append(this.f6025f, eVar.f6025f).append(this.f6022c, eVar.f6022c).append(this.f6023d, eVar.f6023d).isEquals();
    }

    public String f() {
        return StringUtils.isBlank(this.f6025f) ? this.f6023d : this.f6025f;
    }

    public String g() {
        return this.f6022c;
    }

    public String h() {
        return this.f6023d;
    }

    public int hashCode() {
        return new HashCodeBuilder().append(this.f6024e).append(this.f6025f).append(this.f6022c).append(this.f6023d).toHashCode();
    }

    public String i() {
        return this.f6024e;
    }

    public String j() {
        return this.f6025f;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public e a(String str) {
        this.f6022c = str;
        return this;
    }

    public void b(String str) {
        this.f6022c = str;
    }

    public e c(String str) {
        this.f6023d = str;
        return this;
    }

    public void d(String str) {
        this.f6023d = str;
    }

    public e g(String str) {
        this.f6025f = str;
        return this;
    }

    public void h(String str) {
        this.f6025f = str;
    }

    public e e(String str) {
        this.f6024e = str;
        return this;
    }

    public void f(String str) {
        this.f6024e = str;
    }
}
