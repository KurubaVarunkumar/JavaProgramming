package Kodnest.com.com.HibernateRead;

public class App {
  public static void main(String[] args) {
	  Configuration configuration=new Configuraton();
	  SessionFactory sessionFactory=configuration.bulidSession
	  Session session=sessionFactory.openSession();
	  session.beginTransaction();
	  String id="789";
	  Employee obj=(Employee)session.get(Employee.class,id);
	  System.out.println(obj);
	  session.getTransaction().commit();
	  session.close();
	  
    
  }
}
