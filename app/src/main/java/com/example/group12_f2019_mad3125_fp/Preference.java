package com.example.group12_f2019_mad3125_fp;

import android.content.Context;
import android.content.SharedPreferences;


    public class Preference {
        private SharedPreferences preferences;

        public Preference(Context context){
            preferences = context.getSharedPreferences("myPreference", Context.MODE_PRIVATE);
        }
}
