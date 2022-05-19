package main.interfaces;

import main.package_state;
import main.repos.PacketRepo;
import main.repos.returns.PacketReturn;

public class PacketEventsImpl implements PacketEvents {
    private PacketRepo packetRepo;

    public PacketEventsImpl(PacketRepo packetRepo){
        this.packetRepo = packetRepo;
    }

    @Override
    public String getPacket(String trackingNumber) {
        PacketReturn packetReturn = packetRepo.getPacketByTrackinNumber(trackingNumber);
        if(packetReturn.isSuccessful()){
            return null;
        }
        return null;
    }

    @Override
    public String createPacket() {
        PacketReturn packetReturn = packetRepo.createPacket();
        if (packetReturn.isSuccessful()){
            return null;
        }
        return null;
    }

    @Override
    public String postPacket(String trackingnumber,package_state state) {
        PacketReturn packetReturn = packetRepo.postPacket(trackingnumber,state);
        if(packetReturn.isSuccessful()){
            return null;
        }
        return null;
    }
}
