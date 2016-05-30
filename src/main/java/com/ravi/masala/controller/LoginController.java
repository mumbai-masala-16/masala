package com.ravi.masala.controller;

import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ravi.masala.domain.LoginModel;
import com.ravi.masala.service.LoginService;

@Controller
public class LoginController {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	@Autowired
	private LoginService loginService;
	
	
	@RequestMapping(value = "login",method = RequestMethod.GET)
    public String loadLoginPage(Map<String, Object> map) {
    	LOGGER.info("test===============================");
    	return "login";
    }
	
	@RequestMapping(value = "login",method = RequestMethod.POST)
	//public String validateUser(ModelMap modelMap,@ModelAttribute("user") @Valid User user) {
	public String submit(ModelMap modelMap, @ModelAttribute("loginModel") @Valid LoginModel loginModel) {	
		LOGGER.info("1: ================================");
		LOGGER.info("User ID: ================================"+loginModel.getUserName());
		LOGGER.info("User password: ================================"+loginModel.getPassword());
		
		if(loginService.validateUser(loginModel)){
			LOGGER.info("2: ================================");
			return "redirect:/add";

		}else{
			LOGGER.info("3: ================================");
			return "redirect:/login";
		}
	}
}
