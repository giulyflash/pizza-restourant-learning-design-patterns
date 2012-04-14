package ukim.finki.ki.pizzaresourant.pizza_menu;

public class PizzaCheese extends PizzaExtras {
	
	public PizzaCheese(Pizza decoratedPizza) {
        super(decoratedPizza);
    }
	
	public double getCost() {
        return super.getCost()+PizzaMenu.getInstance().getCost("PizzaCheese");
    }
 
    public String getIngredients() {
        return super.getIngredients()+" cheese,";
    }
    
}
