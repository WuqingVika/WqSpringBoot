package com.wuqingvika.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wuqingvika on 2017/7/23.
 */
@Aspect
@Component
public class HttpAspect {
    private final static  Logger logger= LoggerFactory.getLogger(HttpAspect.class);
    //execution(public * com.wuqingvika.controller.GirlController.girlList(..))
    //..代表..里面任何参数都会被拦截
    @Pointcut("execution(public * com.wuqingvika.controller.GirlController.*(..))")
    public void log(){

    }
    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request=attributes.getRequest();
        //url
        logger.info("url={}",request.getRequestURL());
        //method
        logger.info("method={}",request.getMethod());
        //ip
        logger.info("ip={}",request.getRemoteAddr());
        //类方法
        logger.info("Class.Method={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        //参数
        logger.info("args={}",joinPoint.getArgs());
        logger.info("hey hey hey !");
    }

    @After("log()")
    public void doAfter(){
        logger.info("yo yo yo");
    }

    @AfterReturning(returning = "object",pointcut = "log()")
    public void afterReturning(Object object){
        //如果有参数返回
        logger.info("response={}",object.toString());
    }

}
