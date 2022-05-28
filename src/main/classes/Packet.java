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

    public void changeState(){
        if (this.state.equals(package_state.ANGEKÜNDIGT))this.state=package_state.IM_LANDESVERTEILZENTRUM;
        else if (this.state.equals(package_state.IM_LANDESVERTEILZENTRUM))this.state=package_state.IM_LOCALTENVERTEILTENTRUM;
        else if (this.state.equals(package_state.IM_LOCALTENVERTEILTENTRUM))this.state=package_state.IN_ZUSTELLUNG;
        else if (this.state.equals(package_state.IN_ZUSTELLUNG))this.state=package_state.ZUGESTELLT;
    }

    public package_state getState(){
        return this.state;
    }
}
