package main.repos.returns;

import main.classes.Packet;

public class PacketReturn extends Return{
    private Packet packet;

    public PacketReturn(boolean successful, Packet packet){
        super(successful);
        this.packet=packet;
    }
    public Packet getPacket(){
        return packet;
    }
}
