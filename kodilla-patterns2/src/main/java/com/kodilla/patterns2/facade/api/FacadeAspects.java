package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class FacadeAspects {
    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeAspects.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder())")
    public void logEvent() {
        LOGGER.info("Metoda OrderProcess Zostala Uzyta");
    }
}
