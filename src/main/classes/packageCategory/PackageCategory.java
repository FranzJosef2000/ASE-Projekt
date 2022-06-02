package main.classes.packageCategory;

public abstract class PackageCategory {
    private String description;
    private String volumeDescription;
    private double price;

    public String getDescription(){
        return description;
    }
    public String getVolumeDescription(){
        return volumeDescription;
    }
    public double getPrice(){
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setVolumeDescription(String volumeDescription) {
        this.volumeDescription = volumeDescription;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
