package com.jiyun.admin.mytouchtext;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by admin on 2017/9/5.
 */

public class MyRelativeLayout extends RelativeLayout {
    private static final String TAG = "绝对布局";

    public MyRelativeLayout(Context context) {
        super(context);
    }

    public MyRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "dispatchTouchEvent==触摸");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "dispatchTouchEvent==抬起");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "dispatchTouchEvent==移动");
                break;
        }
        Log.e(TAG, "dispatchTouchEvent==执行了");
       return super.dispatchTouchEvent(ev);
//      return true;
//      return false;

    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "onInterceptTouchEvent==触摸");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "onInterceptTouchEvent==抬起");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "onInterceptTouchEvent==移动");
                break;
        }
        Log.e(TAG, "onInterceptTouchEvent==执行了");
                return super.onInterceptTouchEvent(ev);
//        return true;
//        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "onTouchEvent==触摸");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "onTouchEvent==抬起");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "onTouchEvent==移动");
                break;
        }
        Log.e(TAG, "onTouchEvent==执行了");
      return super.onTouchEvent(event);
//      return true;
//      return false;
    }

}
