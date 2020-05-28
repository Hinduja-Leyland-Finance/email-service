package com.pixels.te.emailService.web;

import com.pixels.te.emailService.domain.MessageCommand;
import com.pixels.te.emailService.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@CrossOrigin
@RestController
@RequestMapping("/email")
public class EmailController {
   @Autowired
   EmailService emailService;

    @PostMapping(consumes = "application/json")
    public Mono<String> post(@RequestBody MessageCommand message){
        emailService.sendEmail(message);
        return Mono.just("Ok");
    }
}
