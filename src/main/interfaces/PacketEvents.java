package main.interfaces;

import main.classes.Address;
import main.classes.packageCategory.PackageCategory;

public interface PacketEvents {

    public void getPacket(String trackingNumber);
    public void createPacket(PackageCategory packageCategory, Address sender, Address receiver);
    public void changeState(String trackingNumber);
}
