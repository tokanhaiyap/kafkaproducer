package com.example.kafkademo.service;

import com.example.kafkademo.event.NewCreditCardEvent;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.HashMap;

@Service
@Slf4j
@AllArgsConstructor
public class EventPublisherService {

    public NewCreditCardEvent publishEvent() {

        int a = 10;
        if (a > 0) {
            var hashM = new HashMap<String, String>();
            hashM.put("status", "started");
            // NewCreditCardEvent.builder().message("Hello World ...."+ Instant.now()).hm(hashM).build();
            return NewCreditCardEvent.builder().hm(hashM).build();

        }
        return null;
    }
}
