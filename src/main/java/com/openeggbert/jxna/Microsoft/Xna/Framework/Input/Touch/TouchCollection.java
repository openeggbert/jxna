/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jxna.Microsoft.Xna.Framework.Input.Touch;

import com.openeggbert.jdotnet.JDotNet.CSharpKeyWords.Struct;
import com.openeggbert.jdotnet.System.Collections.Generic.List_;
import java.util.Iterator;
import lombok.Getter;

/**
 *
 * @author robertvokac
 */
public class TouchCollection extends Struct<TouchCollection> implements Iterable<TouchLocation> {

    private List_<TouchLocation> touches = new List_<>();
    
    @Getter
    public int Count;
    @Override
    public TouchCollection copy() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TouchCollection reset() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    class TouchCollectionIterator implements Iterator<TouchLocation> {

        private int cursor = 0;
        @Override
        public boolean hasNext() {
             return cursor != Count;
        }

        @Override
        public TouchLocation next() {
            TouchLocation result = touches.ElementAt(cursor);
            cursor++;
            return result;
        }
        
    }
    @Override
    public Iterator<TouchLocation> iterator() {
        return new TouchCollectionIterator();
    }
    
}
