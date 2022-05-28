package main.repos;

import main.classes.Address;
import main.classes.Packet;
import main.package_Category;
import main.package_state;
import main.repos.returns.PacketReturn;
import main.tools.TrackingnumberGenerator;

import java.util.ArrayList;

public class PacketRepository implements PacketRepo {
    ArrayList<Packet> packetRepository = new ArrayList();

    public PacketRepository() {
    packetMockup();
    }
    private void packetMockup(){
        Address adress = new Address("","","","","","");
        packetRepository.add(new Packet("cec70e16-5a5e-4708-8ada-c57f0dc1519e",package_Category.PARCEL_M,adress,adress,package_state.ANGEKÜNDIGT));
        packetRepository.add(new Packet("cec70e16-5a5e-4708-8ada-c57f0dc1518e",package_Category.PARCEL_M,adress,adress,package_state.IN_ZUSTELLUNG));
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
    public PacketReturn createPacket(package_Category packageCategory, Address sender, Address receiver) {
        String trackingnumber = TrackingnumberGenerator.generateTrackingNumber();
        System.out.println(trackingnumber);
        Packet createdPacket = new Packet(trackingnumber, packageCategory, sender, receiver, package_state.ANGEKÜNDIGT );
        packetRepository.add(createdPacket);
        Packet packet = packetRepository.stream().filter(item->trackingnumber.equals(item.getId())).findFirst().orElse(null);
        if (packet != null){
            return new PacketReturn(true, packet);
        } else{
            return new PacketReturn(false,null);
        }
    }

    @Override
    public PacketReturn postPacket(String trackingNumber) {
        Packet packet = getPacketByTrackinNumber(trackingNumber).getPacket();
        package_state formerState = packet.getState();
        packet.changeState();
        if (!packet.getState().equals(formerState)|| formerState.equals(package_state.ZUGESTELLT)){
            System.out.println("Staus von Paket "+ trackingNumber+" wurde von "+formerState+" zu "+packet.getState()+" geändert!");
            return new PacketReturn(true, packet);
        } else{
            return new PacketReturn(false,null);
        }
    }
}
