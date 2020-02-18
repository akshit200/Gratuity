package com.ncr.gratuity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


import com.ncr.gratuity.model.NomineeList;
import com.ncr.gratuity.service.NomineeService;

import io.swagger.annotations.ApiOperation;

@RestController
@ControllerAdvice
@CrossOrigin(origins = "http://localhost:4200")
public class NomineeController {
/*
	@Autowired
	NomineeService nomineeService;
	
	@ApiOperation(value="",notes="")
	@PostMapping(value="/api/putData")
	public void putData(@RequestBody NomineeList nomineeList) 
	{
		nomineeService.putData(nomineeList);
	}*/
}





