package com.soz.sozTest.launchMode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.soz.activity.BaseActivity;
import com.soz.log.Logger;
import com.soz.sozTest.R;

/**
 * fist activity for test
 * Created by zhushaolong on 7/14/16.
 */
public class TestOneActivity extends BaseActivity implements View.OnClickListener{
    Logger mLogger = new Logger("TestOnActivity");
    Button testA;
    Button testB;
    Button testC;

    @Override
    public void onCreate(Bundle onSaveInstanced) {
        mLogger.i("onCreate");
        super.onCreate(onSaveInstanced);
        this.setContentView(R.layout.act_launch_test);
        this.initView();
        this.initEvent();
    }

    /**
     * initialize view
     */
    private void initView() {
        testA = (Button) findViewById(R.id.testA);
        testB = (Button) findViewById(R.id.testB);
        testC = (Button) findViewById(R.id.testC);
    }

    /**
     * initialize event
     */
    private void initEvent() {
        this.testA.setOnClickListener(this);
        this.testB.setOnClickListener(this);
        this.testC.setOnClickListener(this);
    }

    @Override
    public void onRestart() {
        mLogger.i("onRestart");
        super.onRestart();
    }

    @Override
    public void onStart() {
        mLogger.i("onStart");
        super.onStart();
    }

    @Override
    public void onNewIntent(Intent intent) {
        mLogger.i("onNewIntent");
        super.onNewIntent(intent);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        mLogger.i("RestoreInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onResume() {
        mLogger.i("onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        mLogger.i("onPause");
        super.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        mLogger.i("onSaveInstanceState");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStop() {
        mLogger.i("onStop");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        mLogger.i("onDestroy");
        super.onDestroy();
    }

    private void gotoTestA() {
        Intent intent = new Intent(this, TestOneActivity.class);
        this.startActivity(intent);
    }

    private void gotoTestB() {
        Intent intent = new Intent(this, TestTwoActivity.class);
        this.startActivity(intent);
    }

    private void gotoTestC() {
        Intent intent = new Intent(this, TestThreeActivity.class);
        this.startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.testA:
                gotoTestA();
                break;
            case R.id.testB:
                gotoTestB();
                break;
            case R.id.testC:
                gotoTestC();
                break;
        }
    }
}
