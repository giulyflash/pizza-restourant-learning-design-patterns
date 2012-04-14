package ukim.finki.ki.pizzaresourant.pizza_menu;

public class PizzaMushrooms extends PizzaExtras {
	
	public PizzaMushrooms(Pizza decoratedPizza) {
        super(decoratedPizza);
    }
	
	public double getCost() {
        return super.getCost()+PizzaMenu.getInstance().getCost("PizzaMushrooms");
    }
 
    public String getIngredients() {
        return super.getIngredients()+" mushrooms,";
    }
    
}
