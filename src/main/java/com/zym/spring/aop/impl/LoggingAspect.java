package com.zym.spring.aop.impl;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	@Before("execution(* com.zym.spring.aop.impl.ArithmeticCalculator.*(..))")
	public void beforeMethod(JoinPoint joinpoint) {
		String methodName = joinpoint.getSignature().getName();
		System.out.println("beforeMethod:" + methodName + ":" + Arrays.toString(joinpoint.getArgs()));
	}

	@After("execution(* com.zym.spring.aop.impl.ArithmeticCalculator.*(..)))")
	public void afterMethod(JoinPoint joinPoint) {
		String mString = joinPoint.getSignature().getName();
		System.out.println("afterMethod:" + mString + ":" + Arrays.toString(joinPoint.getArgs()) + ":"
				+ joinPoint.getSignature().getDeclaringTypeName());
	}
	@AfterReturning("execution(* com.zym.spring.aop.impl.ArithmeticCalculator.*(..)))")
	public void afterRuingMethod(JoinPoint joinPoint) {
		String mString = joinPoint.getSignature().getName();
		System.out.println("afterRuingMethod:" + mString + ":" + Arrays.toString(joinPoint.getArgs()) + ":"
				+ joinPoint.getSignature().getDeclaringTypeName());
	}
}
