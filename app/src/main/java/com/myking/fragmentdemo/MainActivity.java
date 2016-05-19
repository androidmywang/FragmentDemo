package com.myking.fragmentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.myking.fragmentdemo.test1.Test1;
import com.myking.fragmentdemo.test2.Test2;
import com.myking.fragmentdemo.test3.Test3;
import com.myking.fragmentdemo.test4.Test4;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) this.findViewById(R.id.btn_1);
        btn2 = (Button) this.findViewById(R.id.btn_2);
        btn3 = (Button) this.findViewById(R.id.btn_3);
        btn4 = (Button) this.findViewById(R.id.btn_4);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_1:
                Intent intent = new Intent(this, Test1.class);
                startActivity(intent);
                break;

            case R.id.btn_2:
                intent = new Intent(this, Test2.class);
                startActivity(intent);
                break;

            case R.id.btn_3:
                intent = new Intent(this, Test3.class);
                startActivity(intent);
                break;
            case R.id.btn_4:
                intent = new Intent(this, Test4.class);
                startActivity(intent);
                break;

            default:
                break;
        }
    }
}
