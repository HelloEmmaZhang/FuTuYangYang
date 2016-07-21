package com.example.futuyangyang2.common.core;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;

import com.example.futuyangyang2.common.widget.Rotate3DProgressDialog;

/**
 * Created by Administrator on 2016/7/21.
 */
public class BaseActivity extends Activity {
    private ProgressDialog mProgressDialog;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    //显示加载框
    public  void showLoadingDialog(){
        if (mProgressDialog==null){
            mProgressDialog=new Rotate3DProgressDialog(this);
        }
        mProgressDialog.show();
    }
    //隐藏加载框
    public  void  dismissLoadingDialog(){
        if (mProgressDialog!=null){
            mProgressDialog.dismiss();
        }
    }
    //解析意图
    protected void parseIntent(Intent intent){

    }
    protected void parseIntent(){

    }

    @Override
    protected void onResume() {
        super.onResume();
        //友盟,还没集成
//   MobclickAgent.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
//  MobclickAgent.onPause(this);
    }
}
