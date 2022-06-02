package main.classes.packageCategory;

public class PackageCategoryFactory {
    public PackageCategory makePackageCategory(String newPackageCategory){

        if (newPackageCategory.equalsIgnoreCase("Parcel_S")){
            return new Parcel_S();
        }
        else if (newPackageCategory.equalsIgnoreCase("Parcel_M")){
            return new Parcel_M();
        }
        else if (newPackageCategory.equalsIgnoreCase("DHLPackage2kg")){
            return new DHLPackage2Kg();
        }
        else if (newPackageCategory.equalsIgnoreCase("DHLPackage5kg")){
            return new DHLPackage5Kg();
        }
        else if (newPackageCategory.equalsIgnoreCase("DHLPackage10kg")){
            return new DHLPackage10Kg();
        }
        else if (newPackageCategory.equalsIgnoreCase("DHLPackage31kg")){
            return new DHLPackage31Kg();
        }
        else return null;
    }
}
