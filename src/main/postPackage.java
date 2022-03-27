package main;

public class postPackage {
    String id;
    package_Category packageCategory;
    address sender;
    address receiver;
    package_state state;

    public postPackage(String id, package_Category packageCategory, address sender, address receiver, package_state state) {
        this.id = id;
        this.packageCategory = packageCategory;
        this.sender = sender;
        this.receiver = receiver;
        this.state = state;
    }
}
