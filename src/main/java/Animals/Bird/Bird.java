package Animals.Bird;

import Animals.Animals;

public class Bird extends Animals {
    protected Boolean feather;
    protected Boolean canFly;

    public Bird(){
        this.feather = true;
        this.canFly = true;
        this.setName("Bird");
    }
}

