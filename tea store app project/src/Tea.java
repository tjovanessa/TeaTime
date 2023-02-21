
public class Tea {
	
	private String topping, sugar, size, type;
	private int price;
	
	public Tea(String topping, String sugar, String size, String type, int price) {
		super();
		this.topping = topping;
		this.sugar = sugar;
		this.size = size;
		this.type = type;
		this.price = price;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public String getSugar() {
		return sugar;
	}

	public void setSugar(String sugar) {
		this.sugar = sugar;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Tea() {
		// TODO Auto-generated constructor stub
	}

}
