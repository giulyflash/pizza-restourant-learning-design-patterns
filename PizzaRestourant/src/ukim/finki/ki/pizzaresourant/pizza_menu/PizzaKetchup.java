package ukim.finki.ki.pizzaresourant.pizza_menu;

public class PizzaKetchup extends PizzaExtras {
	
	public PizzaKetchup(Pizza decoratedPizza) {
        super(decoratedPizza);
    }
	
	public double getCost() {
        return super.getCost()+PizzaMenu.getInstance().getCost("PizzaKetchup");
    }
 
    public String getIngredients() {
        return super.getIngredients()+" ketchup,";
    }
    
}
