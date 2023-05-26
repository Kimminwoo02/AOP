package com.example.aop.order.aop;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {
    @Pointcut("execution(* com.example.aop.order..*(..))")
    public void allOrder(){} // pointcut signature

    @Pointcut("execution(* *..Service.*(..))")
    public void allService(){}

    @Pointcut("allOrder() && allService()")
    public void orderAndService(){}
}
