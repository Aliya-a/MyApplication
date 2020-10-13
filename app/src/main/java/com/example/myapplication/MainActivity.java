package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText inp;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取控件
        TextView outobj = findViewById(R.id.out);
        outobj.setText("kkkk");
        Log.i(TAG, "onCreate:msg....");
        EditText inp = findViewById(R.id.inp);
        String text = inp.getText().toString();
        float t = Float.parseFloat(text);
    }

    public void open(View V) {
        //Intent second=new Intent(packageContext:this,MainActivity2.class);
        //Intent second=new Intent(getApplicationContext(): this,MainActivity2.class);

   }

    public void dollar(View btn) {
        if (inp.getText().toString() == null) {
            //Toast.makeText(Context:this，text:"请输入金额"，Toast.LENGTH_SHORT).show();
            //  Toast.makeText(Context:this，text:"请输入金额"，Toast.LENGTH_SHORT);
        } else if (btn.getId() == R.id.btn_eruo) {

        }

        if (btn.getId() == R.id.btn_dollar) {

        } else if (btn.getId() == R.id.btn_eruo) {

        } else if (btn.getId() == R.id.btn_won) {

        }

       /// public void openOne (View btn){
           // Intent config = new Intent(this, MainActivity2.class);
           // public boolean onCreateOptionsMenu (Menu menu){
             //   getMenuInflater().inflate(R.menu.first_menu, menu);
             //   return super.onCreateOptionsMenu(menu);

           // }
           // public boolean onOptionsItemSelected ( MenuItem item){
                // if(item.getItemId()==R.id.menu_set){
               // return super.onOptionsItemSelected(item);
           // }

       // }

    }


}

