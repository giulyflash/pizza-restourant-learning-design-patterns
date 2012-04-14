package ukim.finki.ki.pizzaresourant.pizza_menu;

public class PizzaSmall extends PizzaDow {
	
    public double getCost() {
        return PizzaMenu.getInstance().getCost("PizzaSmall");
    }
 
    public String getIngredients() {
        return "Small pizza :";
    }
}
