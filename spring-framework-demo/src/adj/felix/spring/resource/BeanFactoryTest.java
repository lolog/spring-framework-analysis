package adj.felix.spring.resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class BeanFactoryTest {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("app.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		String jo = beanFactory.getBean("jo", String.class);
		System.out.println(jo);
		
		Pojo pojo = beanFactory.getBean("pojo", Pojo.class);
		System.out.println(pojo);
		
		Pojo user = beanFactory.getBean("user", Pojo.class);
		System.out.println(user);
	}
}
