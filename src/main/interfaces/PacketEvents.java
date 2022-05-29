package main.interfaces;

import main.classes.Address;
import main.enums.package_Category;

public interface PacketEvents {

    public void getPacket(String trackingNumber);
    public void createPacket(package_Category packageCategory, Address sender, Address receiver);
    public void changeStatus(String trackingNumber);
}
