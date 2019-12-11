package com.example.group12_f2019_mad3125_fp.EmployeeModels;

public class Employee {

    private String name;
    private int age;
    private String earning;
    private EmployeeVehicle vehicle;
    private EmployeeJob job;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getEarning(){
        return earning;
    }
    public void setEarning(String earning){
        this.earning = earning;
    }

    public EmployeeVehicle getVehicle(){
        return vehicle;
    }
    public void setVehicle(EmployeeVehicle vehicle){
        this.vehicle = vehicle;
    }

}
