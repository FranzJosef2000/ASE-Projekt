package main.repos;

import main.classes.Packet;

import java.util.ArrayList;

public class PacketRepository {
    ArrayList<Packet> packetRepository = new ArrayList();

    public PacketRepository() {
    packetMockup();
    }
    private void packetMockup(){
        //packetRepository.add(new Packet("IDTEST123","","","",""));
        //packetRepository.add(new Packet("IDTEST456","","","",""));
        //packetRepository.add(new Packet("IDTEST789","","","",""));
    }
    public ArrayList returnPacket(){
        return packetRepository;
    }
}
