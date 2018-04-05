import beans.City;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// create application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-classpath.xml");

		// instantiate beans and print city names		
		City city = (City) ctx.getBean("city-san-francisco");
		System.out.println(city);
		
		// close context
		((ClassPathXmlApplicationContext)ctx).close();
	}
}
