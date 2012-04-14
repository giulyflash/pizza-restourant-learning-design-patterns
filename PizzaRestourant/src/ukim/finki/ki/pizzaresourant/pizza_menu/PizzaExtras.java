package ukim.finki.ki.pizzaresourant.pizza_menu;

public abstract class PizzaExtras extends Pizza  {

	/**
	 * an instance of the pizza as it was before adding the extra from the decorator
	 * note that this pizza may have other extras that were previuosly added
	 */
	protected final Pizza decoratedPizza;
	
	public PizzaExtras(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }
 
    public double getCost() {
        return decoratedPizza.getCost();
    }
 
    public String getIngredients() {
        return decoratedPizza.getIngredients();
    }
	
}
