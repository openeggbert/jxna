/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jxna.Microsoft.Xna.Framework.Graphics;

import com.openeggbert.jdotnet.JDotNet.CSharpKeyWords.internal;
import com.openeggbert.jxna.Microsoft.Xna.Framework.Rectangle;

/**
 *
 * @author robertvokac
 */
public class Texture2D extends Texture{
    
    private @internal int width;

    private @internal int height;
    
    public Rectangle Bounds() {
        return new Rectangle(0, 0, width, height);
    }

    @Override
    public void Dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
