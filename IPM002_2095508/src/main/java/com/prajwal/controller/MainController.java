package com.rays.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rays.model.Employee;

@Controller
public class MainController {
	
	@Autowired
	Employee employee;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("register")
	public String registrtionForm(Model model) {
		model.addAttribute("emp1",employee);
		return "registrtion";
	}
	
	@RequestMapping("submitform")
	public String submitForm(@Valid @ModelAttribute("emp1") Employee emp, BindingResult bindingResult) {
		
		
		if(bindingResult.hasErrors()) {
			return "registrtion";
		}
		System.out.println(emp);
		
		return "showdetails";
		
	}
	
}
