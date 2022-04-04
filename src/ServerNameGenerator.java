import java.util.Random;

public class ServerNameGenerator {

    private static String[] adjectives = {"happy", "sad", "cool", "hot", "lukewarm", "solid", "translucent", "big", "small", "medium"};
    private static String[] nouns = {"dog", "cat", "bird", "lizard", "fish", "pig", "lion", "tree", "rock", "cloud"};


//    public static String getRandom(String[] array) {
//        int random = new Random().nextInt(array.length);
//        return array[random];
//    }

    public static String getRandom(String[] array) {
        return array[(int) Math.ceil(Math.random() * array.length - 1)];
    }

    public static void main(String[] args) {
        System.out.println(getRandom(nouns) + "-" + getRandom(adjectives));
    }

}
