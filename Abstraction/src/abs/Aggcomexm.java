package abs;

public class Aggcomexm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		System.out.println("Brain color is: "+student.brain.color);
		System.out.println("Brain weigth is: "+student.brain.weight);
		Book book=new Book("Varun",2000);
		
		student=null;
		System.out.println("Student destroyed");
				System.out.println(book.author);
				System.out.println(book.price);
		
	}

}
