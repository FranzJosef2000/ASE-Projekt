package main.terminalhandling.operations;

import main.classes.packageCategory.*;
import main.interfaces.PacketEvents;
import main.interfaces.PacketEventsImpl;

public class HelpOperation {
    private PacketEvents packetEvents;

    public HelpOperation(String[] command, PacketEventsImpl packetEventsImpl) {
        super();
        this.packetEvents = packetEventsImpl;

        if (command[1].equalsIgnoreCase("Category")){
           buildOutputText(new Parcel_S(),"PARCEL_S");
           buildOutputText(new Parcel_M(),"PARCEL_M");
           buildOutputText(new DHLPackage2Kg(),"DHLPACKAGE2KG");
           buildOutputText(new DHLPackage5Kg(),"DHLPACKAGE5KG");
           buildOutputText(new DHLPackage10Kg(),"DHLPACKAGE10KG");
           buildOutputText(new DHLPackage31Kg(),"DHLPACKAGE31KG");
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
            System.out.println("Packet in den nächsten Status verschieben:");
            System.out.println("Put PACKAGE <Sendeverfolgungsnummer>");
            System.out.println("--------------------------------");
        }
    }
    private void buildOutputText(PackageCategory category, String name){
        System.out.println(name+": "+ category.getDescription()+"("+category.getVolumeDescription()+") | "+category.getPrice()+"€");
    }
}
