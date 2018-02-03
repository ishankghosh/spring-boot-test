package com.unitTest.testdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unitTest.testdemo.Iservice.PersonalDetail;

@RestController
public class InfoController {

	@Autowired
	PersonalDetail personDetail;
	
	@GetMapping(value="/getInfo/{ID}")
	String setInfo(@PathVariable("ID") String name)
	{
		return "Hello =========" + name;
	}
}
