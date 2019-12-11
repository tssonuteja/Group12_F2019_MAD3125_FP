package com.example.group12_f2019_mad3125_fp.Adapters;

import android.content.Context;

import com.example.group12_f2019_mad3125_fp.EmployeeModels.Employee;
import com.example.group12_f2019_mad3125_fp.Interfaces.OnPayrollClicked;

import java.util.List;

public class PayrollAdapter {

    private Context context;
    private List<Employee> employeeList;
    private OnPayrollClicked onPayrollClicked;

    public PayrollAdapter(Context context, List<Employee> employeeList, OnPayrollClicked onPayrollClicked) {
        this.context = context;
        this.employeeList = employeeList;
        this.onPayrollClicked = onPayrollClicked;
    }

}
