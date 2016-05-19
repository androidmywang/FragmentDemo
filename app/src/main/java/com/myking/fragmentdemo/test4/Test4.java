package com.myking.fragmentdemo.test4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.myking.fragmentdemo.R;

/**
 * Created by wangmengyong on 2016/5/19.
 */
public class Test4 extends AppCompatActivity implements FragmentOne.OnFragmentOneClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test4);

        FragmentOne one = new FragmentOne();
        one.setOneListener(this);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.aty_test4_layout, one);
        transaction.commit();

    }

    @Override
    public void onOneClick() {
        Fragment two = new FragmentTwo();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.aty_test4_layout, two);
//                transaction.add(R.id.aty_test3_layout, two);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}