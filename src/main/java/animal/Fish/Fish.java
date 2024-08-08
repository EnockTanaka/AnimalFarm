package animal.Fish;

import animal.Animals;

public class Fish extends Animals{

    protected boolean waterBone;
    protected boolean gills;

    public Fish() {
        animalType = "fish";
        this.waterBone = true;
        this.gills = true;
    }

    public String showInfo() {
        return "Fish [waterBone=" + waterBone + ", gills=" + gills + ", heightInFeet=" + heightInFeet
                + ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
    }


}
