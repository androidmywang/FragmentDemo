package com.myking.fragmentdemo.test4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.myking.fragmentdemo.R;

/**
 * Created by wangmengyong on 2016/5/18.
 */
public class FragmentOne extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button btn = (Button) getView().findViewById(R.id.frag_one_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mListener != null) {
                    mListener.onOneClick();
                }
            }
        });
    }

    private OnFragmentOneClickListener mListener;

    public interface OnFragmentOneClickListener {
        void onOneClick();
    }

    public void setOneListener(OnFragmentOneClickListener listener) {
        mListener = listener;
    }
}
