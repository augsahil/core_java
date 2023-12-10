package animal.fish;

public class Eel extends Fish {
    private String special;

    public Eel(){
        this.special = "Release electric stock";
    }
    public String showInfo() {
        return "Fish [special=" + special +", waterBone=" + waterBone + ", gills=" + gills + ", heightInFeet=" + heightInFeet + ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
    }
}
