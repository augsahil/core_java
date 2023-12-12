package animal.fish;

import animal.Animal;
public class Fish extends Animal {
    protected boolean waterBone;
    protected boolean gills;

    public Fish() {
        this.heightInFeet = 15.0F;
        this.weightInKilos = 120.0F;
        this.animalType = "fish";
        this.bloodType = "Cold";
        this.waterBone = true;
        this.gills = true;
    }

    public String showInfo() {
        return "Fish [waterBone=" + this.waterBone + ", gills=" + this.gills + ", heightInFeet=" + this.heightInFeet + ", weightInKilos=" + this.weightInKilos + ", animalType=" + this.animalType + ", bloodType=" + this.bloodType + "]";
    }
}