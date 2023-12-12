package animal.reptile;


import animal.Animal;

public class Reptile extends Animal {
    protected String skin;
    protected String egg;
    protected boolean backbone;

    public Reptile() {
        this.heightInFeet = 5.0F;
        this.weightInKilos = 20.0F;
        this.animalType = "Reptile";
        this.bloodType = "Cold";
        this.skin = "Dry Skin";
        this.backbone = true;
        this.egg = "soft shelled";
    }

    public String showInfo() {
        return "Reptile [skin=" + this.skin + ", egg=" + this.egg + ", backbone=" + this.backbone + ", heightInFeet=" + this.heightInFeet + ", weightInKilos=" + this.weightInKilos + ", animalType=" + this.animalType + ", bloodType=" + this.bloodType + "]";
    }
}
