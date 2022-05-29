package main.enums;

public enum package_Category {
    PARCEL_S("Päckchen S 2 kg", "bis 45 x 25 x 10 cm", 3.79),
    PARCEL_M("Päckchen M 2 kg", "bis 60 x 30 x 15 cm", 4.39),
    DHLPACKAGE2KG("DHL Paket 2 kg", "bis 60 x 30 x 15 cm", 4.99),
    DHLPACKAGE5KG("DHL Paket 5 kg", "bis 120 x 60 x 60 cm", 5.99),
    DHLPACKAGE10KG("DHL Paket 10 kg", "bis 120 x 60 x 60 cm", 8.49),
    DHLPACKAGE31KG("DHL Paket 31,5 kg", "bis 120 x 60 x 60 cm", 16.49);

    private String description;
    private String volumeDescription;
    private double price;

    private package_Category(String description, String volumeDescription, double price){
        this.description = description;
        this.volumeDescription = volumeDescription;
        this.price = price;
    }

    public String getDescription(){
        return description;
    }
    public String getVolumeDescription(){
        return volumeDescription;
    }
    public double getPrice(){
        return price;
    }


}
