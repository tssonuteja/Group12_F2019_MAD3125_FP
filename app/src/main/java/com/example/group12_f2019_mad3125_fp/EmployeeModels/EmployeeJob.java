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
    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getBonus()
    {
        return bonus;
    }
    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    public String getSchool()
    {
        return school;
    }
    public void setSchool(String school)
    {
        this.school = school;
    }

    public double getRate()
    {
        return rate;
    }
    public void setRate(double rate)
    {
        this.rate = rate;
    }

}
