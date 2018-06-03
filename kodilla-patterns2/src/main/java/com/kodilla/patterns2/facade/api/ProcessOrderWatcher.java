package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProcessOrderWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProcessOrderWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(order, userId) && target(object)")
    public void logEvent(OrderDto order, Long userId, Object object) {
        LOGGER.info("Logging the event. Class: " + object.getClass().getName() + ", Args: " + order.toString() + " ; " + userId);
    }

    public void logAfterReturning() {
        LOGGER.info("Method 'processOrder' was successfully executed");
    }

    @After("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logAfterEvent() {
        LOGGER.info("Method 'processOrder' was executed");
    }

    @AfterThrowing("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logError() {
        LOGGER.info("An error occurred");
    }

    @Around("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            LOGGER.info("Elapsed time: " + (end - begin) + "[ms]");
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }
}

