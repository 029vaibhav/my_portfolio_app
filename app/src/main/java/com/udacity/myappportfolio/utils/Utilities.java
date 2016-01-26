package com.udacity.myappportfolio.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by vaibhav on 26/1/16.
 */
public class Utilities {

    public static void toast(Context context, String message) {
        if (context != null) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
    }
}
