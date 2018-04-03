package com.example.wissal1.rbmapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by USER on 30/03/2018.
 */

public class SmsBroadcastReceiver extends BroadcastReceiver {
    public static final String SMS_BUNDLE = "pdus";
    String smsMessage ;

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle intentExtras = intent.getExtras();

        if (intentExtras != null) {

            Object[] sms = (Object[]) intentExtras.get(SMS_BUNDLE);
            Object[] pdus = (Object[]) intentExtras.get("pdus");

            if (pdus.length < 1) return; // Invalid SMS. Not sure that it's possible.

            StringBuilder sb = new StringBuilder();
            String sender = null;
            for (int i = 0; i < pdus.length; i++) {
                SmsMessage message = SmsMessage.createFromPdu((byte[]) pdus[i]);
                if (sender == null) sender = message.getOriginatingAddress();
                smsMessage = message.getMessageBody();
                if (smsMessage != null) sb.append(smsMessage);
            }
            if (sender != null && sender.equals("123")) {
                // Process our sms...
                abortBroadcast();
                String t="smsMessage.charAt(3)"+"smsMessage.charAt(4)";
                System.out.print("ok");
                Main3Activity inst = Main3Activity.instance();
                inst.createTemperature( sender , t);


            }

        }
    }
}
