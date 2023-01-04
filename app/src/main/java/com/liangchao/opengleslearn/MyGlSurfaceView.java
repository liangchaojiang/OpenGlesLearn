package com.liangchao.opengleslearn;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class MyGlSurfaceView extends GLSurfaceView {

    private final MyRender myRender;
    public MyGlSurfaceView(Context context) {
        super(context);

        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2);
        myRender = new MyRender();
        setRenderer(myRender);
    }
}
