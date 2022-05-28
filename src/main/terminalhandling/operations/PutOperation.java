package main.terminalhandling.operations;


import main.interfaces.PacketEvents;
import main.interfaces.PacketEventsImpl;

public class PutOperation {
    private PacketEvents packetEvents;

    public PutOperation(String[] command, PacketEventsImpl packetEventsImpl) {
        super();
        this.packetEvents = packetEventsImpl;

        if(command[1].equalsIgnoreCase("PACKAGE")){
            if (command[2].length() == 8){
                String packageNumber = command[2];
                System.out.println("Interface");
            }
            else{
                System.out.println("Fehlerhafte Eingabe");
            }
        }
        else{
            System.out.println("Fehlerhafte eingabe!");
        }
    }
}
