package com.example.newcontacts;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private EditText et_name, et_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();//初始化控件
    }

    private void initView() {
        et_name = (EditText) findViewById(R.id.et_name);
        et_phone = (EditText) findViewById(R.id.et_phone);

    }

    //点击完成按钮执行的方法
    public void complete(View view) {
        String name = et_name.getText().toString().trim();
        String phone = et_phone.getText().toString().trim();
        Intent intent = new Intent();
        intent.putExtra("name", name);
        intent.putExtra("phone", phone);
        setResult(1, intent);
        this.finish();
    }
}