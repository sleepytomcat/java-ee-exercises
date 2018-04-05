import beans.City;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// create application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-classpath.xml");

		// instantiate beans and print city names		
		City cityXml = (City) ctx.getBean("city-san-francisco-xml");
		City cityJson = (City) ctx.getBean("city-san-francisco-json");
		System.out.println(cityXml);
		System.out.println(cityJson);
		
		// close context
		((ClassPathXmlApplicationContext)ctx).close();
	}
}
