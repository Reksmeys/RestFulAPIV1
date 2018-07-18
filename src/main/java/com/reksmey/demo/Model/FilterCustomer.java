package com.reksmey.demo.Model;

import java.sql.Date;

public class FilterCustomer {
    private Integer staffId;

    private String staffName;
    private Date rentalDate;
    private String filmTitle;
    private Customer customer;

    public FilterCustomer() {
    }

    public FilterCustomer(Integer staffId, String staffName, Date rentalDate, String filmTitle, Customer customer) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.rentalDate = rentalDate;
        this.filmTitle = filmTitle;
        this.customer = customer;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "FilterCustomer{" +
                "staffId=" + staffId +
                ", staffName='" + staffName + '\'' +
                ", rentalDate=" + rentalDate +
                ", filmTitle='" + filmTitle + '\'' +
                ", customer=" + customer +
                '}';
    }
}
