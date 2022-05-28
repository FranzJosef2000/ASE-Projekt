package main.repos;

import main.classes.Address;
import main.package_Category;
import main.package_state;
import main.repos.returns.PacketReturn;

public interface PacketRepo {

    public PacketReturn getPacketByTrackinNumber(String trackingnumber);
    public PacketReturn createPacket(package_Category packageCategory, Address sender, Address receiver);
    public PacketReturn postPacket(String trackingnumber, package_state state);
}
