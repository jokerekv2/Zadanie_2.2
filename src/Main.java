public class Main {
    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.alcoholic = false;
        drink.name = "Strawberry Smoothie";
        drink.price = 12;

        drink.ingredient1 = new Ingredients();
        drink.ingredient1.name = "Strawberry";
        drink.ingredient1.amt = 3;
        drink.ingredient2 = new Ingredients();
        drink.ingredient2.name = "Banana";
        drink.ingredient2.amt = 1;
        drink.ingredient3 = new Ingredients();
        drink.ingredient3.name = "Cup of Milk";
        drink.ingredient3.amt = 1;

        int volume = drink.ingredient1.amt + drink.ingredient2.amt + drink.ingredient3.amt;

        System.out.println("Name: " + drink.name + "\nAlcoholic: " + drink.alcoholic + "\nPrice: " + drink.price);
        System.out.println("Volume: " + volume  + "\n");
        System.out.println("Ingredients:\n" + drink.ingredient1.name + ": " + drink.ingredient1.amt);
        System.out.println(drink.ingredient2.name + ": " + drink.ingredient2.amt);
        System.out.println(drink.ingredient3.name + ": " + drink.ingredient3.amt);
    }
}
