package framework;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import aop.Advisor;
import aop.AfterReturningAdvice;
import aop.MethodBeforeAdvice;
import aop.MethodInterceptor;
import aop.ThrowsAdvice;
import support.AfterReturningAdviceInterceptor;
import support.MethodBeforeAdviceInterceptor;
import support.PointcutAdvisor;
import support.ThrowsAdviceInterceptor;

public class AdvisorChainFactory {
	public List<MethodInterceptor> getInterceptor(AdvisedSupport config, Method method, Class<?> targetClass)
	{
		List<MethodInterceptor> interceptorList = new ArrayList<>();
		for(Advisor advisor : config.getAdvisors())
		{
			PointcutAdvisor pointcutAdvisor = (PointcutAdvisor) advisor;
			if(pointcutAdvisor.getPointcut().getMethodMatcher().matches(method, targetClass))
			{
				if(advisor.getAdvice() instanceof MethodBeforeAdvice)
					interceptorList.add(new MethodBeforeAdviceInterceptor((MethodBeforeAdvice) advisor.getAdvice()));
				else if(advisor.getAdvice() instanceof AfterReturningAdvice)
					interceptorList.add(new AfterReturningAdviceInterceptor((AfterReturningAdvice) advisor.getAdvice()));
				else if(advisor.getAdvice() instanceof ThrowsAdvice)
					interceptorList.add(new ThrowsAdviceInterceptor((ThrowsAdvice) advisor.getAdvice()));
			}
		}
		return interceptorList;
	}
}
