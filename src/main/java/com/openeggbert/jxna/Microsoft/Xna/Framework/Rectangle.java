/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jxna.Microsoft.Xna.Framework;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *
 * @author robertvokac
 */
@AllArgsConstructor
@NoArgsConstructor
public class Rectangle extends com.openeggbert.jdotnet.JDotNet.CSharpKeyWords.Struct<Rectangle> {
    
    private static final Rectangle emptyRectangle = new Rectangle().reset();
    
    public int X;

    public int Y;

    public int Width;

    public int Height;

    @Override
    public Rectangle copy() {
        return new Rectangle(X, Y, Width, Height);
    }

    @Override
    public Rectangle reset() {
        X = 0;
        Y = 0;
        Width = 0;
        Height = 0;
        return this;
    }
    
    public int Left() { return X;}

    public int Right() { return  X + Width;}

    public int Top() { return  Y;}

    public int Bottom() { return  Y + Height;}
    public boolean IsEmpty()
    {
        
        {
            if (Width == 0 && Height == 0 && X == 0)
            {
                return Y == 0;
            }

            return false;
        }
    }
    
}
