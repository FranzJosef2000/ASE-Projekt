package main.terminalhandling.operations;

import main.interfaces.PacketEvents;
import main.interfaces.PacketEventsImpl;

public class GetOperation {
    private PacketEvents packetEvents;


    public GetOperation(String[] command, PacketEventsImpl packetEventsImpl) {
        super();
        this.packetEvents = packetEventsImpl;

        if(command[1].equalsIgnoreCase("PACKAGE")){
            if (command[2].length() == 36)
            {
                String packageNumber = command[2];
                packetEvents.getPacket(packageNumber);
            }
            else {
                System.out.println("Fehlerhafte Eingabe");
            }
        }
        else{
            System.out.println("Fehlerhafte eingabe!");
        }
    }
}
