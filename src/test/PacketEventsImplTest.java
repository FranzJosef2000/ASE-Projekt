package test;

import main.classes.Address;
import main.classes.Packet;
import main.classes.packageCategory.PackageCategory;
import main.classes.packageCategory.Parcel_M;
import main.enums.package_state;
import main.interfaces.PacketEventsImpl;
import main.repos.PacketRepo;
import main.repos.returns.PacketReturn;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PacketEventsImplTest {
    private static String trackingNumber= "abc70e16-5a5e-4708-8ada-c57f0dc1518e";
    private static Address address = new Address("Max", "Mustermann","09599","Freiberg","Schillerstraße","35a");
    private static Packet packet = null;
    private PacketEventsImpl packetEventsImpl = new PacketEventsImpl(new PacketRepo() {
        @Override
        public PacketReturn getPacketByTrackinNumber(String trackingnumber) {
            if (packet != null && trackingnumber.equals(trackingNumber)){
                return new PacketReturn(true, packet);
            } else{
                return new PacketReturn(false,null);
            }
        }

        @Override
        public PacketReturn createPacket(PackageCategory packageCategory, Address sender, Address receiver) {
            packet = new Packet(trackingNumber, packageCategory, sender, receiver, package_state.ANGEKÜNDIGT );
            return new PacketReturn(true, packet);
        }

        @Override
        public PacketReturn putPacket(String trackingnumber) {
            if (packet != null){
                package_state formerState = packet.getState();
                packet.changeState();
                if (!packet.getState().equals(formerState)|| formerState.equals(package_state.ZUGESTELLT)){
                    return new PacketReturn(true, packet);
                } else{
                    return new PacketReturn(false,null);
                }
            }
            else {
                return new PacketReturn(false,null);
            }
            }

    });
    @BeforeEach
    void beforeEach(){
        packet = null;
    }
    @Test
    void getPacketByTrackingNumberByUnsetPacketTest(){
        assertNull(packetEventsImpl.getPacket(trackingNumber).getPacket());
    }
    @Test
    void changePacketByUnsetPacketTest(){
        assertNull(packetEventsImpl.changeState(trackingNumber).getPacket());
    }
    @Test
    void createPacketTest(){
        assertNotNull(packetEventsImpl.createPacket(new Parcel_M(),address,address).getPacket());
    }
    @Test
    void getPacketByTrackingNumberTest(){
        createMockPacket();
        assertNotNull(packetEventsImpl.getPacket(trackingNumber).getPacket());
    }
    @Test
    void changeStateTest(){
        createMockPacket();
        assertNotNull(packetEventsImpl.changeState(trackingNumber).getPacket());
    }
    void createMockPacket(){
        packet = new Packet(trackingNumber, new Parcel_M(), address,address,package_state.IN_ZUSTELLUNG);
    }
}
