package support;

import aop.Advisor;
import aop.Pointcut;

public interface PointcutAdvisor extends Advisor {
	Pointcut getPointcut();
}
