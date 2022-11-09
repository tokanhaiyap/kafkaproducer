package com.example.kafkademo.event;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Setter
@Getter
@Builder
public class NewCreditCardEvent {
   // private String message;
    private HashMap<String,String> hm;

}
