package com.openeggbert.jxna.Microsoft.Xna.Framework.Input;

import com.openeggbert.jdotnet.JDotNet.CSharpKeyWords.Struct;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author robertvokac
 */
@AllArgsConstructor
@NoArgsConstructor
public class MouseState extends Struct<MouseState> {

    private int _x;

    private int _y;

    private int _scrollWheelValue;

    private int _horizontalScrollWheelValue;

    private byte _buttons;

    public int X() {
        return getX();
    }

    public int Y() {
        return getY();
    }

    public int ScrollWheelValue() {
        return getScrollWheelValue();
    }

    public int HorizontalScrollWheelValue() {
        return getHorizontalScrollWheelValue();
    }

    public byte Buttons() {
        return getButtons();
    }

    public int getX() {
        return _x;
    }

    public int getY() {
        return _y;
    }

    public int getScrollWheelValue() {
        return _scrollWheelValue;
    }

    public int getHorizontalScrollWheelValue() {
        return _horizontalScrollWheelValue;
    }

    public byte getButtons() {
        return _buttons;
    }
    ////

    public static void SetCursor(MouseCursor mouseCursor) {
        //todo
    }

    public static MouseState GetState() {
        return null;
        //todo
    }

    public ButtonState LeftButton() {
        return null;//todo
    }
    @Override
    public MouseState copy() {
        return new MouseState(_x, _y, _scrollWheelValue, _horizontalScrollWheelValue, _buttons);
    }

    @Override
    public MouseState reset() {

        _x = 0;
        _y = 0;
        _scrollWheelValue = 0;
        _horizontalScrollWheelValue = 0;
        _buttons = 0;
        return this;
    }
}
