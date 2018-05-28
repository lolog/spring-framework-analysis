package adj.felix.spring.resource.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PojoFactoryBeanDemo {
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("factory.xml");
		Object bean1 = context.getBean("pojo");
		Object bean2 = context.getBean("&pojo");
		
		System.out.println(bean1.getClass());
		System.out.println(bean2.getClass());
	}
}
