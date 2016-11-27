package support;

import aop.MethodBeforeAdvice;
import aop.MethodInterceptor;
import framework.MethodInvocation;

public class MethodBeforeAdviceInterceptor implements MethodInterceptor {

	private MethodBeforeAdvice advice;
	
	public MethodBeforeAdviceInterceptor(MethodBeforeAdvice advice)
	{
		this.advice = advice;
	}
	
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		advice.before(methodInvocation.getMethod(), methodInvocation.getArguments(), methodInvocation.getThis());
		return methodInvocation.proceed();
	}

}
