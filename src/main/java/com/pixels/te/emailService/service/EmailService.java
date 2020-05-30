package com.pixels.te.emailService.service;

import com.pixels.te.emailService.domain.MessageCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@Slf4j
public class EmailService {
    @Autowired
    public JavaMailSender emailSender;

    @Async
    public void sendEmail(MessageCommand emailMessage) {
        log.info("Sending an mail as {}",emailMessage.toString());
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(emailMessage.getToEmail());
        message.setSubject(emailMessage.getSubject());
        message.setText(emailMessage.getMessage());
        emailSender.send(message);
    }
}
