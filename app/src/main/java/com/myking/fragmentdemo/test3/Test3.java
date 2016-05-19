package com.myking.fragmentdemo.test3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.myking.fragmentdemo.R;
import com.myking.fragmentdemo.test3.FragmentOne;

/**
 * Created by wangmengyong on 2016/5/18.
 */
public class Test3 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test3);

        Fragment one = new FragmentOne();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.aty_test3_layout, one);
        transaction.commit();

        /**
         * Test3主要是了解退回栈的问题
         * 使用transaction.add 则直接会添加在FragmentLayout上面，如果FragmentLyaout已经有fragment则会直接在它上面添加。你可以看到重叠的效果
         * transaction.replace 则添加到FragmentLyaout上面，如果FragmentLayout上有fragment则会把这个fragment替换掉，更换为最近添加的这个。
         * transaction.addToBackStack(null) 添加到返回栈 返回的时候直接返回到上一个fragment
         * transaction.hide(FragmentTwo.this); 隐藏当前fragment返回后还可以看到离开之前保存的数据
         */

    }
}
