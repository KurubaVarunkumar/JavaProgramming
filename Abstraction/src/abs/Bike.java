package abs;

public class Bike {
	String brand;
	int price;
	String color;
	Engine engine=new Engine("bs6",250);
	public Bike(String brand,int price,String color) {
		// TODO Auto-generated constructor stub
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	
}
