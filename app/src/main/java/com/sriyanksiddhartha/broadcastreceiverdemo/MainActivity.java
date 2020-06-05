package com.sriyanksiddhartha.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Author: Sriyank Siddhartha
 * <p>
 * Module 2: Creating BroadcastReceiver Statically
 * <p>
 * "AFTER" project
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendBroadcastMessage(View view) {

        Intent intent = new Intent("my.custom.action.name");
        sendBroadcast(intent);
    }

  /*  public void broadcastToInnerReceiver(View view) {

		Intent intent = new Intent("my.custom.action.name");
        sendBroadcast(intent);
    }*/


    public static class MyThirdReceiverInner extends BroadcastReceiver {

        private static final String TAG = MyThirdReceiverInner.class.getSimpleName();

        @Override
        public void onReceive(Context context, Intent intent) {

            Log.i(TAG, "Hello from 3rd Receiver");
            Toast.makeText(context, "Hello from 3rd Receiver", Toast.LENGTH_LONG).show();
        }
    }
}
