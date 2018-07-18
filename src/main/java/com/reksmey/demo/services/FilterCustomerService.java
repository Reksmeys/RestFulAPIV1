package com.reksmey.demo.services;

import com.reksmey.demo.Model.FilterCustomer;
import com.reksmey.demo.repositories.FilterCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class FilterCustomerService {
    @Autowired
    private FilterCustomerRepository filterCustomerRepository;

    public FilterCustomerService(FilterCustomerRepository filterCustomerRepository) {
        this.filterCustomerRepository = filterCustomerRepository;
    }

    public List<FilterCustomer> filterCustomers(String staffName, String filmTitle){
        return filterCustomerRepository.filterCustomer(staffName, filmTitle);
    }

    public List<FilterCustomer> filterCustomerWithDate(String staffName, Date rentalDate, String filmTitle){
        return filterCustomerRepository.filterCustomerWithDate(staffName, rentalDate, filmTitle);
    }
}
