package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //影藏头部app名菜单栏，使用定义的菜单栏
        ActionBar bar = getSupportActionBar();
        if(null!=bar){
            ((ActionBar) bar).hide();
        }
    }
}
