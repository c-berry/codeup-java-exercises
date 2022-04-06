package monsters;

import java.util.*;

public class CollectionsLecture {

    public static void main(String[] args) {
        ArrayList<Monster> monsterList = new ArrayList<>();

        Monster orc = new Monster("Orc", 13, 15, 9);
        monsterList.add(orc);
//        System.out.println(monsterList.size());
        Monster ogre = new Monster("Ogre", 11, 59, 13);
        monsterList.add(ogre);
        Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);
        monsterList.add(blueDragon);
//        System.out.println(monsterList.size());
//
//        monsterList.remove(blueDragon);
//        System.out.println(monsterList.size());
//        monsterList.remove(1);
//        System.out.println(monsterList.size());

        //only possible because of toString method =>
//        System.out.println(monsterList);

        for (int i = 0; i < monsterList.size(); i++) {
//            System.out.println(monsterList.get(i));

            String name = monsterList.get(i).getName();
            int damage = monsterList.get(i).getDamage();
            int hitPoints = monsterList.get(i).getHitPoints();
//            System.out.printf("The %s does %d damage and has %d hit points\n", name, damage, hitPoints);
        }
            //or this way:
//            for (Monster monster : monsterList) {
////            System.out.println(monsterList.get(i));
//
//                String name = monster.getName();
//                int damage = monster.getDamage();
//                int hitPoints = monster.getHitPoints();
//                System.out.printf("The %s does %d damage and has %d hit points\n", name, damage, hitPoints);
//        }

        ArrayList<Integer>  myNumbers = new ArrayList<>();
        myNumbers.add(10);
        myNumbers.add(20);
        myNumbers.add(30);
//        System.out.println(myNumbers);
        Collections.sort(myNumbers);

//        Create 3 Person objects. Create an ArrayList that holds persons. Add the persons to the ArrayList. Iterate over the ArrayList either with a for loop or an enhanced for loop, printing out to the console each person's name:
        class Person {

            String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
            public Person(String name){
                this.name = name;

            }
        }

        Person moe = new Person("Moe");
        Person joe = new Person("Joe");
        Person roy = new Person("Roy");

        ArrayList<Person> people = new ArrayList<>();
        people.add(moe);
        people.add(joe);
        people.add(roy);

//        for(Person person : people){
//            System.out.println(person.getName());
//        }

        HashMap<String, Integer> careerWins = new HashMap<>();
        //the names here refer to the keys:
        careerWins.put("Gregg Popovich", 1341);
        careerWins.put("Don Nelsom", 1335);
        careerWins.put("Lenny Wilkens", 1332);

        System.out.println(careerWins.get("Gregg Popovich"));
//        System.out.println(careerWins);

        careerWins.replace("Gregg Popovich", 2000);
//        System.out.println(careerWins);

//        for (Map.Entry<String, Integer> careerWinsEntry : careerWins.entrySet()){
//            System.out.println(careerWinsEntry.getKey() + " " + careerWinsEntry.getValue());
//        }
//
//        Set<String> coachNames = careerWins.keySet();
//        for (String coachName : coachNames){
//            System.out.println(coachName);
//        }


    }
}