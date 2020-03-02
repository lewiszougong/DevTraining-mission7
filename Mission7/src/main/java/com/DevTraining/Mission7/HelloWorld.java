package com.DevTraining.Mission7;

import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Log4j2
@Component
public class HelloWorld {
    @Value("${spring.profiles.active.print}")
    private String printHello;

    @GetMapping("/local")
    public String hello(@RequestParam("id") Integer userId){
        log.debug("debugging userId: "+userId);
        log.warn("Warning userId: "+userId);
        return printHello;
    }

}
