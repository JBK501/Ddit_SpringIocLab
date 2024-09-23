package kr.or.ddit.lab05.objs;

import org.springframework.beans.factory.FactoryBean;

public class StringArrayFactoryBean implements FactoryBean<String[]> {

	@Override
	public String[] getObject() throws Exception {
		return new String[] {"element1","element2","element3"};
	}

	@Override
	public Class<?> getObjectType() {
		return String[].class;
	}
	
}
