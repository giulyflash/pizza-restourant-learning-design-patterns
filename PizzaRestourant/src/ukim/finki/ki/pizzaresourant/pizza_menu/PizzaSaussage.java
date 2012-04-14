package ukim.finki.ki.pizzaresourant.pizza_menu;

public class PizzaSaussage extends PizzaExtras {
	
	public PizzaSaussage(Pizza decoratedPizza) {
        super(decoratedPizza);
    }
	
	public double getCost() {
        return super.getCost()+PizzaMenu.getInstance().getCost("PizzaSaussage");
    }
 
    public String getIngredients() {
        return super.getIngredients()+" saussage,";
    }
}
