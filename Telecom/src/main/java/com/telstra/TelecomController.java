package com.telstra;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//Spring Controller
@Controller
public class TelecomController {
	String message = "Welcome to Telstra!";
 
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("entered in controller.");
 
		ModelAndView mview = new ModelAndView("helloTelstra");
		mview.addObject("message", message);
		mview.addObject("name", name);
		return mview;
	}
}
