package com.example.group12_f2019_mad3125_fp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.group12_f2019_mad3125_fp.EmployeeModels.Employee;
import com.example.group12_f2019_mad3125_fp.EmployeeModels.EmployeeJob;
import com.example.group12_f2019_mad3125_fp.EmployeeModels.EmployeeVehicle;
import com.example.group12_f2019_mad3125_fp.R;

import java.util.Calendar;

import static com.example.group12_f2019_mad3125_fp.Activities.MainActivity.COMMISSION_BASED;
import static com.example.group12_f2019_mad3125_fp.Activities.MainActivity.FIXED_BASED;
import static com.example.group12_f2019_mad3125_fp.Activities.MainActivity.FULL_TIME;
import static com.example.group12_f2019_mad3125_fp.Activities.MainActivity.INTERN;
import static com.example.group12_f2019_mad3125_fp.Activities.MainActivity.PART_TIME;
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

    private double calculateEarning(){
        double earning = 0;
        EmployeeJob job = employee.getJob();
        switch (job.getJobType()){

            case FULL_TIME:
                tv_job_type.setText(FULL_TIME);
                tv_job_one.setText("Salary : "+job.getSalary());
                tv_job_two.setText("Bonus : "+job.getBonus());
                tv_job_three.setVisibility(View.GONE);
                earning = job.getSalary()+job.getBonus();
                break;

            case PART_TIME:
                if (job.getPartTimeType().equalsIgnoreCase(FIXED_BASED)){
                    tv_job_one.setText("Rate : "+job.getRate());
                    tv_job_two.setText("Hours worked : "+job.getHours());
                    tv_job_three.setText("Fixed amount : "+job.getFixed());
                    tv_job_type.setText(FIXED_BASED);
                    earning = job.getFixed()+(job.getRate()*job.getHours());
                } else {
                    tv_job_one.setText("Rate : "+job.getRate());
                    tv_job_two.setText("Hours worked : "+job.getHours());
                    tv_job_three.setText("Commission : "+job.getCommission());
                    tv_job_type.setText(COMMISSION_BASED);
                    earning = job.getCommission()+(job.getRate()*job.getHours());
                }
                break;
            case INTERN:
                tv_job_one.setText("School : "+job.getSchool());
                tv_job_two.setVisibility(View.GONE);
                tv_job_three.setVisibility(View.GONE);
                tv_job_type.setText(INTERN);
                break;
            default:
                break;
        }
        return earning;
    }
}








