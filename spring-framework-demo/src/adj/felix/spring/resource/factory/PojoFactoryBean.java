package adj.felix.spring.resource.factory;

import org.springframework.beans.factory.FactoryBean;

import adj.felix.spring.resource.Pojo;

public class PojoFactoryBean implements FactoryBean<Pojo>{
	private String info;
	@Override
	public Pojo getObject() throws Exception {
		String[] infos = info.split(",");
		
		Pojo pojo = new Pojo();
		pojo.setName(infos[0]);
		pojo.setAge(Integer.parseInt(infos[1]));
		
		return pojo;
	}

	@Override
	public Class<?> getObjectType() {
		return Pojo.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
	
	public void setInfo(String info) {
		this.info = info;
	}
}
