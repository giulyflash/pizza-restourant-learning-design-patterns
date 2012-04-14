package ukim.finki.ki.pizzaresourant.pizza_menu;

public class PizzaMedium extends PizzaDow {

	public double getCost() {
        return PizzaMenu.getInstance().getCost("PizzaMedium");
    }
 
    public String getIngredients() {
        return "Medium pizza :";
    }
    
}
