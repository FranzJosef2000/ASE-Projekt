package main.repos;

import main.classes.Address;
import main.classes.packageCategory.PackageCategory;
import main.repos.returns.PacketReturn;

public interface PacketRepo {

    public PacketReturn getPacketByTrackinNumber(String trackingnumber);
    public PacketReturn createPacket(PackageCategory packageCategory, Address sender, Address receiver);
    public PacketReturn putPacket(String trackingnumber);
}
