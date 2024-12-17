/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jxna.Microsoft.Xna.Framework;

import com.openeggbert.jdotnet.System.EventArgs;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author robertvokac
 */
public class ExitingEventArgs extends EventArgs {
    @Getter @Setter
    public boolean Cancel;
}
