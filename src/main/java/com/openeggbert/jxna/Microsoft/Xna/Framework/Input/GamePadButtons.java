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
@Getter
public class GamePadButtons extends Struct<GamePadButtons> {

    @Override
    public GamePadButtons copy() {
        return new GamePadButtons();
    }

    @Override
    public GamePadButtons reset() {
        return this;
    }

    public ButtonState A;

    public ButtonState B;

    public ButtonState Back;

    public ButtonState X;

    public ButtonState Y;

    public ButtonState Start;

    public ButtonState LeftShoulder;

    public ButtonState LeftStick;

    public ButtonState RightShoulder;

    public ButtonState RightStick;

    public ButtonState BigButton;

}
