package main.classes;

import main.package_Category;
import main.package_state;

public class Packet {
    String id;
    package_Category packageCategory;
    Address sender;
    Address receiver;
    package_state state;

    public Packet(String id, package_Category packageCategory, Address sender, Address receiver, package_state state) {
        this.id = id;
        this.packageCategory = packageCategory;
        this.sender = sender;
        this.receiver = receiver;
        this.state = state;
    }
    public String getId(){
        return this.id;
    }

    public void changeState(package_state state){
        this.state = state;
    }

    public package_state getState(){
        return this.state;
    }
}
