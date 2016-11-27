package framework;

import java.lang.reflect.Method;

public interface MethodInvocation extends Joinpoint{
	Method getMethod();
	Object[] getArguments();
}
