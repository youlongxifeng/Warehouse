package com.example.warehouse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("YYY","develop==============第一次提交的分支代码");
        Log.i("YYY","develop==============第二次提交的分支代码");
        firstTime();
        firstTime("===========");
    }

    void firstTime(){
        Log.i("YYY","develop==============第一次提交的分支代码");
    }
    void firstTime(String str){
        Log.i("YYY","develop==============第一次提交的分支代码");
    }
}
