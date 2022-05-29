package main.interfaces;

import main.classes.Address;
import main.enums.package_Category;
import main.repos.PacketRepo;
import main.repos.returns.PacketReturn;

public class PacketEventsImpl implements PacketEvents {
    private PacketRepo packetRepo;

    public PacketEventsImpl(PacketRepo packetRepo){
        this.packetRepo = packetRepo;
    }

    @Override
    public void getPacket(String trackingNumber) {
        PacketReturn packetReturn = packetRepo.getPacketByTrackinNumber(trackingNumber);
        if(packetReturn.isSuccessful()){
            System.out.println("Paket wurde gefunden!");
            System.out.println("Paketstatus: "+packetReturn.getPacket().getState());
        }
        else {
            System.out.println("Paket wurde nicht gefunden!");
        }
    }

    @Override
    public void createPacket(package_Category packageCategory, Address sender, Address receiver) {
        PacketReturn packetReturn = packetRepo.createPacket(packageCategory, sender, receiver);
        if (packetReturn.isSuccessful()){
            System.out.println("Paket wurde erfolgreich aufgegeben!");
        }
        else {
            System.out.println("Paket konnte nicht aufgegeben werden!");
        }
    }

    @Override
    public void changeStatus(String trackingnumber) {
        PacketReturn packetReturn = packetRepo.putPacket(trackingnumber);
        if(packetReturn.isSuccessful()){
            System.out.println("Paketstatus wurde erfolgreich geändert!");
        }
        else {
            System.out.println("Paket status konnte nicht geändert werden!");
        }
    }
}
