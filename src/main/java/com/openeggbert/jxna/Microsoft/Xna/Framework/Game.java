/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jxna.Microsoft.Xna.Framework;

import com.openeggbert.jdotnet.System.*;
import com.openeggbert.jdotnet.System.Event;
import com.openeggbert.jdotnet.System.EventHandler;
import com.openeggbert.jdotnet.System.EventHandlerImpl;
import com.openeggbert.jxna.Microsoft.Xna.Framework.Content.ContentManager;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author robertvokac
 */
public class Game {
    
        private final EventHandler<ExitingEventArgs> ExitingInternal = new EventHandlerImpl<ExitingEventArgs>();
        public @Event EventHandler<ExitingEventArgs> Exiting() {return ExitingInternal;}
        public boolean isMouseVisible() {
            return true;
        //todo
        }
        
        public void setMouseVisible(boolean mouseVisible) {
            //todo
        }
        @Getter @Setter
        public ContentManager Content;
        @Getter @Setter
        public TimeSpan TargetElapsedTime;
        @Getter @Setter
        public TimeSpan InactiveSleepTime;
                protected void Initialize()
        {
        }

        protected void LoadContent()
        {
        }

        protected void UnloadContent()
        {
        }
    protected void OnDeactivated(Object sender, EventArgs args) {

    }

    protected void OnActivated(Object sender, EventArgs args) {
    }

    protected void Update(GameTime gameTime) {
    }

    public void Exit() {}

}
