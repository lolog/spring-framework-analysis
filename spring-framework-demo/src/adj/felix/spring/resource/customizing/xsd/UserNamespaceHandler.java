package adj.felix.spring.resource.customizing.xsd;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class UserNamespaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}
}
