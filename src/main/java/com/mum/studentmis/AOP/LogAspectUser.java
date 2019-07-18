package com.mum.studentmis.AOP;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class LogAspectUser {

    private static Logger logger=LogManager.getLogger(LogManager.class.getName());

    @Before("execution(* com.mum.studentmis.service.UserServiceImpl.*(..))"+" && @target(org.springframework.stereotype.Service)")
    public void LogBefore(JoinPoint joinPoint){
        logger.warn("About the User Management using Before annotation :"+ joinPoint.getSignature().getName());
    }
    @After("execution(* com.mum.studentmis.service.UserServiceImpl.*(..))"+" && @target(org.springframework.stereotype.Service)")
    public void LogAfter(JoinPoint joinPoint){
        logger.warn("About the user management using After annotation : "+ joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* com.mum.studentmis.service.UserServiceImpl.findUserById(..))", returning = "service")
    public void afterReturn(JoinPoint joinPoint, String service){
        System.out.println("About the User Management AfterReturn annotation  : "+ joinPoint.getSignature().getName()+ " Returned: "+ service);
    }

    @AfterThrowing(pointcut = "execution(* com.mum.studentmis.service.UserServiceImpl.findUserById(..))", throwing = "excep")
    public void afterThrow(JoinPoint joinPoint, MyException excep){
        System.out.println("About the User management AfterThrowing annotation  : "+ joinPoint.getSignature().getName()+ " threw a: "+ excep.getClass().getName());
    }
    @Around("execution(* com.mum.studentmis.service.UserServiceImpl.findUserById(..))")
    public Object around(ProceedingJoinPoint joinPoint){
        String m  = joinPoint.getSignature().getName();
        System.out.println("Inside @Around : Before "+ m);
        Object ret  =  null;
        try{

            ret = joinPoint.proceed();

        }catch (Throwable e){
            e.printStackTrace();
        }
        System.out.println("Inside @Around After "+ m+" Returned "+ ret);

        return  ret;
    }

}
