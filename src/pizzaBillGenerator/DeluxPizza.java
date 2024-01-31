package pizzaBillGenerator;

public class DeluxPizza extends Pizza{

	public DeluxPizza(boolean veg) {
		super(veg);
		// TODO Auto-generated constructor stub
		super.addExtraCheese();
		super.addExtraToppings();
	}

	@Override
	public void addExtraCheese() {}
	
	
	@Override
	public void addExtraToppings() {}

}
