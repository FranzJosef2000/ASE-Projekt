package main.repos;

import main.package_state;
import main.repos.returns.PacketReturn;

public interface PacketRepo {

    public PacketReturn getPacketByTrackinNumber(String trackingnumber);
    public PacketReturn createPacket();
    public PacketReturn postPacket(String trackingnumber, package_state state);
}
