package com.educationplatform.androideducationplatform.utils;

import android.app.Activity;
import android.content.Intent;

import com.educationplatform.androideducationplatform.MainActivity;

/**
 * Created by Nick on 5/20/2016.
 * This class is to be used for all app navigation
 */
public final class UtilsNavigation {
    public final static int ACTIVITY_MAIN = 0;

    public static void startActivity(Activity activity, int activityCode) {
        Intent intent = new Intent(activity, getActivityFromCode(activityCode));
        activity.startActivity(intent);
    }

    private static Class getActivityFromCode(int activityCode) {
        switch(activityCode) {
            case ACTIVITY_MAIN:
                return MainActivity.class;
        }
        return null;
    }
}
