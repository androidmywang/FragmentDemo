package com.myking.fragmentdemo.test2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.myking.fragmentdemo.R;
import com.myking.fragmentdemo.test2.HomeFragment;
import com.myking.fragmentdemo.test2.NewFragment;
import com.myking.fragmentdemo.test2.SettingsFragment;
import com.myking.fragmentdemo.test2.TypeFragment;

/**
 * Created by wangmengyong on 2016/5/17.
 */
public class Test2 extends AppCompatActivity implements View.OnClickListener {

    private TextView mTabHome,mTabType,mTabSetting,mTabNew;

    private Fragment mHomeFrag;
    private Fragment mTypeFrag;
    private Fragment mSettingFrag;
    private Fragment mNewFrag;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test2);

        mTabHome = (TextView) this.findViewById(R.id.aty_bottom_home);
        mTabType = (TextView) this.findViewById(R.id.aty_bottom_type);
        mTabSetting = (TextView) this.findViewById(R.id.aty_bottom_settings);
        mTabNew = (TextView) this.findViewById(R.id.aty_bottom_new);

        mTabHome.setOnClickListener(this);
        mTabType.setOnClickListener(this);
        mTabSetting.setOnClickListener(this);
        mTabNew.setOnClickListener(this);

        setDefaultFragment();
    }

    /**
     * 设置默认的Fragment
     */
    private void setDefaultFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        mHomeFrag = new HomeFragment();
        transaction.replace(R.id.aty_layout_content, mHomeFrag);
        transaction.commit();
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        switch (v.getId()) {
            case R.id.aty_bottom_home:
                if (mHomeFrag == null) {
                    mHomeFrag = new HomeFragment();
                }
                transaction.replace(R.id.aty_layout_content, mHomeFrag);
                break;

            case R.id.aty_bottom_type:
                if (mTypeFrag == null) {
                    mTypeFrag = new TypeFragment();
                }
                transaction.replace(R.id.aty_layout_content, mTypeFrag);
                break;

            case R.id.aty_bottom_settings:
                if (mSettingFrag == null) {
                    mSettingFrag = new SettingsFragment();
                }
                transaction.replace(R.id.aty_layout_content, mSettingFrag);
                break;

            case R.id.aty_bottom_new:
                if (mNewFrag == null) {
                    mNewFrag = new NewFragment();
                }
                transaction.replace(R.id.aty_layout_content, mNewFrag);
                break;

            default:
                break;
        }
        transaction.commit();
    }
}
