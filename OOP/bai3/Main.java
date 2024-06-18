package Files.OOP.bai3;

public class Main {
    public static void main(String[] args) {
        Dish spaghetti = new Dish("Spaghetti",
                3,
                "True Italian classic",
                "Wheat pasta, bolognese sauce and tomato");
        spaghetti.PrintInfo();
        spaghetti.setDishName("Lasagna");
        spaghetti.setPrice(5);
        spaghetti.setDescription("Another Italian classic, multiple pastas layered between minced beef and cheese");
        spaghetti.setIngredients("Wheat pasta, beef, Roman tomatoes and Parmesana cheese wheels");
        System.out.println(spaghetti.getDishName() + " " + spaghetti.getPrice() + " " + spaghetti.getDescription() + " " + spaghetti.getIngredients());
        spaghetti.PrintInfo();
    }
}
