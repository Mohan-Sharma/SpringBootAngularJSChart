package org.msharma.presentation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Mohan Sharma Created on 08/02/18.
 */
@Controller
@RequestMapping(value = "/example")
public class ViewController
{
	@GetMapping(value = "/home")
	public ModelAndView home(ModelAndView modelAndView)
	{
		modelAndView.setViewName("chart");
		return modelAndView;
	}
}
