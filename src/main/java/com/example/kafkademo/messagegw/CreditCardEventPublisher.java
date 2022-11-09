package com.example.kafkademo.messagegw;
import com.example.kafkademo.event.NewCreditCardEvent;
import com.example.kafkademo.service.EventPublisherService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Slf4j
@AllArgsConstructor
@Configuration
public class CreditCardEventPublisher {

    private EventPublisherService eventPublisherService;

    @Bean
    public Supplier<NewCreditCardEvent> publishNewCreditCardEvent(){
        return () ->{
            var newCreditCardEvent = eventPublisherService.publishEvent();
            return newCreditCardEvent;
        };
    }
}