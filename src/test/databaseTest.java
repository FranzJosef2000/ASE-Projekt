package test;

import main.classes.Address;
import main.classes.Packet;
import main.enums.package_Category;
import main.enums.package_state;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class databaseTest {
    private ArrayList<Packet> database;
    @BeforeEach
    public void preprocess(){
        database = new ArrayList<Packet>();
        Address address1 = new Address("Max","Mustermann","85570","Markt Schwaben","Schillerstraße","43");
        Address address2 = new Address("Silvia","Musterfrau", "75045", "Walzbachtal", "Forstweg", "9a");
        database.add(new Packet("cec70e16-5a5e-4708-8ada-c57f0dc1519e", package_Category.PARCEL_M,address1,address2, package_state.ANGEKÜNDIGT));
        database.add(new Packet("cec70e16-5a5e-4708-8ada-c57f0dc1518e",package_Category.PARCEL_M,address2,address1,package_state.IN_ZUSTELLUNG));
    }
    @Test
    public void getElementByIdTest(){
        String trackingNumber = "cec70e16-5a5e-4708-8ada-c57f0dc1519e";
        assertNotNull(database.stream().filter(item->trackingNumber.equals(item.getId())).findFirst().orElse(null));
    }
    @Test
    public void addElementTest(){

    }
    @Test
    public void changeValuefromElementTest(){

    }




}
