package support;

import aop.ClassFilter;
import aop.MethodMatcher;
import aop.Pointcut;

public abstract class StaticMethodMatcherPointcut extends StaticMethodMatcher implements Pointcut {
	
	private ClassFilter classFilter;
	
	@Override
	public ClassFilter getClassFilter() {
		return classFilter;
	}
	public void setClassFilter(ClassFilter classFilter) {
		this.classFilter = classFilter;
	}
	
	@Override
	public MethodMatcher getMethodMatcher() {
		return this;
	}
}
