package pl.swozniak.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl  implements GreetingService{

    public static final String HELLO = "Hello guys!!!";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
