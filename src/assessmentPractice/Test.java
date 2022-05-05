package assessmentPractice;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        PetDog rover = new PetDog("Rover", "Labradoodle", true);
        PetDog fido = new PetDog("Fido", "Doberman", true);
        PetDog floofy = new PetDog("Floofy", "Terrier", false);

        System.out.println(fido);

        System.out.println(rover.snuggle());

        System.out.println(rover.isTrained());

        ArrayList<PetDog> dogList = new ArrayList<>();

        dogList.add(rover);
        dogList.add(fido);
        dogList.add(floofy);

        PetDog.allSnuggle(dogList);

    }
}
