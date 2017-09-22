package com.jiyun.admin.mytouchtext;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by admin on 2017/9/4.
 */

public class MyTextView extends android.support.v7.widget.AppCompatAutoCompleteTextView{


    private static final String TAG = "我的文字控件";


    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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
//        return super.onTouchEvent(event) ;
        return false;
//        return true;
    }

}
