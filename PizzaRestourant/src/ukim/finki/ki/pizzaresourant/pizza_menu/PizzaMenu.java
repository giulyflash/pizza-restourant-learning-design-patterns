package ukim.finki.ki.pizzaresourant.pizza_menu;

import java.util.HashMap;

public class PizzaMenu {
	/**
	 * holds the cost of the different pizza sizes and 
	 * extras that can be added to the pizza
	 */
	private HashMap<String,Double> cost_menu;
	
	/**
	 * part of the singleton pattern
	 * this is the only object instance of this class
	 */
	private static PizzaMenu menu;
	
	
	/**
	 * the class used to retrieve an instance object 
	 * from the class PizzaMenu, this is the only access point for that purpose 
	 */
	public static PizzaMenu getInstance() {
		if ( menu == null ) {
			menu = new PizzaMenu();
		}
		return menu;
	}
	
	/**
	 * a private constructor only to be used for the first creating of the PizzaMenu object
	 */
	private PizzaMenu () {
		cost_menu = new HashMap<String, Double>();
		init();
	}
	
	/**
	 * populates the cost_menu
	 */
	private void  init() {
		cost_menu.put("PizzaSmall", 3.0);
		cost_menu.put("PizzaMedium", 5.0);
		cost_menu.put("PizzaLarge", 7.0);
		
		cost_menu.put("PizzaMushrooms", 2.0);
		cost_menu.put("PizzaSaussage", 1.0);
		cost_menu.put("PizzaKetchup", 0.5);
		cost_menu.put("PizzaCheese", 1.5);
	}

	/**
	 * get the cost given the name of a menu item
	 * @param String string, the name of the menu item 
	 * @return the price of the menu item 
	 */
	public double getCost(String string) {
		if ( ! cost_menu.containsKey(string) ) System.out.println("Error: The field:"+string+"is not present in the cost_map");
		return cost_menu.get(string);
	}

}
