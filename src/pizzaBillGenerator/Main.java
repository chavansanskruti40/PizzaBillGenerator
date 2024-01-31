package pizzaBillGenerator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  	Pizza basepizza = new Pizza(true);
		basepizza.getPizzaPrice();
		
		basepizza.addExtraCheese();
		basepizza.addExtraToppings();
		basepizza.takeAway();
		basepizza.getBill();
		
		
//		DeluxPizza dp=new DeluxPizza(false);
//		//dp.addExtraCheese();
//		//dp.addExtraToppings();
//		dp.takeAway();
//		dp.getBill();

	}
}
