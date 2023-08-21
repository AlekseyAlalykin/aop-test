package com.springaoptest.aoptest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {

    @Pointcut("@annotation(com.springaoptest.aoptest.annotations.LoggableBefore)")
    public void beforeLoggablePointcut(){}

    @Pointcut("@annotation(com.springaoptest.aoptest.annotations.LoggableAfter)")
    public void afterLoggablePointcut(){}

    @Pointcut("@annotation(com.springaoptest.aoptest.annotations.LoggableAround)")
    public void aroundLoggablePointcut(){}

    @Before("beforeLoggablePointcut()")
    public void callBeforeMethod(){
        System.out.println("before");
    }

    @After("afterLoggablePointcut()")
    public void callAfterMethod(){
        System.out.println("after");
    }

    @Around("aroundLoggablePointcut()")
    public void callAroundMethod(ProceedingJoinPoint call){
        System.out.println("around (before method)");
        try {
            call.proceed();
        } catch (Throwable e){
            e.printStackTrace();
        } finally {
            System.out.println("around (after method)");
        }
    }
}
