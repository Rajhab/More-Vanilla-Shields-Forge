package com.rajhab.morevanillashields_mod.math;

import static java.lang.Math.sin;

public class ModVector3d {
    public double x;
    public double y;
    public double z;

    public ModVector3d(double pX, double pY, double pZ) {
        this.x = pX;
        this.y = pY;
        this.z = pZ;
    }

    public static final double PI = Math.PI;
    static final double PI2 = PI * 2.0;
    static final double PIHalf = PI * 0.5;

    public static double sqrt(double r) {
        return Math.sqrt(r);
    }

    public static double cosFromSin(double sin, double angle) {
        if (ModOptions.FASTMATH)
            return sin(angle + PIHalf);
        // sin(x)^2 + cos(x)^2 = 1
        double cos = sqrt(1.0 - sin * sin);
        double a = angle + PIHalf;
        double b = a - (int)(a / PI2) * PI2;
        if (b < 0.0)
            b = PI2 + b;
        if (b >= PI)
            return -cos;
        return cos;
    }

    public ModVector3d rotateX(double angle) {
        double sin = sin(angle), cos = cosFromSin(sin, angle);
        double y = this.y * cos - this.z * sin;
        double z = this.y * sin + this.z * cos;
        this.y = y;
        this.z = z;
        return this;
    }

    public ModVector3d rotateZ(double angle) {
        double sin = Math.sin(angle), cos = cosFromSin(sin, angle);
        double x = this.x * cos - this.y * sin;
        double y = this.x * sin + this.y * cos;
        this.x = x;
        this.y = y;
        return this;
    }

    public void set(com.mojang.math.Vector3d pOther) {
        this.x = pOther.x;
        this.y = pOther.y;
        this.z = pOther.z;
    }

    public void set(double pX, double pY, double pZ) {
        this.x = pX;
        this.y = pY;
        this.z = pZ;
    }

    public void scale(double pScale) {
        this.x *= pScale;
        this.y *= pScale;
        this.z *= pScale;
    }

    public void add(com.mojang.math.Vector3d pOther) {
        this.x += pOther.x;
        this.y += pOther.y;
        this.z += pOther.z;
    }
}
