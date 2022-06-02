package test;

import main.classes.Address;
import main.classes.Packet;
import main.classes.packageCategory.Parcel_M;
import main.enums.package_state;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PacketClassTest {
    private Packet packet;
    Address address1 = new Address("Max","Mustermann","85570","Markt Schwaben","Schillerstraße","43");
    Address address2 = new Address("Silvia","Musterfrau", "75045", "Walzbachtal", "Forstweg", "9a");


    @BeforeEach
    public void prepareTest(){
        packet = new Packet("cec70e16-5a5e-4708-8ada-c57f0dc1519e", new Parcel_M(),address1,address2, package_state.ANGEKÜNDIGT);
    }
    @Test
    public void getIdTest(){
        assertEquals("cec70e16-5a5e-4708-8ada-c57f0dc1519e",packet.getId());
    }
}
