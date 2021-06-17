import java.util.logging.*;

public class App {

	private final static Logger LOGGER = Logger.getLogger(Logger.class.getName());
	
	public final static void main(String[] args) {
		
		UserFalsePos user1 = new UserFalsePos("username1", "email1@email.com", "password1");
		UserTruePos user2 = new UserTruePos("username2", "email2@email.com", "password2");
		
		LOGGER.info(user1.toString());
		LOGGER.info(user2.toString());
		
		System.out.println(user1);
		System.out.println(user2);

	}
}
