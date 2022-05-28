package main;

import main.interfaces.PacketEventsImpl;
import main.repos.PacketRepo;
import main.repos.PacketRepository;
import main.terminalhandling.TerminalHandler;

public class packageTrackingManager {

     public static void main(String[] args){
          packageTrackingManager packageTrackingManager = new packageTrackingManager();
          packageTrackingManager.start();
     }
     private void start(){
          PacketRepo packetRepo = new PacketRepository();

          PacketEventsImpl packetEventsImpl = new PacketEventsImpl(packetRepo);

          TerminalHandler t = new TerminalHandler();
          t.terminalHandler(packetEventsImpl);
     }
}
