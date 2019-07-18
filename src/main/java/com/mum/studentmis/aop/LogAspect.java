package com.mum.studentmis.aop;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class LogAspect {

    private static Logger logger=LogManager.getLogger(LogManager.class.getName());

    @Before("execution(* com.mum.studentmis.service.BudgetService.*(..))")
    public void LogBefore(JoinPoint joinPoint){
        System.out.println("Abdu");
        logger.warn(" @Before getting method: "+ joinPoint.getSignature().getName());
    }
    @After("execution(* com.mum.studentmis.service.PaymentService.*(..))")
    public void LogAfter(JoinPoint joinPoint){
        System.out.println("Abdu E");
        logger.warn(" @After returning method: "+ joinPoint.getSignature().getName());
    }

    @AfterReturning(value = "execution(* com.mum.studentmis.service.PaymentService.*(..))", returning = "sss")
    public void LogAfter(JoinPoint joinPoint, String sss){
        logger.warn(joinPoint.getSignature().getName()+"successfully returned"+ sss);
    }

    @AfterThrowing(value = "execution(* com.mum.studentmis.service.PaymentService.*(..))", throwing = "ex")
    public void LogAfter(JoinPoint joinPoint, Exception ex){

        logger.warn(joinPoint.getSignature().getName()+ " method throws" +  ex.getClass().getName());
    }


}
