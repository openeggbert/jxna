/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jxna.Microsoft.Xna.Framework.Graphics;

import lombok.Getter;

/**
 *
 * @author robertvokac
 */
public enum SpriteEffects {
        
    None(0),
    FlipHorizontally(1),
    FlipVertically(2);
    @Getter
    private int number;

    private SpriteEffects(int numberIn) {
        this.number = numberIn;
    }
    
}
