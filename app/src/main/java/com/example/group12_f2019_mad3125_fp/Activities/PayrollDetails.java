package com.example.group12_f2019_mad3125_fp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.group12_f2019_mad3125_fp.EmployeeModels.Employee;
import com.example.group12_f2019_mad3125_fp.EmployeeModels.EmployeeVehicle;
import com.example.group12_f2019_mad3125_fp.R;

import java.util.Calendar;

import static com.example.group12_f2019_mad3125_fp.Activities.MainActivity.employeeList;

public class PayrollDetails extends AppCompatActivity {

    Employee employee;
    TextView tv_job_one, tv_job_two, tv_job_three, tv_job_type, tv_vehicle, tv_earning, tv_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payroll_details);

        tv_job_three = findViewById(R.id.tv_job_three);
        tv_job_two = findViewById(R.id.tv_job_two);
        tv_job_one = findViewById(R.id.tv_job_one);
        tv_job_type = findViewById(R.id.tv_job_type);
        tv_vehicle = findViewById(R.id.tv_vehicle);
        tv_earning = findViewById(R.id.tv_earning);
        tv_name = findViewById(R.id.tv_name);

        int position = getIntent().getIntExtra("position", 0);
        employee = employeeList.get(position);

        tv_name.setText(employee.getName()+" ("+calculateAge()+")");
        tv_earning.setText("Earning : "+calculateEarning());
        EmployeeVehicle vehicle = employee.getVehicle();

        if (vehicle == null){
            tv_vehicle.setVisibility(View.GONE);
        } else {
            tv_vehicle.setText(vehicle.getMake()+" "+vehicle.getIsA()+" : "+vehicle.getPlate());
        }
    }

    private int calculateAge(){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        return year - employee.getAge();
    }
}
