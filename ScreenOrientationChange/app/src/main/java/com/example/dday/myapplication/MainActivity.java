package com.example.dday.myapplication;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private String TAG=MainActivity.class.getSimpleName();
    private EditText et;

    /*onCreate only one Time in Lunching Time,
    it will call single time*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"In OnCreate");
        et=(EditText) findViewById(R.id.editText);
    }



    /*After onCreate It will call/after returning from another app/after calling onRestart*/

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"In OnStart");
    }

    /*When the screen orientation of mobile is change then it will called after onPause  */

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"onSaveInstanceState");
        outState.putString("hey",et.getText().toString());
    }


    /*After calling onStart it will be called */

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"In OnResume");
    }



    /*When a activity/app is closed/user press home button/swap another app
    then it will be called */
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"In OnPause");
    }


    
    /*After changes the screen whole app will be started once again and it will called before onResume*/

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG,"onRestoreInstanceState");
        et.setText(savedInstanceState.getString("hey"));
    }



    /*When app is closed before destroy the activity /swap by another app then it will be called*/

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"In OnStop");
    }

    /*After resuming app in background,When it onRestarted by user it will be called
    "It will call single time" */


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"In OnRestart");
    }

    /*In time of closing a app /press the back button it will be called */


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"In OnDestroy");
    }
}
