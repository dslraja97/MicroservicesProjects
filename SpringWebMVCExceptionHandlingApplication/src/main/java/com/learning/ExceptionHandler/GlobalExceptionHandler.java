package com.learning.ExceptionHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ModelAndView exceptionHandler(Exception ex) {
		String message = ex.getMessage();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page");
		return modelAndView;
	}

}
