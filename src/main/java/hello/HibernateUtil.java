package hello;

import org.hibernate.SessionFactory; 
import org.hibernate.cfg.Configuration; 
public class HibernateUtil {    
	private static final SessionFactory sessionFactory;    
	static {        
		try {            
			// create the SessionFactory from hibernate.cfg.xml            
			sessionFactory = new Configuration().configure().buildSessionFactory();
			} catch (Throwable e) {            
				// make sure you log the exception, as it might be swallowed
				  System.err.println("Initial SessionFactory creation failed." + e);            
				  throw new ExceptionInInitializerError(e);        
				  }    
		}    
	public static SessionFactory getSessionFactory() {        
		return sessionFactory;    
		}
}
 