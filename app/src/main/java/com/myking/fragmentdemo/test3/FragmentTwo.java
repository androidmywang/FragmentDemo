package com.myking.fragmentdemo.test3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.myking.fragmentdemo.R;

/**
 * Created by wangmengyong on 2016/5/18.
 */
public class FragmentTwo extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button btn = (Button) getView().findViewById(R.id.frag_two_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment three = new FragmentThree();
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.hide(FragmentTwo.this);
                transaction.add(R.id.aty_test3_layout, three);
//                transaction.replace(R.id.aty_test3_layout, three);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
    }
}
