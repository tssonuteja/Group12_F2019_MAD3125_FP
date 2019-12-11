package com.example.group12_f2019_mad3125_fp.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.group12_f2019_mad3125_fp.Activities.PayrollDetails;
import com.example.group12_f2019_mad3125_fp.Adapters.PayrollAdapter;
import com.example.group12_f2019_mad3125_fp.Interfaces.OnPayrollClicked;
import com.example.group12_f2019_mad3125_fp.R;

import static com.example.group12_f2019_mad3125_fp.Activities.MainActivity.employeeList;

public class ListPayrollFragment extends Fragment {

    private RecyclerView payroll_list;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_list_payroll_fragmet, container, false);
        payroll_list = root.findViewById(R.id.payroll_list);

        setAdapter();
        return root;
    }

    private void setAdapter() {

        PayrollAdapter adapter = new PayrollAdapter(getActivity(), employeeList, new OnPayrollClicked() {
            @Override
            public void onPayrollClicked(int position) {
                Intent intent = new Intent(getActivity(), PayrollDetails.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });

        LinearLayoutManager manager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        payroll_list.setLayoutManager(manager);
        payroll_list.setAdapter(adapter);
    }

}