import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// create application context
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		// instantiate bean
		Organization org = (Organization) ctx.getBean("organization");
		// call method
		org.slogan();
		// close context
		((FileSystemXmlApplicationContext)ctx).close();
	}

}
