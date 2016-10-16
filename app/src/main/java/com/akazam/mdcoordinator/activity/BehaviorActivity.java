package com.akazam.mdcoordinator.activity;

import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.akazam.mdcoordinator.R;

public class BehaviorActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView depentent;
    private Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behavior);
        initView();
    }

    private void initView() {
        depentent = (TextView) findViewById(R.id.depentent);
        depentent.setOnClickListener(this);
        but = (Button) findViewById(R.id.but);
        but.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.depentent:
                ViewCompat.offsetTopAndBottom(view, 5);
                break;
            case R.id.but:
                ViewCompat.offsetTopAndBottom(view, 10);
                break;
        }
    }
}
