package animal.reptile;

public class Crocodile extends Reptile {
    public Crocodile(){
        super();
        egg = "Hard Shelled";
    }
    public String showInfo() {
        return "Reptile [skin=" + skin + ", egg=" + egg + ", backbone=" + backbone + ", heightInFeet=" + heightInFeet + ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
    }
}
