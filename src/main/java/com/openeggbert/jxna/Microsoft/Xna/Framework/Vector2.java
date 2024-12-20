/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jxna.Microsoft.Xna.Framework;

import com.openeggbert.jdotnet.JDotNet.CSharpKeyWords.Struct;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *
 * @author robertvokac
 */
@AllArgsConstructor @NoArgsConstructor
public class Vector2 extends Struct<Vector2> {

    public float X;
    public float Y;
    
    @Override
    public Vector2 copy() {
        return new Vector2(X, Y);
    }

    @Override
    public Vector2 reset() {
        this.X = 0;
        this.Y = 0;
        return this;
    }
    
}
