package com.jiyun.admin.mytouchtext;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener, View.OnTouchListener{
    private static final String TAG = "MainActivity";
    private MyTextView mytv;
    private MyButton mybtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mytv = (MyTextView) findViewById(R.id.mytv);

        mytv.setOnClickListener(this);
        mytv.setOnTouchListener(this);


        mybtn = (MyButton) findViewById(R.id.mybtn);

        mybtn.setOnTouchListener(this);
        mybtn.setOnClickListener(this);
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
//        return true;
//        return false;
        return super.dispatchTouchEvent(ev);

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

        Log.e(TAG, "dispatchTouchEvent==执行了");
        return super.onTouchEvent(event);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.mytv:
                Log.e(TAG, "我的文字控件==onClick");
                break;
            case R.id.mybtn:
                Log.e(TAG, "我的按钮==onClick");
                break;
        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (view.getId()){
            case R.id.mytv:
                Log.e(TAG, "我的文字控件==onTouch执行了");
                switch (motionEvent.getAction()) {

                    case MotionEvent.ACTION_DOWN:
                        Log.e(TAG, "我的文字控件==onTouch==触摸");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.e(TAG, "我的文字控件==onTouch==抬起");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.e(TAG, "我的文字控件==onTouch==移动");
                        break;
                }
                break;
            case R.id.mybtn:

                Log.e(TAG, "我的按钮==onTouch执行了");

                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.e(TAG, "我的按钮==onTouch==触摸");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.e(TAG, "我的按钮==onTouch==抬起");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.e(TAG, "我的按钮==onTouch==移动");
                        break;
                }
                break;
        }

        return false;
    }
}
