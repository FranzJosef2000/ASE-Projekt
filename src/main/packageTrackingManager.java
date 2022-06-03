package main;

import main.interfaces.EmployeeEventsImpl;
import main.interfaces.PacketEventsImpl;
import main.repos.EmployeeRepo;
import main.repos.EmployeeRepository;
import main.repos.PacketRepo;
import main.repos.PacketRepository;
import main.terminalhandling.TerminalHandler;

public class packageTrackingManager {

     private static packageTrackingManager packageTrackingManagerSingleton = null;

     public static void main(String[] args){
          packageTrackingManager packageTrackingManager = main.packageTrackingManager.getSingleton();
          packageTrackingManager.start();
     }
     private static packageTrackingManager getSingleton(){
     if (packageTrackingManagerSingleton == null){
          packageTrackingManagerSingleton = new packageTrackingManager();
     }
     return packageTrackingManagerSingleton;
     }
     private void start(){
          PacketRepo packetRepo = new PacketRepository();
          EmployeeRepo employeeRepo = new EmployeeRepository();

          PacketEventsImpl packetEventsImpl = new PacketEventsImpl(packetRepo);
          EmployeeEventsImpl employeeEventsImpl = new EmployeeEventsImpl(employeeRepo);

          TerminalHandler t = new TerminalHandler();
          t.terminalHandler(packetEventsImpl,employeeEventsImpl);
     }
}
