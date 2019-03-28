
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // add the methods here
    public void addMeal(String meal) {
        if (meals.contains(meal)) {
        }else {
        meals.add(meal);}
    }
    public void printMeals() {
        int size = meals.size();
        for (int i=0;i<size;i++)
        System.out.println(meals.get(i));
    }
    public void clearMenu() {
        meals.clear();
    }
}
