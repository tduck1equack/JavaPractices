package Files.OOP.bai3;

public class Dish {
    public String DishName;
    public int Price;
    public String Description;
    public String Ingredients;

    public Dish(String dishName, int price, String description, String ingredients) {
        DishName = dishName;
        Price = price;
        Description = description;
        Ingredients = ingredients;
    }

    public void setDishName(String dishName) {
        DishName = dishName;
    }

    public String getDishName() {
        return DishName;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getPrice() {
        return Price;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDescription() {
        return Description;
    }

    public void setIngredients(String ingredients) {
        Ingredients = ingredients;
    }

    public String getIngredients() {
        return Ingredients;
    }

    public void PrintInfo() {
        System.out.printf("----------------%s----------------\nPrice: $%d\n%s\nMade from %s\n",
                DishName, Price, Description, Ingredients);
    }
}
