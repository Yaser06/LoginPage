package com.yaseraktas.login;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yaseraktas.security.LoginFilter;
import com.yaseraktas.service.MailService;

@Controller
public class HomeController {
	
	public static String url = "http://localhost:8090/login";
	
	
	
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String home(Model model, HttpServletRequest req) {

		return "redirect:/home";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homes(Model model, HttpServletRequest req) {
		
		return "redirect:/home";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String index(Model model, HttpServletRequest req) {
		
		model.addAttribute("user",req.getSession().getAttribute("user"));
		
		System.out.println(req.getRemoteAddr());
		
		
		return "home";
	}
	
	@RequestMapping(value = "/login/{id}", method = RequestMethod.GET)
	public String home(@PathVariable("id") Long id , Model model) {
		
		model.addAttribute("id",id);
		
		return "login";
	}
	
	
	@RequestMapping(value = "/error_404", method = RequestMethod.GET)
	public String error(Model model) {
		
		return "error_404";
	}
	


}
