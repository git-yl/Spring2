package support;

import java.lang.reflect.Method;

import aop.MethodMatcher;

public abstract class StaticMethodMatcher implements MethodMatcher {
	public boolean mathces(Method method, Class<?> targetClass, Object... args)
	{
		throw new UnsupportedOperationException("Illegal MethodMatcher usage");
	}
	public boolean isRuntime()
	{
		return false;
	}
}
