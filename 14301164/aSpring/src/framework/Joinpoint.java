package framework;

public interface Joinpoint {
	Object proceed() throws Throwable;
	Object getThis();
}
