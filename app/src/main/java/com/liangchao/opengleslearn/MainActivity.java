package com.liangchao.opengleslearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MyGlSurfaceView myGlSurfaceView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myGlSurfaceView = new MyGlSurfaceView(this);
        setContentView(myGlSurfaceView);
    }
}