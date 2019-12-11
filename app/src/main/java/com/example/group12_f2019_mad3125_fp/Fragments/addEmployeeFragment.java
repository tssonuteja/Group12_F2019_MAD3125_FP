package com.example.group12_f2019_mad3125_fp.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.group12_f2019_mad3125_fp.R;


public class addEmployeeFragment extends Fragment {

    private RadioGroup rg_part_time, vehicle_layout;
    private LinearLayout part_time_layout, intern_layout, full_time_layout, vehicle_details_layout;
    private RadioButton rb_commission_based, rb_fixed_based, rb_part_time, rb_intern, rb_full_time, rbCar, rbBike;
    private CheckBox has_vehicle_check;
    EditText etName, etSalary, etBonus, etSchool, etRate, etHours, etCommission, etFixed, etMake, etPlate;
    EditText tvDob;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_add_employee, container, false);

        has_vehicle_check = root.findViewById(R.id.has_vehicle_check);

        rb_commission_based = root.findViewById(R.id.rb_commission_based);
        rb_fixed_based = root.findViewById(R.id.rb_fixed_based);
        rb_part_time = root.findViewById(R.id.rb_part_time);
        rb_intern = root.findViewById(R.id.rb_intern);
        rb_full_time = root.findViewById(R.id.rb_full_time);
        part_time_layout = root.findViewById(R.id.part_time_layout);
        intern_layout = root.findViewById(R.id.intern_layout);
        full_time_layout = root.findViewById(R.id.full_time_layout);
        rg_part_time = root.findViewById(R.id.rg_part_time);
        vehicle_layout = root.findViewById(R.id.vehicle_layout);
        vehicle_details_layout = root.findViewById(R.id.vehicle_details_layout);
        rbCar  = root.findViewById(R.id.rb_car);
        rbBike = root.findViewById(R.id.rb_bike);
        etName  = root.findViewById(R.id.et_name);
        etSalary = root.findViewById(R.id.et_salary);
        etBonus = root.findViewById(R.id.et_bonus);
        etSchool = root.findViewById(R.id.et_school);
        etRate = root.findViewById(R.id.et_rate);
        etHours = root.findViewById(R.id.et_hours);
        etCommission = root.findViewById(R.id.et_commission);
        etFixed = root.findViewById(R.id.et_fixed_amount);
        etMake =  root.findViewById(R.id.et_make);
        etPlate = root.findViewById(R.id.et_plate);
        tvDob = root.findViewById(R.id.tv_dob);

    }