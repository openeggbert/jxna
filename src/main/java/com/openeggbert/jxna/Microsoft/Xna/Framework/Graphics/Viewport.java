/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jxna.Microsoft.Xna.Framework.Graphics;

import com.openeggbert.jdotnet.JDotNet.CSharpKeyWords.Struct;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author robertvokac
 */
@AllArgsConstructor
@NoArgsConstructor
public class Viewport extends Struct<Viewport> {

    @Getter
    @Setter
    private int x;
    @Getter
    @Setter
    private int y;
    @Getter
    @Setter
    private int width;
    @Getter
    @Setter
    private int height;
    @Getter
    @Setter
    private float minDepth;
    @Getter
    @Setter
    private float maxDepth;

    public int X() {
        return getX();
    }

    public int Y() {
        return getY();
    }

    public int Width() {
        return getWidth();
    }

    public int Height() {
        return getHeight();
    }

    public float MinDepth() {
        return getMinDepth();
    }

    public float MaxDepth() {
        return getMaxDepth();
    }

    @Override
    public Viewport copy() {
        return new Viewport(x, y, width, height, minDepth, maxDepth);
    }

    @Override
    public Viewport reset() {
        x = 0;
        y = 0;
        width = 0;
        height = 0;
        minDepth = 0;
        maxDepth = 0;
        return this;
    }
}
