package main;

import main.terminalhandling.TerminalHandler;

public class packageTrackingManager {

     public static void main(String[] args){
          packageTrackingManager packageTrackingManager = new packageTrackingManager();
          packageTrackingManager.start();
     }
     private void start(){
          TerminalHandler t = new TerminalHandler();
          t.terminalHandler();
     }
}
