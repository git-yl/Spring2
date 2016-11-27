package framework;

import aop.Advice;
import support.NameMatchMethodPointcutAdvisor;
import support.aAdvisor;


public class ProxyFactoryBean {

	private String proxyInterfaces;
	private Object target;
	private Object interceptorNames;
	public String getProxyInterfaces() {
		return proxyInterfaces;
	}
	public void setProxyInterfaces(String proxyInterfaces) {
		this.proxyInterfaces = proxyInterfaces;
	}
	public Object getTarget() {
		return target;
	}
	public void setTarget(Object target) {
		this.target = target;
	}
	public Object getInterceptorNames() {
		return interceptorNames;
	}
	public void setInterceptorNames(Object interceptorNames) {
		this.interceptorNames = interceptorNames;
	}
	
	public Object getObject() {
		// TODO Auto-generated method stub
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(this.target);
		try {
			proxyFactory.setInterfaces(Class.forName(proxyInterfaces));
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		aAdvisor a = (aAdvisor) interceptorNames;
		NameMatchMethodPointcutAdvisor advisor = new NameMatchMethodPointcutAdvisor();
		advisor.setMappedName(a.getMappedName());
		advisor.setAdvice((Advice)a.getAdvice());
		proxyFactory.addAdvisor(advisor);
		
		return proxyFactory.getProxy();
	}
}
