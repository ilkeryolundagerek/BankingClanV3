package com.iyg.bankingclan.web.controller;

import com.iyg.bankingclan.model.Bank;
import com.iyg.bankingclan.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
	
	@GetMapping(value = "/")
	public String home (){
		return "home";
	}
	
	@GetMapping(value = "/create")
	public String create (){
		return "addUser";
	}
	
	@PostMapping(value = "/create")
	public String saveUser (@ModelAttribute("user") User user, ModelMap model, BindingResult result){
		model.put("user", user);
		//Class Self Builder Pattern
		user = User.builder().firstname("ilker").lastname("turan").address("istanbul").build();
		//Bank bank = Bank.builder().name("ADC").address("İstanbul").build(); //Lombok ver.
		return "addUser";
	}
}
