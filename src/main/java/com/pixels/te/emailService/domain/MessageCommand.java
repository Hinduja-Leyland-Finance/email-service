package com.pixels.te.emailService.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageCommand {
    private String toEmail;
    private String fromEmail;
    private String message;
    private String subject;
    private LocaleEnum locale;
    private String template;
}
