package com.example.warehouse;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.warehouse.base.BaseActivity;

import java.util.List;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("YYY","develop==============第一次提交的分支代码");
        Log.i("YYY","develop==============第二次提交的分支代码");
        firstTime();
       switchIcon(1);
    }

    void firstTime(){
        Log.i("YYY","develop= =====第一次提交的分支代码");
        Log.i("YYY","develop= =====第一次提交的分支代码");
        Log.i("YYY","develop= =====第一次提交的分支代码");
        Log.i("YYY","develop= =====第一次提交的分支代码");
    }
    void firstTime2(String str){
        Log.i("YYY","develop======= ===第一次提交的分支代码");
    } void firstTime3(String str){
        Log.i("YYY","develop==============第一次提交的分支代码");
    } void firstTime4(String str){
        Log.i("YYY","develop==============第一次提交的分支代码");
    } void firstTime5(String str){
        Log.i("YYY","develop==============第一次提交的分支代码");
    }



    private void switchIcon(int useCode) {

        try {
            //要跟manifest的activity-alias 的name保持一致
            String icon_tag = "com.example.warehouse.icon_tag";
            String icon_tag_1212 = "com.example.warehouse.icon_tag_1212";

            if (useCode != 3) {

                PackageManager pm = getPackageManager();

                ComponentName normalComponentName = new ComponentName(
                        getBaseContext(),
                        icon_tag);
                //正常图标新状态
                int normalNewState = useCode == 2 ? PackageManager.COMPONENT_ENABLED_STATE_ENABLED
                        : PackageManager.COMPONENT_ENABLED_STATE_DISABLED;
                if (pm.getComponentEnabledSetting(normalComponentName) != normalNewState) {//新状态跟当前状态不一样才执行
                    pm.setComponentEnabledSetting(
                            normalComponentName,
                            normalNewState,
                            PackageManager.DONT_KILL_APP);
                }

                ComponentName actComponentName = new ComponentName(
                        getBaseContext(),
                        icon_tag_1212);
                //正常图标新状态
                int actNewState = useCode == 1 ? PackageManager.COMPONENT_ENABLED_STATE_ENABLED
                        : PackageManager.COMPONENT_ENABLED_STATE_DISABLED;
                if (pm.getComponentEnabledSetting(actComponentName) != actNewState) {//新状态跟当前状态不一样才执行

                    pm.setComponentEnabledSetting(
                            actComponentName,
                            actNewState,
                            PackageManager.DONT_KILL_APP);
                }

            }
        } catch (Exception e) {
        }
    }

}
