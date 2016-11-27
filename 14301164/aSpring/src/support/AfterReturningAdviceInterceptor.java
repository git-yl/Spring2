package support;

import aop.AfterReturningAdvice;
import aop.MethodInterceptor;
import framework.MethodInvocation;

public class AfterReturningAdviceInterceptor implements MethodInterceptor {

	private AfterReturningAdvice advice;
	
	public AfterReturningAdviceInterceptor(AfterReturningAdvice advice)
	{
		this.advice = advice;
	}
	
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		Object returnValue = methodInvocation.proceed();
		advice.afterReturning(returnValue, methodInvocation.getMethod(), methodInvocation.getArguments(), methodInvocation.getThis());
		return returnValue;
	}

}
