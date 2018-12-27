package com.onlinebooking.app.controller;


import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ApplicationController {
	
	// space trimmer
		@InitBinder
		public void initBinder(WebDataBinder dataBinder) {
			StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
			dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		}
		
//		@ResponseBody
//		@RequestMapping("/home")
//		public String home() {
//
//			return "hi alem";
//		}


	
	//expose "/" that return "Hello World"
	
		@RequestMapping(value= {"/","/welcome"})
		public String home() {

			return "a";
		}


}
