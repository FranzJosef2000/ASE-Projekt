package main.terminalhandling.operations;

import main.interfaces.PacketEvents;
import main.interfaces.PacketEventsImpl;
import main.package_Category;

public class HelpOperation {
    private PacketEvents packetEvents;

    public HelpOperation(String[] command, PacketEventsImpl packetEventsImpl) {
        super();
        this.packetEvents = packetEventsImpl;

        if (command[1].equalsIgnoreCase("Category")){
           for (package_Category category : package_Category.values()){
            System.out.println(category+": "+ category.getDescription()+"("+category.getVolumeDescription()+") | "+category.getPrice()+"€");
           }
        }
        else {
            System.out.println("Hilfe");
            System.out.println("--------------------------------");
            System.out.println("Packet aufgeben:");
            System.out.println("CREATE PACKAGE <Paketkategorie>");
            System.out.println("Paketkategorien? Mit folgenden alle Kategorienen auflisten lassen");
            System.out.println("HELP CATEGORY");
            System.out.println("--------------------------------");
            System.out.println("Packet verfolgen:");
            System.out.println("GET PACKAGE <Sendeverfolgungsnummer>");
            System.out.println("--------------------------------");
            System.out.println("Packet verschieben:");
            System.out.println("POST PACKAGE <Sendeverfolgungsnummer>");
            System.out.println("--------------------------------");
        }
    }
}
