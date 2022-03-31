import java.util.Locale;



class Dish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;
    static int totalDishes = 0;
    private int id = 0;

    //Constructors:
    public Dish() {
    totalDishes++;
    id = totalDishes;
    }

    public Dish(int costInCents, String nameOfDish, boolean wouldRecommend){
        this();
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }


    //Setters:
    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public static void setTotalDishes(int totalDishes) {
        Dish.totalDishes = totalDishes;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Getters:
    public int getCostInCents() {
        return costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public static int getTotalDishes() {
        return totalDishes;
    }

    public int getId() {
        return id;
    }

    public void printSummary(){
        System.out.printf("""
                Dish #%s
                Cost: %s
                Name: %s
                Recommended: %s
                ------------------
                """, id, costInCents, nameOfDish, wouldRecommend);
    }

}

public class DishTest {
    public static void main(String[] args) {

        Dish dish1 = new Dish(10, "Yum", true);

        Dish dish2 = new Dish(13_001, "Not Yum", false);


        dish1.printSummary();
        dish2.printSummary();
        DishTools.shoutDishName(dish1);
        DishTools.analyzeDishCost(dish1);
        DishTools.analyzeDishCost(dish2);
        DishTools.flipRecommendation(dish1);

    }

}

class DishTools{

    public static final int AVG_COST_OF_DISH = 13_000;

    public static void shoutDishName(Dish dish){
        System.out.println(dish.getNameOfDish().toUpperCase(Locale.ROOT));
    }

    public static void analyzeDishCost(Dish dish){
        int cost = dish.getCostInCents();
        if (cost > AVG_COST_OF_DISH){
            System.out.println("More expensive that average");
        } else {
            System.out.println("Less expensive than average");
        }
    }

    public static void flipRecommendation(Dish dish){
        boolean yum = dish.isWouldRecommend();
        System.out.println(!yum);
    }

}