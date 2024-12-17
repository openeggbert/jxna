/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jxna.Microsoft.Xna.Framework.Audio;

import lombok.Getter;

/**
 *
 * @author robertvokac
 */
public enum SoundState {
    Paused(1),
    Playing(0),
    Stopped(2);

    SoundState(int numberIn) {
        this.number = numberIn;
    }
    @Getter
    private final int number;

}
