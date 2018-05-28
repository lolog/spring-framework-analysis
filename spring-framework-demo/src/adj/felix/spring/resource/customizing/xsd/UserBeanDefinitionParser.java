package adj.felix.spring.resource.customizing.xsd;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

import adj.felix.spring.resource.Pojo;

public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
	@Override
	protected Class<?> getBeanClass(Element element) {
		return Pojo.class;
	}
	
	protected void doParse(Element element, BeanDefinitionBuilder bean) {
		String name = element.getAttribute("name");
		String age = element.getAttribute("age");
		
		if(StringUtils.hasText(name)) {
			bean.addPropertyValue("name", name);
		}
		if(StringUtils.hasText(age)) {
			bean.addPropertyValue("age", Integer.parseInt(age));
		}
	}
}
