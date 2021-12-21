package org.ltamang.springbootconfig;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @Value("${my.greetings}")
    private String greetingMessage;

    @Value("${my.list}")
    private List<String> list;

    @Value("#{${db}}")
    private Map<String,String> db;

    @GetMapping("/greetings")
    public String getGreetings(){
        return greetingMessage + " " +list.toString() +" "+db.toString();
    }
    
}
