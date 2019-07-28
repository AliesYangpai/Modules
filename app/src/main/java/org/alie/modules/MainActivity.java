package org.alie.modules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.alie.m1.M1Activity;
import org.alie.m2.M2Activity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    private void initView() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
    }

    private void initListener() {
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                openActivity(M1Activity.class);
                break;
            case R.id.btn2:
                openActivity(M2Activity.class);
                break;
        }
    }

    private void openActivity(Class<?> mClass) {
        Intent intent = new Intent(this, mClass);
        startActivity(intent);
    }
}
