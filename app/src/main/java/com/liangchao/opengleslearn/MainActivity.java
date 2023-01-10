package com.liangchao.opengleslearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.liangchao.opengleslearn.solid.cube.CubeGlSurfaceView;

public class MainActivity extends AppCompatActivity {
    MyGlSurfaceView myGlSurfaceView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myGlSurfaceView = new MyGlSurfaceView(this);
        CubeGlSurfaceView cubeGlSurfaceView = new CubeGlSurfaceView(this);
        setContentView(cubeGlSurfaceView);
    }
}