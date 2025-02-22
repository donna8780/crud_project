package com.itbank.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.BoardService;

@Controller
public class HomeController {
	@Autowired
	private BoardService bs;
	
	@GetMapping("/")
	public ModelAndView home(){
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("list",bs.getboards());
		mav.setViewName("home");
		return mav;
	}
	

}
