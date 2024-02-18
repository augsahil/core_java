package animal.reptile;

public class Crocodile extends Reptile {
    public Crocodile() {
        this.egg = "Hard Shelled";
    }

    public String showInfo() {
        return "Reptile [skin=" + this.skin + ", egg=" + this.egg + ", backbone=" + this.backbone + ", heightInFeet=" + this.heightInFeet + ", weightInKilos=" + this.weightInKilos + ", animalType=" + this.animalType + ", bloodType=" + this.bloodType + "]";
    }
}
