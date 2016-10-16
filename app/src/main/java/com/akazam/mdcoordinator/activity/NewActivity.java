package com.akazam.mdcoordinator.activity;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.akazam.mdcoordinator.R;

public class NewActivity extends AppCompatActivity {

    private EditText input_1;
    private TextInputLayout textinputlayout;
    private EditText input_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        initView();
        initData();
        initData2();
    }

    private void initView() {
        input_1 = (EditText) findViewById(R.id.input_1);
        textinputlayout = (TextInputLayout) findViewById(R.id.textinputlayout);
        input_2 = (EditText) findViewById(R.id.input_2);
    }

    private void initData() {
        // 设置提示文本
        input_1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 5) {
                    // 设置错误提示
                    textinputlayout.setErrorEnabled(true);
                    textinputlayout.setError("邮箱名过长！");
                } else {
                    textinputlayout.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    private void initData2() {
        // 设置提示文本
        input_2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 5)
                    input_2.setError("邮箱名过长！");
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }
}
