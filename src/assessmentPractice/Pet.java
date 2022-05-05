package assessmentPractice;

import java.util.ArrayList;

class Pet {

    private String name;
    private String type;

    public Pet(){}

    public Pet(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }

    public static void allSnuggle(ArrayList<PetDog> list){
        for(PetDog dog : list){
            System.out.println(dog.snuggle());
        }
    }

}
