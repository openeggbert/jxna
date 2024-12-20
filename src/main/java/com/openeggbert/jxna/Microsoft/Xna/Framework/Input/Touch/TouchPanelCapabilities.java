/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jxna.Microsoft.Xna.Framework.Input.Touch;

import com.openeggbert.jdotnet.JDotNet.CSharpKeyWords.struct;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *
 * @author robertvokac
 */
@AllArgsConstructor
@NoArgsConstructor
public class TouchPanelCapabilities extends struct<TouchPanelCapabilities>{
    private boolean hasPressure;

    private boolean isConnected;

    private int maximumTouchCount;

    private boolean initialized;
    @Override
    public TouchPanelCapabilities copy() {
        return new TouchPanelCapabilities(hasPressure, isConnected, maximumTouchCount, initialized);
    }

    @Override
    public TouchPanelCapabilities reset() {
        return new TouchPanelCapabilities(false, false, 0, false);
    }
    
    public boolean HasPressure() {return hasPressure;}

    public boolean IsConnected() {return  isConnected;}

    public int MaximumTouchCount() {return  maximumTouchCount;}

    public void Initialize()
    {
        if (!initialized)
        {
            initialized = true;
            hasPressure = false;
            isConnected = false;
        }
    }
    
}
