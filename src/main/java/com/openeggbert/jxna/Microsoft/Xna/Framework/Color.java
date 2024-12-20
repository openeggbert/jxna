/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jxna.Microsoft.Xna.Framework;

import com.openeggbert.jdotnet.JDotNet.CSharpKeyWords.struct;
import com.openeggbert.jdotnet.System.uint;

/**
 *
 * @author robertvokac
 */
public class Color extends struct<Color> {

    public static final Color CornflowerBlue;
    public static final Color White;
    private long _packedValue;

    public static Color FromNonPremultiplied(int r, int g, int b, int a) {
        return null;
        //todo
    }

    static {
        CornflowerBlue = new Color(4293760356l);
        White = new Color(uint.MaxValue);
    }
    private Color(long l) {
        this._packedValue = l;
    }

    public byte B() {return getB();}
    public byte G() {return getG();}
    public byte R() {return getR();}
    public byte A() {return getA();}
    ////
    public byte getB() {
        return (byte) (_packedValue >> 16);
    }

    public void setB(byte value) {
        _packedValue = (_packedValue & 0xFF00FFFF) | ((value & 0xFF) << 16);
    }

    // Získá nebo nastaví zelenou složku
    public byte getG() {
        return (byte) (_packedValue >> 8);
    }

    public void setG(byte value) {
        _packedValue = (_packedValue & 0xFFFF00FF) | ((value & 0xFF) << 8);
    }

    // Získá nebo nastaví červenou složku
    public byte getR() {
        return (byte) _packedValue;
    }

    public void setR(byte value) {
        _packedValue = (_packedValue & 0xFFFFFF00) | (value & 0xFF);
    }

    // Získá nebo nastaví alfa složku
    public byte getA() {
        return (byte) (_packedValue >> 24);
    }

    public void setA(byte value) {
        _packedValue = (_packedValue & 0xFFFFFF) | ((value & 0xFF) << 24);
    }

    @Override
    public String toString() {
        return "Color{"
                + "R=" + (getR() & 0xFF)
                + ", G=" + (getG() & 0xFF)
                + ", B=" + (getB() & 0xFF)
                + ", A=" + (getA() & 0xFF)
                + '}';
    }

    ////
    @Override
    public Color copy() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Color reset() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
