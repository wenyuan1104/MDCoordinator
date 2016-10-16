package com.akazam.mdcoordinator.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.akazam.mdcoordinator.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButton;
    private Button mButton2;
    private Button mButton3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mButton = (Button) findViewById(R.id.button);
        mButton2 = (Button) findViewById(R.id.button2);
        mButton3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        mButton.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.button:
                intent.setClass(this, SimpleActivity.class);
                break;
            case R.id.button2:
                intent.setClass(this, DemoActivity.class);
                break;
            case R.id.button3:
                intent.setClass(this, NewActivity.class);
                break;
            case R.id.button4:
                intent.setClass(this, TabLayoutActivity.class);
                break;
            case R.id.button5:
                intent.setClass(this, DialogActivity.class);
                break;
            case R.id.button6:
                intent.setClass(this, New2Activity.class);
                break;
            case R.id.button7:
                intent.setClass(this, Main7Activity.class);
                break;
            case R.id.button8:
                intent.setClass(this, PaletteActivity.class);
                break;
        }
        startActivity(intent);
    }
}
