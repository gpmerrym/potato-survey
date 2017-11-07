package com.libertymutual.goforcode.hello_world_again.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	private int russetCount;
	private int goldenCount;
	private int sweetCount;

	@RequestMapping("/")
	public String defaultPage() {
		return "potatoe"; // name of the file you want to "return"

	}

	@RequestMapping("/twice-baked") // same path from the link in the HTML
	public ModelAndView twiceBaked() {
		ModelAndView carbs = new ModelAndView(); // declare variable of ModelAndView
		carbs.setViewName("spuds"); // Spuds.html is where the view is set??
		carbs.addObject("variety", "baked");
		carbs.addObject("cdmts", "sour cream");
		carbs.addObject("temp", 450.7);
		return carbs;
	}

	@RequestMapping("/survey") // we are passing in "answer" to the method
	public ModelAndView survey(String answer) {
		ModelAndView mv = new ModelAndView(); // sets object
		mv.setViewName("results"); // points to results.html below
		mv.addObject("userResponse", answer); // value is stored in "answer"

		if (answer.equals("Sweet")) {
			sweetCount = sweetCount + 1;
		}

		if (answer.equals("Golden")) {
			goldenCount = goldenCount + 1;
		}

		if (answer.equals("Russet")) {
			russetCount = russetCount + 1;
		}

		mv.addObject("sweetCount", sweetCount);
		mv.addObject("goldenCount", goldenCount);
		mv.addObject("russetCount", russetCount);

		return mv;
	}

}
