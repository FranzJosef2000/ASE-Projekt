package main.implementation;

import main.classes.Packet;
import main.repos.PacketRepository;

import java.util.ArrayList;

public class PacketImplementation {
    private PacketRepository packetRepository = new PacketRepository();
    private ArrayList<Packet> packets = packetRepository.returnPacket();

    public Packet getPacketByID(String id){
        return packets.stream().filter(item -> id.equals(item.getId())).findFirst().orElse(null);
    }
}
