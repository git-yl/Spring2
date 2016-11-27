package framework;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import aop.Advisor;
import support.TargetSource;

public class AdvisedSupport {
	private TargetSource targetSource;
	
	private Class<?> interfaces;
	
	private List<Advisor> advisors = new LinkedList<>();
	
	public TargetSource getTargetSource() {
		return targetSource;
	}
	public void setTargetSource(TargetSource targetSource) {
		this.targetSource = targetSource;
	}
	public void setTarget(Object target) {
		this.targetSource = new TargetSource(target);
	}
	
	public Class<?> getInterfaces() {
		return interfaces;
	}
	public void setInterfaces(Class<?> interfaces) {
		this.interfaces = interfaces;
	}
	public List<Advisor> getAdvisors() {
		return advisors;
	}
	public void addAdvisor(Advisor advisor) {
		this.advisors.add(advisor);
	}
	public void addAdvisors(Collection<Advisor> advisors)
	{
		this.advisors.addAll(advisors);
	}
}
