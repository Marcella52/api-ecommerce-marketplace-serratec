package com.grupo4.projetofinalapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
public class MailConfig {
    @Autowired
    public JavaMailSender javaMailSender;

    public void sendMail(String para, String assunto, String conteudo) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("grupo4.serratec@gmail.com");
        message.setTo(para);
        message.setSubject(assunto);
        message.setText(conteudo);
        javaMailSender.send(message);
    }
}
