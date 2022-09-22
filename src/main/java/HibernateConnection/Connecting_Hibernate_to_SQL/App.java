package HibernateConnection.Connecting_Hibernate_to_SQL;

/**
 * Hello world!
 *
 */
import java.util.Date;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
 
import HibernateConnection.Connecting_Hibernate_to_SQL.HibernateUtil;
@SuppressWarnings("unused")
public class App 
{
    public static void main( String[] args ) {
    	//Create the student object.
    	Users user = new Users();
 
    	//Setting the object properties.
    	user.setUserName("kadyan");
    	user.setPassword("Raaj");
    	user.setCreateDate(new Date());
    	user.setModifyDate(new Date());
    	user.setCreateUser("KADYAN");
    	user.setModifyUser("rajeshsinghkadyan@gmail.com");
    	user.setMob("8168481271");
    	Transaction tx = null;
    	//Get the session object.
    	Session session = HibernateUtil.getSessionFactory().openSession();
    	try{
              //Start hibernate session.
    	      tx = session.beginTransaction();
 
              //Insert a new student record in the database.
    	      session.save(user); 
 
              //Commit hibernate transaction if no exception occurs.
    	      tx.commit();
    	      System.out.println("Saved Successfully.");
    	  }catch (HibernateException e) {
    	     if(tx!=null){
                 //Roll back if any exception occurs. 
    	         tx.rollback();
    	     }
    	     e.printStackTrace(); 
    	  }finally {
             //Close hibernate session.
    	     session.close(); 
    	  }
    }
}
