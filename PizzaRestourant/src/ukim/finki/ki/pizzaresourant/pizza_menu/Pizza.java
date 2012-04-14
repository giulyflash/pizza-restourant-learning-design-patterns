package ukim.finki.ki.pizzaresourant.pizza_menu;

/**
 * The Pizza Class defines the functionality of Coffee implemented by decorator
 * @author Andrej Gajduk
 */
public abstract class Pizza {
	
	 /**
	 * returns the cost of the pizza
	 */
	 public abstract double getCost();
	 
	 /**
	  * returns the ingredients of the pizza
	  */
	 public abstract String getIngredients(); 
}
