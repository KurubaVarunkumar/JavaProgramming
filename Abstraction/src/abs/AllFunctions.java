package abs;

public class AllFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 stu=new Student1();
		Book1 book=new Book1("Shakunthala",1000,"Kalidas");
		Car car=new Car("Tata",250000,"Red");
		Bike bike=new Bike("Spender++",70000,"Black");

		System.out.println("Student's Brain color is"+stu.brain.color);
		System.out.println("Student's Brain weight is "+stu.brain.weight);
		System.out.println("Student's heart color is "+stu.heart.color);
		System.out.println("Student's heart weight is "+ stu.heart.weight);
		System.out.println("=============================================");
		System.out.println("Student's bike brand name is "+bike.brand);
		System.out.println("Student's bike color  is "+bike.color);
		System.out.println("Student's bike price  is "+bike.price);
		System.out.println("Student's bike engine bhp is "+bike.engine.bhp);
		System.out.println("Student's bike engine type  is "+bike.engine.type);
		System.out.println("=============================================");
		System.out.println("Student's car brand name is "+car.brand);
		System.out.println("Student's car color is "+car.color);
		System.out.println("Student's car price is "+car.price);
		System.out.println("Student's car engine type is "+car.engine.type);
		System.out.println("Student's car engine Brake Horse Power is "+car.engine.bhp);
		System.out.println("=============================================");

		System.out.println("Student's book author is "+book.author);
		System.out.println("Student's book name is "+book.name);
		System.out.println("Student's book price is "+ book.price);
		System.out.println("=============================================");

		stu.port(bike);
		stu.port(book);
		stu.port(car);
		System.out.println("Student loss all ");
		
		
	}

}
