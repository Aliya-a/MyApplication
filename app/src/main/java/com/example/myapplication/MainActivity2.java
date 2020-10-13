package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import java.util.logging.LogRecord;

public class MainActivity2 extends AppCompatActivity {
    private static final String TAG = "MainActivity2";
    Handler handler;


    private float euroRate;
    private float wonRate;
    private float dollarRate;
    private Runnable target;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void openOne(View btn) {
        Intent config = new Intent(this, MainActivity2.class);
        setContentView(R.layout.activity_main2);
        config.putExtra("dollar_rate_key", dollarRate);
        config.putExtra("euro_rate_key", euroRate);
        config.putExtra("won_rate_key", wonRate);
        Log.i(TAG, "open one:dollarRate=" + dollarRate);
        Log.i(TAG, "open one:euroRate=" + euroRate);
        Log.i(TAG, "open one:wonRate=" + wonRate);

        startActivity(config);

        SharedPreferences sp =
                getSharedPreferences("myrate", Activity.MODE_PRIVATE);

        SharedPreferences.Editor editor = sp.edit();
        editor.putFloat("dollar_rate", dollarRate);
        editor.putFloat("euro_rate", euroRate);
        editor.putFloat("won_rate", wonRate);
        editor.apply();

    }
protected  void OnCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Thread t=new Thread( target :this);
        t.start();
    handler=new Handler() {
        @Override
        public void handleMessage (Message msg) {

            if (msg.what == 5) {
                String str = (String) msg.obj;
                Log.i(TAG, "handleMgessage:getMessage msg=" + str);
                // show.setText(str);
            }
            super.handleMessage(msg);
        };





    }
    public void run(){
        Log.i(TAG, "run:run()......" );
        Message msg=handler.obtainMessage(what:5);
        msg.obj="Hello from run()";
        handler.sedMessage(msg);
    }

    }

}
