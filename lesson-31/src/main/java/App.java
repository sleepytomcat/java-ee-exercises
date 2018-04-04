import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// create application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-classpath.xml");
		// instantiate bean
		Organization org = (Organization) ctx.getBean("organization");
		// call method
		org.slogan();
		// close context
		((ClassPathXmlApplicationContext)ctx).close();
	}
}
