package animal.fish;

import animal.Animal;

public class Fish extends Animal {
    protected boolean waterBone, gills;

    public Fish() {
        heightInFeet = 15;
        weightInKilos = 120;
        animalType = "fish";
        bloodType = "Cold";
        this.waterBone = true;
        this.gills = true;
    }
    public String showInfo() {
        return "Fish [waterBone=" + waterBone + ", gills=" + gills + ", heightInFeet=" + heightInFeet + ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
    }
}
