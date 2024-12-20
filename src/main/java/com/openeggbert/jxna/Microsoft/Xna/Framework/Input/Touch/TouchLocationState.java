/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jxna.Microsoft.Xna.Framework.Input.Touch;

import lombok.Getter;

/**
 *
 * @author robertvokac
 */
public enum TouchLocationState {
    Invalid(0),
    Moved(1),
    Pressed(2),
    Released(3);
    @Getter
    private final int number;

    private TouchLocationState(int numberIn) {
        this.number = numberIn;
    }
    
}
