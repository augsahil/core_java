package animal.fish;

public class Eel extends Fish {
    private String special = "Release electric stock";

    public Eel() {
    }

    public String showInfo() {
        return "Fish [special=" + this.special + ", waterBone=" + this.waterBone + ", gills=" + this.gills + ", heightInFeet=" + this.heightInFeet + ", weightInKilos=" + this.weightInKilos + ", animalType=" + this.animalType + ", bloodType=" + this.bloodType + "]";
    }
}