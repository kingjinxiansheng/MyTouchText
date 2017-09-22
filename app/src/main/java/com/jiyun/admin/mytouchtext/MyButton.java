package com.jiyun.admin.mytouchtext;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by admin on 2017/9/6.
 */

public class MyButton extends android.support.v7.widget.AppCompatButton {

    private static final String TAG = "我的按钮";


    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG,"dispatchTouchEvent==触摸");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG,"dispatchTouchEvent==抬起");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG,"dispatchTouchEvent==移动");
                break;
        }

        Log.e(TAG, "dispatchTouchEvent==执行了");
        return super.dispatchTouchEvent(event);
//        return false;
//        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG,"onTouchEvent==触摸");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG,"onTouchEvent==抬起");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG,"onTouchEvent==移动");
                break;
        }

        Log.e(TAG, "onTouchEvent==执行了");
        return super.onTouchEvent(event) ;
//        return false;
//        return true;
    }
}
