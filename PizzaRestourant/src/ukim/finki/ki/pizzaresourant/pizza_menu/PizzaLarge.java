package ukim.finki.ki.pizzaresourant.pizza_menu;

public class PizzaLarge extends PizzaDow {
	
	public double getCost() {
        return PizzaMenu.getInstance().getCost("PizzaLarge");
    }
 
    public String getIngredients() {
        return "Large pizza :";
    }
}
