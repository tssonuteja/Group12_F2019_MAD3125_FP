package com.example.group12_f2019_mad3125_fp.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.group12_f2019_mad3125_fp.R;


public class ListPayrollFragmet extends Fragment {

    private RecyclerView payroll_list;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_list_payroll_fragmet, container, false);
        payroll_list = root.findViewById(R.id.payroll_list);

        setAdapter();
        return root;
    }