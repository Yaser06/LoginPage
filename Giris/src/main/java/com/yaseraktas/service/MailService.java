package com.yaseraktas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.yaseraktas.login.HomeController;

@Service
public class MailService {

	 @Autowired
	 private JavaMailSender mailSender;
	 
	 public void registerMail(String mail,String key){
		 
		 SimpleMailMessage email = new SimpleMailMessage();
		 email.setFrom("yaserders@gmail.com");
		 email.setTo(mail);
		 email.setSubject("Üyeliði Tamamla");
		 email.setText("Üyeliðinizi tamamlamak için aþaðýdaki linke týklayýnýz.\n\n"
				 	+HomeController.url+"/reg/"+key);
		 
		 mailSender.send(email);
		 
	 }
	
}