public class Main {
    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.alcoholic = false;
        drink.name = "Strawberry Smoothie";
        drink.price = 12;

        drink.ingredient1 = new Ingredients();
        drink.ingredient1.name = "Strawberry";
        drink.ingredient1.amount = 3;
        drink.ingredient2 = new Ingredients();
        drink.ingredient2.name = "Banana";
        drink.ingredient2.amount = 1;
        drink.ingredient3 = new Ingredients();
        drink.ingredient3.name = "Cup of Milk";
        drink.ingredient3.amount = 1;

        int volume = drink.ingredient1.amount + drink.ingredient2.amount + drink.ingredient3.amount;

        System.out.println("Name: " + drink.name + "\nAlcoholic: " + drink.alcoholic + "\nPrice: " + drink.price);
        System.out.println("Volume: " + volume  + "\n");
        System.out.println("Ingredients:\n" + drink.ingredient1.name + ": " + drink.ingredient1.amount);
        System.out.println(drink.ingredient2.name + ": " + drink.ingredient2.amount);
        System.out.println(drink.ingredient3.name + ": " + drink.ingredient3.amount);
    }
}
