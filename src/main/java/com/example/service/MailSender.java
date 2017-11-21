package com.example.service;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;

public interface MailSender {
    void send(SimpleMailMessage simpleMailMessage) throws MailException;
    void send(SimpleMailMessage[] simpleMailMessage) throws MailException;
}
