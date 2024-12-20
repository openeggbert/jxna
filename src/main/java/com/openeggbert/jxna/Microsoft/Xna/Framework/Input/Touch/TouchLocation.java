/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jxna.Microsoft.Xna.Framework.Input.Touch;

import com.openeggbert.jdotnet.JDotNet.CSharpKeyWords.struct;
import com.openeggbert.jxna.Microsoft.Xna.Framework.Vector2;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *
 * @author robertvokac
 */
@AllArgsConstructor @NoArgsConstructor
public class TouchLocation extends struct<TouchLocation> {

    public int Id;
    public Vector2 Position;
    public TouchLocationState State;
    @Override
    public TouchLocation copy() {
        return new TouchLocation(Id, Position, State);
    }

    @Override
    public TouchLocation reset() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
