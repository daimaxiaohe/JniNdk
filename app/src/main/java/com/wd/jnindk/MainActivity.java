package com.wd.jnindk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("hello_jni");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取控件  给控件设置文本
        TextView tv = findViewById(R.id.tv);
        tv.setText(getHellow());
    }
    //c++本地方法
    public native String getHellow();
}
