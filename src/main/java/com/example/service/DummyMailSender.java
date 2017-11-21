package com.example.service;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;

public class DummyMailSender implements MailSender {
    public void send(SimpleMailMessage simpleMailMessage) throws MailException {

    }

    public void send(SimpleMailMessage[] simpleMailMessage) throws MailException {

    }
}
