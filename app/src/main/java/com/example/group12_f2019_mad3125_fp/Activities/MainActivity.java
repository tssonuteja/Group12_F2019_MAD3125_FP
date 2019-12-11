package com.example.group12_f2019_mad3125_fp.Activities;

import android.os.Bundle;

import com.example.group12_f2019_mad3125_fp.EmployeeModels.Employee;
import com.example.group12_f2019_mad3125_fp.Fragments.HomeFragment;
import com.example.group12_f2019_mad3125_fp.Fragments.ListPayrollFragmet;
import com.example.group12_f2019_mad3125_fp.Fragments.addEmployeeFragment;
import com.example.group12_f2019_mad3125_fp.Interfaces.OpenTab;
import com.example.group12_f2019_mad3125_fp.Preference;
import com.example.group12_f2019_mad3125_fp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.MenuItem;
import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OpenTab {

    DrawerLayout drawer;
    NavigationView navigationView;
    Fragment[] fragments;
    Preference preference;

    public static List<Employee> employeeList = new ArrayList<>();
    public static final String FULL_TIME = "Full time", INTERN = "Intern", PART_TIME = "Part time",
            CAR = "Car", MOTORCYCLE = "Motorcycle", COMMISSION_BASED = "Commission based part time", FIXED_BASED = "Fixed based part time";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        preference = new Preference(this);

        drawer = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);

        setUpNavigationView();

        fragments = new Fragment[]{new HomeFragment(), new addEmployeeFragment(), new ListPayrollFragmet()};

        openFragment(0);

        new addEmployeeFragment().setOnOpenTab(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_filter) {
            if (drawer.isDrawerOpen(GravityCompat.END)) {
                drawer.closeDrawer(GravityCompat.END);
            } else {
                drawer.openDrawer(GravityCompat.END);
            }
        }
        return super.onOptionsItemSelected(item);
    }

}
