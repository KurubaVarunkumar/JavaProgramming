package Kodnest.com.com.kodnest;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App {
  public static void main(String[] args) {
    
	  User user=new User("456", "Abhaya", "300000", "abhi123", "abhi@abhi.com", "9632147852");
		//create the hibernate configuration
	  Configuration configuration=new Configuration();
	  //configure hibernate.cfg.xml
	  configuration.configure("hibernet.cfg.xml");
	  //create service reqistry
	  StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
	  //build session factory
	  SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	  Session session=sessionFactory.openSession();
	  session.beginTransaction();
	  session.persist(user);
	  session.getTransaction().commit();
	  session.close();
	  

  }
}
