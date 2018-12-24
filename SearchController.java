package com.example.controller;


import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.City;
import com.example.service.CityService;

@RestController
class SearchController{

	private static Logger log = LoggerFactory.getLogger(SearchController.class);

	@Autowired
	private CityService cityService;

	/**
	 * @param headers
	 * @param response
	 * @param start
	 * @param atmost
	 * @return
	 */
	@RequestMapping(value="/suggest_cities", method=RequestMethod.GET)
	public List<City> getSearchDetails(@RequestHeader final HttpHeaders headers,
			HttpServletResponse response,
			@RequestParam("start") final String start,@RequestParam("atmost") final String atmost) {
		
		log.info("Entered into getSearchDetails");
		response.setContentType("text/plain");
	    response.setCharacterEncoding("UTF-8");
		return cityService.findByName(start,atmost);
	}

}
