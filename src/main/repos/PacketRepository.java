package main.repos;

import main.classes.Packet;
import main.package_state;
import main.repos.returns.PacketReturn;

import java.util.ArrayList;

public class PacketRepository implements PacketRepo {
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

    @Override
    public PacketReturn getPacketByTrackinNumber(String trackingnumber) {
        Packet packet = packetRepository.stream().filter(item->trackingnumber.equals(item.getId())).findFirst().orElse(null);
        if (packet != null){
            return new PacketReturn(true, packet);
        } else{
            return new PacketReturn(false,null);
        }

    }

    @Override
    public PacketReturn createPacket() {
        return null;
    }

    @Override
    public PacketReturn postPacket(String trackingnumber, package_state state) {
        return null;
    }
}
