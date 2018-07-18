package com.reksmey.demo.repositories;

import com.reksmey.demo.Model.FilterCustomer;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.sql.Date;
import java.util.List;

@Repository
@CrossOrigin
public interface FilterCustomerRepository {
    @Select("SELECT * FROM func_filter_customers (#{staffName}, #{filmTitle})")
    @Results({
            @Result(column = "r_staff_name", property = "staffName"),
            @Result(column = "r_rental_date", property = "rentalDate"),
            @Result(column = "r_film_title", property = "filmTitle"),
            @Result(column = "r_customer_name", property = "customer.firstName"),
            @Result(column = "r_staff_id", property = "staffId")
    })
    public List<FilterCustomer> filterCustomer(@Param("staffName") String staffName, @Param("filmTitle") String filmTitle);


    @Select("SELECT * FROM func_filter_customer (#{staffName}, #{rentalDate}, #{filmTitle})")
    @Results({
            @Result(column = "r_staff_name", property = "staffName"),
            @Result(column = "r_rental_date", property = "rentalDate"),
            @Result(column = "r_film_title", property = "filmTitle"),
            @Result(column = "r_customer_name", property = "customer.firstName")
    })
    public List<FilterCustomer> filterCustomerWithDate(@Param("staffName") String staffName, @Param("rentalDate")Date rentalDate, @Param("filmTitle") String filmTitle);

}
