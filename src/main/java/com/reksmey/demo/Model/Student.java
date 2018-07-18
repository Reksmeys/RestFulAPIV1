package com.reksmey.demo.Model;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

public class Student {
    private int id;

    @NotNull//(message = "{1} this can not be null!")
    @NotBlank//(message = "this can not be blank!")
    private String name;

    @Size(min = 1, max = 1)
    private String sex;

    private Date dob;
    private String profile;

    public Student() {
    }

    public Student(int id, @NotNull @NotBlank String name, String sex, Date dob, String profile) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.profile = profile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", dob=" + dob +
                ", profile='" + profile + '\'' +
                '}';
    }
}
