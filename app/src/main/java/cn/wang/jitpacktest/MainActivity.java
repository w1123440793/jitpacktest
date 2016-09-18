package cn.wang.jitpacktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import jitpacktest.wang.cn.mylibrary.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Test.log();
    }
}
