package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changefragment1(View view){
        Fragment fragment;
        if(view == findViewById(R.id.button2))
        {
            fragment = new fragment1();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.f1,fragment);
            ft.commit();
        }
    }

    public void changefragment2(View view){
        Fragment fragment;
        if(view == findViewById(R.id.button3))
        {
            fragment = new fragment2();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.f2,fragment);
            ft.commit();
        }
    }
}
