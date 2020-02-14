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
	
	@GetMapping(value="/api/findbyId")
	public java.util.Optional<GratuityList> findById(long id)
	{
		return  gratuityService.findById(id);
    //    if(!emp.isPresent())
   //         throw new Exception("Could not find employee with id- " + id);
 
 //       return emp.get();
		
	}
	
	@PutMapping(value="/api/updateData/{id}")
	public void updateData(@RequestParam String n_name, @RequestParam String n_address,@RequestParam String n_dob,@RequestParam String n_relation,@RequestParam String n_amount, @PathVariable Long id)
	{
		
		System.out.println("name"+n_name);
		System.out.println("n_address"+n_address);
		System.out.println("n_dob"+n_dob);
		System.out.println("n_relation"+n_relation);
		System.out.println("n_amount"+n_amount);
		System.out.println("id"+id);
		gratuityService.updateData(n_name, n_address,n_dob,n_relation,n_amount, id);
		
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
