package main.interfaces;

import main.package_state;

public interface PacketEvents {

    public String getPacket(String trackingNumber);
    public String createPacket();
    public String postPacket(String trackingNumber,package_state state);
}
