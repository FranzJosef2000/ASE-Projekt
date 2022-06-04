package main.interfaces;

import main.classes.Address;
import main.classes.packageCategory.PackageCategory;
import main.repos.returns.PacketReturn;

public interface PacketEvents {

    public PacketReturn getPacket(String trackingNumber);
    public PacketReturn createPacket(PackageCategory packageCategory, Address sender, Address receiver);
    public PacketReturn changeState(String trackingNumber);
}
