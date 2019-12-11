package com.example.group12_f2019_mad3125_fp.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

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