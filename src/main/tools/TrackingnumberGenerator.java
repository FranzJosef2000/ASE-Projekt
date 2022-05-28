package main.tools;

import java.util.UUID;

public class TrackingnumberGenerator {
    public static String generateTrackingNumber(){
        return UUID.randomUUID().toString();
    }
}
