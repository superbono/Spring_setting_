package com.project.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.service.ProjectService;


@RequestMapping("/")
@Controller
public class ProjectController {

	private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);
	private ProjectService pService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String home() {
		
		/*
		 * Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		 */
		logger.info("home");
		return "/home";
	}
	
}
