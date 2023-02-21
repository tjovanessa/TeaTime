import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	ArrayList<Tea> teaList = new ArrayList<>();
	
	String id() {
		String ID = "TR";
		
		Integer a, b, c;
		a = rand.nextInt(10);
		ID = ID + a.toString();
		b = rand.nextInt(10);
		ID = ID + b.toString();
		c = rand.nextInt(10);
		ID = ID + c.toString();
		
		System.out.println(ID);
		
		return ID;
	}
	
	double totalprice(int p) {
		int price = p;
		double total = price * 1.1;
		return total;
	}
	
	void viewTea() {
		if (teaList.isEmpty()) {
			System.out.println("NO DATA!");
			System.out.println("=====================================");
			System.out.println("Press Enter to Continue");
			return;
		}
		
		System.out.println("==================================================");
		System.out.println("No   Topping   Sugar   Size   Base Price   Type");
		
		for (int i = 0; i < teaList.size(); i++) {
			System.out.print(i+1 + " ");
			System.out.print(teaList.get(i).getTopping() + " ");
			System.out.print(teaList.get(i).getSugar() + " ");
			System.out.print(teaList.get(i).getSize() + " ");
			System.out.print(teaList.get(i).getPrice() + " ");
			System.out.print(teaList.get(i).getType() + " ");
			System.out.println(" ");
		}
		System.out.println("==================================================");

	}
	
	void addTea() {
		String topping, sugar, size, type;
		int price;
		Integer milk, leave;
		
		System.out.println("Insert New Tea");
		System.out.println("==============");
		
		do {
			System.out.print("Input Topping [Boba | Pudding]: ");
			topping = scan.nextLine();
		} while (!topping.equals("Boba")&&!topping.equals("Pudding"));
		
		do {
			System.out.print("Input Sugar Amount [No Sugar | Half | Normal]: ");
			sugar = scan.nextLine();
		} while (!sugar.equals("No Sugar")&&!sugar.equals("Half")&&!sugar.equals("Normal"));
		
		do {
			System.out.print("Input Size [Regular | Large]: ");
			size = scan.nextLine();
		} while (!size.equals("Regular")&&!size.equals("Large"));
		
		do {
			System.out.print("Input Tea Type [Milk Tea | Green Tea]: ");
			type = scan.nextLine();
		} while (!type.equals("Milk Tea")&&!type.equals("Green Tea"));
		
		do {
			System.out.print("Input Base Price [15000-25000]: ");
			price = scan.nextInt(); scan.nextLine();
		} while (price<15000 || price>25000);
		
		if (type.equals("Milk Tea")) {
			do {
				System.out.print("Input the amount of milk [in ml]: ");
				milk = scan.nextInt(); scan.nextLine();
			} while (type.toString().isEmpty());
			teaList.add(new MilkTea(topping, sugar, size, type, price, milk));
		} else if (type.equals("Green Tea")) {
			do {
				System.out.print("Input the amount of tea leaves [in gr]: ");
				leave = scan.nextInt(); scan.nextLine();
			} while (leave.toString().isEmpty());
			teaList.add(new GreenTea(topping, sugar, size, type, price, leave));
		}
		
	}
	
	void deleteTea() {
		if (teaList.isEmpty()) {
			System.out.println("NO DATA!");
			System.out.println("=====================================");
			System.out.println("Press Enter to Continue");
			return;
		}
		
		System.out.println("==================================================");
		System.out.println("No   Topping   Sugar   Size   Base Price   Type");
		
		for (int i = 0; i < teaList.size(); i++) {
			System.out.print(i+1 + " ");
			System.out.print(teaList.get(i).getTopping() + " ");
			System.out.print(teaList.get(i).getSugar() + " ");
			System.out.print(teaList.get(i).getSize() + " ");
			System.out.print(teaList.get(i).getPrice() + " ");
			System.out.print(teaList.get(i).getType() + " ");
			System.out.println(" ");
		}
		System.out.println("==================================================");

		int del = 0;
		do {
			System.out.print("Choose tea to be removed [1-" + teaList.size() + "]: ");
			del = scan.nextInt(); scan.nextLine();
		} while (del<1 || del>teaList.size());
		
		String toppingTemp = teaList.get(del-1).getTopping();
		String typeTemp = teaList.get(del-1).getType();
		
		teaList.remove(del-1);
		System.out.println(toppingTemp + " " + typeTemp + " haas been removed from the list.");
		System.out.println("Press ENTER to continue");
		
	}
	
	void buy() {
		if (teaList.isEmpty()) {
			System.out.println("NO DATA!");
			System.out.println("=====================================");
			System.out.println("Press Enter to Continue");
			return;
		}
		
		System.out.println("==================================================");
		System.out.println("No   Topping   Sugar   Size   Base Price   Type");
		
		for (int i = 0; i < teaList.size(); i++) {
			System.out.print(i+1 + " ");
			System.out.print(teaList.get(i).getTopping() + " ");
			System.out.print(teaList.get(i).getSugar() + " ");
			System.out.print(teaList.get(i).getSize() + " ");
			System.out.print(teaList.get(i).getPrice() + " ");
			System.out.print(teaList.get(i).getType() + " ");
			System.out.println(" ");
		}
		System.out.println("==================================================");
		
		int buy = 0;
		do {
			System.out.print("Choose tea to be bought [1-" + teaList.size() + "]: ");
			buy = scan.nextInt(); scan.nextLine();
		} while (buy<1 || buy>teaList.size());
		
		String trans = id();
		double tot = totalprice(teaList.get(buy-1).getPrice());
		
		double payment = scan.nextDouble();
		System.out.println("Change: " + (payment-tot));
		
		
		
	}
	
	public Main() {
		// TODO Auto-generated constructor stub
		
		int choose;
		
		do {
			System.out.println("OCHATIME");
			System.out.println("========");
			System.out.println("");
			System.out.println("1. View Tea");
			System.out.println("2. Add New Tea");
			System.out.println("3. Delete Tea");
			System.out.println("4. Buy");
			System.out.print("Choose [1-5]: ");
			
			choose = scan.nextInt(); scan.nextLine();
			
			switch (choose) {
			case 1:
				viewTea();
				break;
			case 2:
				addTea();
				break;
			case 3:
				deleteTea();
				break;
			case 4:
				buy();
				break;
			default:
				break;
			}
		} while(choose!=5);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();

	}

}
