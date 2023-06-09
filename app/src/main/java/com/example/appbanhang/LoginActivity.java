package com.example.appbanhang;

import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;


import com.example.appbanhang.adapter.Tabadapter;
import com.example.appbanhang.fragment.FragmentLogin;
import com.example.appbanhang.fragment.FragmentRegister;
//import com.example.food.adapter.Tabadapter;
//import com.example.food.fragment.FragmentLogin;
//import com.example.food.fragment.FragmentSignup;
import com.google.android.material.tabs.TabLayout;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {
    TabLayout tableLayout;
    ImageView facebook,twitter,google;
    private Tabadapter adapter;
    public  static ViewPager viewPager;

    float v=0;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tableLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
//        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

//        if(user!=null){
//            Intent is = new Intent(this, MainActivity.class);
//            startActivity(is);
//        }
        facebook = findViewById(R.id.facebook);
        twitter = findViewById(R.id.twitter);
        google = findViewById(R.id.google);
        adapter = new Tabadapter(this.getSupportFragmentManager());
        adapter.addFragment(new FragmentLogin(), "Login");
        adapter.addFragment(new FragmentRegister(), "Register");
        viewPager.setAdapter(adapter);
        tableLayout.setupWithViewPager(viewPager);

        getWindow().setStatusBarColor(ContextCompat.getColor(LoginActivity.this, R.color.green_400));
    }
}