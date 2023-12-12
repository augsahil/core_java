package animal;

public class Animal {
    protected float heightInFeet = 0.0F;
    protected float weightInKilos = 0.0F;
    protected String animalType = "Unknown";
    protected String bloodType = "Unknown";

    public Animal() {
    }

    public String showInfo() {
        return "Animal [heightInFeet=" + this.heightInFeet + ", weightInKilos=" + this.weightInKilos + ", animalType=" + this.animalType + ", bloodType=" + this.bloodType + "]";
    }
}

