import beans.City;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// create application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-classpath.xml");

		// instantiate beans and print city names
		City city_a = (City) ctx.getBean("city"); // unnamed city
		System.out.println(city_a);
		
		City city_b = (City) ctx.getBean("city-san-francisco"); // name pre-defined through constructor parameters
		System.out.println(city_b);
		
		City city_c = (City) ctx.getBean("city-san-francisco-alias-1"); // using alias to instantiate same bean
		System.out.println(city_c);
		
		City city_d = (City) ctx.getBean("city-san-francisco-alias-2"); // another alias for same bean
		System.out.println(city_d);

		City city_e = (City) ctx.getBean("city-san-francisco-alias-3"); // another alias for same bean
		System.out.println(city_e);
		
		// close context
		((ClassPathXmlApplicationContext)ctx).close();
	}
}
