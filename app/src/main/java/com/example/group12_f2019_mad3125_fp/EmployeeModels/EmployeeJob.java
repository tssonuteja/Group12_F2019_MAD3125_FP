package com.example.group12_f2019_mad3125_fp.EmployeeModels;

public class EmployeeJob {
    private String jobType;
    private String partTimeType;
    private double salary;
    private double bonus;
    private String school;
    private double rate;
    private double hours;
    private double commission;
    private double fixed;

    public String getJobType(){
        return jobType;
    }
    public void setJobType(String jobType){
        this.jobType = jobType;
    }

    public double getSalary(){
        return salary;
    }

}
