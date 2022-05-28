package main.interfaces;

import main.classes.Address;
import main.package_Category;
import main.package_state;

public interface PacketEvents {

    public void getPacket(String trackingNumber);
    public void createPacket(package_Category packageCategory, Address sender, Address receiver);
    public void changeStatus(String trackingNumber, package_state state);
}
