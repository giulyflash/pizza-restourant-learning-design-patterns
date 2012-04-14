package ukim.finki.ki.pizzaresourant.client;
import ukim.finki.ki.pizzaresourant.pizza_menu.*;
/**
 * Class used to display the application's utility
 * @author Andrej Gajduk
 *
 */
public class Client {

	public static void main(String[] args) {
		Pizza pizza_small = new PizzaSmall();
		System.out.println("The price of a "+ pizza_small.getIngredients() +" is "+pizza_small.getCost()+".");
		Pizza pizza_large = new PizzaLarge();
		System.out.println("The price of a "+ pizza_large.getIngredients() +" is "+pizza_large.getCost()+".");
		pizza_small = new PizzaKetchup(pizza_small);
		pizza_small = new PizzaCheese(pizza_small);
		System.out.println("The price of a "+ pizza_small.getIngredients() +" is "+pizza_small.getCost()+".");
		pizza_large = new PizzaCheese(pizza_large);
		pizza_large = new PizzaKetchup(pizza_large);
		pizza_large = new PizzaSaussage(pizza_large);
		pizza_large = new PizzaCheese(pizza_large);
		System.out.println("The price of a "+ pizza_large.getIngredients() +" is "+pizza_large.getCost()+".");
	}

}
