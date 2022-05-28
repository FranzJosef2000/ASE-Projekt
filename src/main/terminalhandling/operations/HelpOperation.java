package main.terminalhandling.operations;

import main.interfaces.PacketEvents;
import main.interfaces.PacketEventsImpl;

public class HelpOperation {
    private PacketEvents packetEvents;

    public HelpOperation(PacketEventsImpl packetEventsImpl) {
        super();
        this.packetEvents = packetEventsImpl;

        System.out.println("Hilfe");
        System.out.println("--------------------------------");
        System.out.println("Packet aufgeben:");
        System.out.println("CREATE PACKAGE");
        System.out.println("--------------------------------");
        System.out.println("Packet verfolgen:");
        System.out.println("GET PACKAGE <Sendeverfolgungsnummer>");
        System.out.println("--------------------------------");
        System.out.println("Packet verschieben:");
        System.out.println("TODO:");
        System.out.println("--------------------------------");
    }
}
