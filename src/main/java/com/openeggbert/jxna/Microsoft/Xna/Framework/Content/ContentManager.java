/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jxna.Microsoft.Xna.Framework.Content;

import com.openeggbert.jdotnet.System.IDisposable;

/**
 *
 * @author robertvokac
 */
public abstract class ContentManager implements IDisposable {
    public abstract <T> T Load(String assetName);

}
