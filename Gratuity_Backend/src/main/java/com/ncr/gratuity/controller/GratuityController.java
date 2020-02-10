package com.ncr.gratuity.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.ncr.gratuity.model.GratuityList;
import com.ncr.gratuity.service.GratuityService;

import io.swagger.annotations.ApiOperation;

@RestController
@ControllerAdvice
@CrossOrigin(origins = "http://localhost:4200")
public class GratuityController {

	@Autowired
	GratuityService gratuityService;
	
	@ApiOperation(value="",notes="")
	@GetMapping(value="/api/getData")
	public Iterable<GratuityList> getData() 
	{
		return gratuityService.getData();
	}

//	@ApiOperation(value="delete",notes="")
//	@DeleteMapping(value="/api/delete/{id}")
//	public void deleteById(@PathVariable long id){
//		 gratuityService.delete(id);	 
//	}
//	
}
