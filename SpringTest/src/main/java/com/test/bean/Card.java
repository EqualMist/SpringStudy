package com.test.bean;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Component
@Scope("prototype")
public class Card {
    private int cardNumber;

}
