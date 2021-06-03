package com.example.newcontacts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvName;
    private TextView tvNumber;
    private String name;
    private String phone_et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();//初始化控件

    }

    public void click(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivityForResult(intent, 1);
    }

    private void initView() {
        tvName = (TextView) findViewById(R.id.tv_name);
        tvNumber = (TextView) findViewById(R.id.tv_number);
    }

    //数据传输
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            if (resultCode == 1) {
                if (requestCode == 1) {
                    try {
                        name = data.getStringExtra("name");
                        phone_et = data.getStringExtra("phone");
                    } catch (Exception e) {
                    }
                    if (name != null) {
                        tvName.setText("用户名:" + name);
                    }
                    if (phone_et != null) {
                        tvNumber.setText("密    码:" + phone_et);
                    }
                }
            }
        }
    }


}
