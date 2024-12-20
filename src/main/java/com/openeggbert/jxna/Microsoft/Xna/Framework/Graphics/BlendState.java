/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jxna.Microsoft.Xna.Framework.Graphics;

import com.openeggbert.jdotnet.JDotNet.CSharpKeyWords.Readonly;

/**
 *
 * @author robertvokac
 */
public class BlendState extends GraphicsResource{
    public static @Readonly final BlendState AlphaBlend =  new BlendState("BlendState.AlphaBlend", Blend.One, Blend.InverseSourceAlpha);

    private BlendState(String blendStateAlphaBlend, Blend blend, Blend blend0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
