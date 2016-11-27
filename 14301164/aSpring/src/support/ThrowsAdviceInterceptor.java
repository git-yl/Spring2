package support;

import aop.MethodInterceptor;
import aop.ThrowsAdvice;
import framework.MethodInvocation;

public class ThrowsAdviceInterceptor implements MethodInterceptor {

	@SuppressWarnings("unused")
	private ThrowsAdvice advice;
	
	public ThrowsAdviceInterceptor(ThrowsAdvice advice)
	{
		this.advice = advice;
	}
	
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		try {
			Object returnValue = methodInvocation.proceed();
			return returnValue;
		}
		catch (Throwable ex) {
			//We didn`t define our exceptionHandler for special exceptionClass, just simply throw the exception.
			throw ex;
		}
	}

}
