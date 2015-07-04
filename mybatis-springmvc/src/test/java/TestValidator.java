import java.util.Locale;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestValidator {

	@Test
	public void test1() {
		 
		ApplicationContext context 
			= new ClassPathXmlApplicationContext("validator.xml");
 
		String name = context.getMessage("customer.name", 
				new Object[] { 28,"http://www.eeee.com" }, Locale.US);
 
		System.out.println("Customer name (English) : " + name);
 
		String namechinese = context.getMessage("customer.name", 
				new Object[] {28, "http://www.eeee.com" }, 
                                        Locale.SIMPLIFIED_CHINESE);
 
		System.out.println("Customer name (Chinese) : " + namechinese);
 
	}


}
