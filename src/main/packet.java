package main;

public class packet {
    String id;
    package_Category packageCategory;
    address sender;
    address receiver;
    package_state state;

    public packet(String id, package_Category packageCategory, address sender, address receiver, package_state state) {
        this.id = id;
        this.packageCategory = packageCategory;
        this.sender = sender;
        this.receiver = receiver;
        this.state = state;
    }
}