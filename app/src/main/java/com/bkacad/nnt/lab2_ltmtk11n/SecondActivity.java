package com.bkacad.nnt.lab2_ltmtk11n;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView tvResult, tvResultText;
    private int result;


    private void initView(){
        tvResult = findViewById(R.id.tv_second_result);
        tvResultText = findViewById(R.id.tv_second_result_text);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
        // Lay du lieu tu main activity
        Intent mIntent = getIntent();
        result = mIntent.getIntExtra("number", 0);
        // Do du lieu ra view
        tvResult.setText(String.valueOf(result));

        tvResultText.setText("Bằng chữ: "+ NumToViet.num2String(result));

    }

    public void backPreviousActivity(View view) {
        onBackPressed();
    }
}