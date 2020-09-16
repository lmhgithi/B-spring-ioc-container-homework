package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Service
public class GreetingService {
    private int count = 0;

    String sayHi() {
        count += 1;
        return "hello world " + count;
    }
}
