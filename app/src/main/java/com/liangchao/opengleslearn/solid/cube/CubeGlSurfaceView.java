package com.liangchao.opengleslearn.solid.cube;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class CubeGlSurfaceView extends GLSurfaceView {

    private CubeRender cubeRender;

    public CubeGlSurfaceView(Context context) {
        super(context);
        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2);
        cubeRender = new CubeRender(getResources());
        setRenderer(cubeRender);
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }
}
