package assessmentPractice;

import java.util.ArrayList;

public class PetDog extends Pet implements Companion {
    private boolean trained;

    PetDog(){}

    PetDog(String name, String type, boolean trained){
        super(name, type);
        this.trained = trained;
    }

    public boolean isTrained() {
        return trained;
    }


    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    @Override
    public String snuggle() {
        return this.getName() + " wants to struggle.";
    }

}
