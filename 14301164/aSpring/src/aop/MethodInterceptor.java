package aop;

import framework.MethodInvocation;

public interface MethodInterceptor {
	Object invoke(MethodInvocation methodInvocation) throws Throwable;
}
