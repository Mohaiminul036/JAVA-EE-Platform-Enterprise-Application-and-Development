package com.example.springmvc.helloworld.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author bobyuan
 */
@Controller
@RequestMapping(value = "/")
public class HelloWorldController {

	private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
    
	@GetMapping(value = "/")
    //@RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView welcome() {
        final String VIEW_INDEX = "index";

        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Welcome!");
        mv.addObject("date", SDF.format(new Date()));
        mv.setViewName(VIEW_INDEX);

        return mv;
    }
}
