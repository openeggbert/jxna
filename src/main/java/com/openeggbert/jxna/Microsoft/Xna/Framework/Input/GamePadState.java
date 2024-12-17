/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jxna.Microsoft.Xna.Framework.Input;

import com.openeggbert.jdotnet.System.Struct;
import lombok.Getter;

/**
 *
 * @author robertvokac
 */
public class GamePadState extends Struct<GamePadState>{

    @Override
    public GamePadState copy() {
        return new GamePadState();
    }

    @Override
    public GamePadState reset() {
        return this;
    }
    @Getter
    public GamePadButtons Buttons;

}