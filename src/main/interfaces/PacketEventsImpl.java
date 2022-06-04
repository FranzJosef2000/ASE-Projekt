package main.interfaces;

import main.classes.Address;
import main.classes.packageCategory.PackageCategory;
import main.repos.PacketRepo;
import main.repos.returns.PacketReturn;

public class PacketEventsImpl implements PacketEvents {
    private PacketRepo packetRepo;

    public PacketEventsImpl(PacketRepo packetRepo){
        this.packetRepo = packetRepo;
    }

    @Override
    public PacketReturn getPacket(String trackingNumber) {
        PacketReturn packetReturn = packetRepo.getPacketByTrackinNumber(trackingNumber);
        if(packetReturn.isSuccessful()){
            System.out.println("Paket wurde gefunden!");
            System.out.println("Paketstatus: "+packetReturn.getPacket().getState());
            return new PacketReturn(true,packetReturn.getPacket());
        }
        else {
            System.out.println("Paket wurde nicht gefunden!");
            return new PacketReturn(false,null);
        }
    }

    @Override
    public PacketReturn createPacket(PackageCategory packageCategory, Address sender, Address receiver) {
        PacketReturn packetReturn = packetRepo.createPacket(packageCategory, sender, receiver);
        if (packetReturn.isSuccessful()){
            System.out.println("Paket wurde erfolgreich aufgegeben!");
            return new PacketReturn(true,packetReturn.getPacket());
        }
        else {
            System.out.println("Paket konnte nicht aufgegeben werden!");
            return new PacketReturn(false,null);
        }
    }

    @Override
    public PacketReturn changeState(String trackingnumber) {
        try{
            PacketReturn packetReturn = packetRepo.putPacket(trackingnumber);
            if(packetReturn.isSuccessful()){
                System.out.println("Paketstatus wurde erfolgreich geändert!");
                return new PacketReturn(true,packetReturn.getPacket());
            }
            else {
                System.out.println("Paket status konnte nicht geändert werden!");
                return new PacketReturn(false,null);
            }
        }catch (Exception e){
            System.out.println("Paket status konnte nicht geändert werden!");
            return new PacketReturn(false,null);
        }
    }
}
