package com.example.poultryfarmingapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

public class SessionManager {

    // LogCat tag
    private static String TAG = SessionManager.class.getSimpleName();

    // Shared Preferences
    SharedPreferences pref;

    SharedPreferences.Editor editor;
    Context _context;

    // Shared pref mode
    int PRIVATE_MODE = 0;

    // Shared preferences file name
    private static final String PREF_NAME = "AndroidHiveLogin";

    private static final String KEY_IS_USER_LOGGEDIN = "isUserLoggedIn";
    private static final String KEY_IS_VOLUNTEER_LOGGEDIN = "isVolunteerLoggedIn";
    private static final String KEY_IS_ADMIN_LOGGEDIN = "isAdminLoggedIn";

    public SessionManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setUserLogin(boolean isLoggedIn) {

        editor.putBoolean(KEY_IS_USER_LOGGEDIN , isLoggedIn);
        editor.commit();
    }

    public boolean isUserLoggedIn() {
        return pref.getBoolean(KEY_IS_USER_LOGGEDIN, false);
    }


    public void setVolunteerLogin(boolean isLoggedIn) {

        editor.putBoolean(KEY_IS_VOLUNTEER_LOGGEDIN, isLoggedIn);
        editor.commit();
    }

    public boolean isVolunteerLoggedIn() {
        return pref.getBoolean(KEY_IS_VOLUNTEER_LOGGEDIN, false);
    }


    public void setAdminLogin(boolean isLoggedIn) {

        editor.putBoolean(KEY_IS_ADMIN_LOGGEDIN, isLoggedIn);
        editor.commit();
    }

    public boolean isAdminLoggedIn() {
        return pref.getBoolean(KEY_IS_ADMIN_LOGGEDIN, false);
    }

}
