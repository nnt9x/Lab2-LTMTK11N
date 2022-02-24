package com.bkacad.nnt.lab2_ltmtk11n;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private int currentNumber = 0;

    private void initView(){
        tvResult = findViewById(R.id.tv_main_result);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void IncrementNumber(View view) {
        // Tăng biến đếm lên 1 đơn vi -> cập nhật giá trị trên TextView Result
        if(currentNumber < 100){
            currentNumber ++;
            tvResult.setText(String.valueOf(currentNumber));
        }
        else{
            Toast.makeText(MainActivity.this, "Tối đa 100", Toast.LENGTH_SHORT).show();
        }
    }

    public void DecrementNumber(View view) {
        if(currentNumber > 0){
            currentNumber --;
            tvResult.setText(String.valueOf(currentNumber));
        }
        else{
            Toast.makeText(MainActivity.this, "Tối thiểu 0", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToSecondActivity(View view) {
        Intent in = new Intent(MainActivity.this, SecondActivity.class);
        in.putExtra("number",currentNumber);
        startActivity(in);
    }
}