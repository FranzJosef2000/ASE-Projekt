package main.repos;

import main.classes.Address;
import main.enums.package_Category;
import main.repos.returns.PacketReturn;

public interface PacketRepo {

    public PacketReturn getPacketByTrackinNumber(String trackingnumber);
    public PacketReturn createPacket(package_Category packageCategory, Address sender, Address receiver);
    public PacketReturn putPacket(String trackingnumber);
}
