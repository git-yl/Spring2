package testaop;

import factory.ApplicationContext;
import factory.ClassPathXmlApplicationContext;
import framework.ProxyFactoryBean;

public class AopTestMain {
	public static void main(String[] args) {
		String[] locations = {"aop.xml"};
        ApplicationContext ac = new ClassPathXmlApplicationContext(locations);
        ProxyFactoryBean pfb=(ProxyFactoryBean) ac.getBean("foo");
	    FooInterface foo = (FooInterface)pfb.getObject();
	    foo.printFoo();
	    foo.dummyFoo();
	}
}
