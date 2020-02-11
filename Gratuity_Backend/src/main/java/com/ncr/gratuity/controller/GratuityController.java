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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Optional;
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
	//@GetMapping(value="/api/getDatabyId")
	/*
	public GratuityList getDataById(long id)
	{
		Optional<GratuityList> emp =  gratuityService.getDataById(id);
        if(!emp.isPresent())
            throw new Exception("Could not find employee with id- " + id);
 
        return emp.get();
		
	}*/
	@PutMapping(value="/api/updateData/{id}")
	public void updateData(@RequestParam String paddress, @RequestParam String religion, @PathVariable Long id)
	{
		gratuityService.updateData(paddress, religion, id);
		
	    // Optional<GratuityList> emp =  gratuityService.getDatabyId(id);
	}
	/*
	@RequestMapping(value= "/employee/update/{id}", method= RequestMethod.PUT)
    public Employee updateEmployee(@RequestBody Employee updemp, @PathVariable int id) throws Exception {
        System.out.println(this.getClass().getSimpleName() + " - Update employee details by id is invoked.");
 
        Optional<GratuityList> emp =  service.getEmployeeById(id);
        if (!emp.isPresent())
            throw new Exception("Could not find employee with id- " + id);
 
        // IMPORTANT - To prevent the overriding of the existing value of the variables in the database, 
         // if that variable is not coming in the @RequestBody annotation object. 
        if(updemp.getName() == null || updemp.getName().isEmpty())
            updemp.setName(emp.get().getName());
        if(updemp.getDepartment() == null || updemp.getDepartment().isEmpty())
            updemp.setDepartment(emp.get().getDepartment());
        if(updemp.getSalary() == 0)
            updemp.setSalary(emp.get().getSalary());
 
        // Required for the "where" clause in the sql query template.
        updemp.setId(id);
        return service.updateEmployee(updemp);
    }
	*/
	
//	@ApiOperation(value="delete",notes="")
//	@DeleteMapping(value="/api/delete/{id}")
//	public void deleteById(@PathVariable long id){
//		 gratuityService.delete(id);	 
//	}
}
