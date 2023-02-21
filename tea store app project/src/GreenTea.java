
public class GreenTea extends Tea {
	
	private int leave;
	
	public GreenTea(String topping, String sugar, String size, String type, int price, int leave) {
		super(topping, sugar, size, type, price);
		this.leave = leave;
	}

	public int getLeave() {
		return leave;
	}

	public void setLeave(int leave) {
		this.leave = leave;
	}

	public GreenTea() {
		// TODO Auto-generated constructor stub
	}

}
