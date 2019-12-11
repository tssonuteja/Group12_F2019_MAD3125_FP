package com.example.group12_f2019_mad3125_fp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

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

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.single_row_payrol_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Employee employee = employeeList.get(position);
        holder.tvName.setText(employee.getName()+" ("+employee.getAge()+")");
        holder.tvJob.setText(employee.getJob().getJobType());
        holder.tvVehicle.setText(employee.getVehicle().getIsA()+" : "+employee.getVehicle().getPlate());
    }

}
