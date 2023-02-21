
public class MilkTea extends Tea {
	
	private int milk;

	public MilkTea(String topping, String sugar, String size, String type, int price, int milk) {
		super(topping, sugar, size, type, price);
		this.milk = milk;
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

	public MilkTea() {
		// TODO Auto-generated constructor stub
	}

}
