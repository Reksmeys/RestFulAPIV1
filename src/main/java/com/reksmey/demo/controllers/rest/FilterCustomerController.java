package com.reksmey.demo.controllers.rest;

import com.reksmey.demo.Model.FilterCustomer;
import com.reksmey.demo.services.FilterCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

@RestController
@CrossOrigin
public class FilterCustomerController {
    @Autowired
    private FilterCustomerService filterCustomerService;

    @GetMapping("/filter/{staffName}/{filmTitle}")
    //  @ResponseBody
    public List<FilterCustomer> filterCustomers(@PathVariable("staffName") String staffName, @PathVariable("filmTitle") String filmTitle){
        return filterCustomerService.filterCustomers(staffName, filmTitle);
    }
    //@CrossOrigin
    @GetMapping("/filter/{staffName}/{rentalDate}/{filmTitle}")
    // @ResponseBody
    public List<FilterCustomer> filterCustomerWithDate(@PathVariable("staffName") String staffName, @PathVariable("rentalDate") Date rentalDate, @PathVariable("filmTitle") String filmTitle){
        return filterCustomerService.filterCustomerWithDate(staffName, rentalDate ,filmTitle);
    }
}
