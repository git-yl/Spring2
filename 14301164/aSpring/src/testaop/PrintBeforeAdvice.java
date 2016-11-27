package testaop;

import java.lang.reflect.Method;

import aop.MethodBeforeAdvice;

public class PrintBeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) {
		System.out.println("The Log Start");
	}

}
