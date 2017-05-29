package com.example.kianomdharmabekti.bismaoperation_guru.Preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import com.example.kianomdharmabekti.bismaoperation_guru.Activity.LoginActivity;
import com.example.kianomdharmabekti.bismaoperation_guru.Model.APIGuruLogin;

import java.util.HashMap;

/**
 * Created by mery on 5/25/2017.
 */
public class SessionManager {
    SharedPreferences pref;

    // Editor for Shared preferences
    SharedPreferences.Editor editor;

    // Context
    Context _context;

    // Shared pref mode
    int PRIVATE_MODE = 0;

    // Sharedpref file name
    private static final String PREF_NAME = "TournesiaPref";

    // All Shared Preferences Keys

    //START USER-DATA
    private static final String IS_LOGIN = "IsLoggedIn";
    public static final String KEY_USERID = "user_id";
    public static final String KEY_NAMA_DEPAN = "nama_depan";
    public static final String KEY_NAMA_BELAKANG = "nama_belakang";
    public static final String KEY_TEMPAT_LAHIR = "tampat_lahir";
    public static final String KEY_TANGGAL_LAHIR = "tanggal_lahir";
    public static final String KEY_TELEPON = "telepon";
    public static final String KEY_KELAMIN = "kelamin";
    public static final String KEY_ALAMAT = "alamat";
    public static final String KEY_RIWAYAT = "riwayat_pendidikan";
    public static final String KEY_MAPEL = "mata_pelajaran";
    public static final String KEY_HARGA = "harga";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_USERNAME = "username";
    public static final String KEY_BILLING = "billing";
    public static final String KEY_STATUS = "status";
    public static final String KEY_PROFIL = "profil";
    //END USER-DATA

    // Constructor
    public SessionManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    /**
     * Create login session
     */
    public void createLoginSession(APIGuruLogin user) {
        // Storing login value as TRUE
        editor.putBoolean(IS_LOGIN, true);
        // Storing  in pref
        editor.putString(KEY_USERID, String.valueOf(user.getRespon().getId()));
        editor.putString(KEY_NAMA_DEPAN, user.getRespon().getNama_depan());
        editor.putString(KEY_NAMA_BELAKANG, user.getRespon().getNama_belakang());
        editor.putString(KEY_TEMPAT_LAHIR, user.getRespon().getTempat_lahir());
        editor.putString(KEY_TANGGAL_LAHIR, user.getRespon().getTanggal_lahir());
        editor.putString(KEY_TELEPON, user.getRespon().getTelepon());
        editor.putString(KEY_KELAMIN, user.getRespon().getKelamin());
        editor.putString(KEY_RIWAYAT, user.getRespon().getRiwayat_pendidikan());
        editor.putString(KEY_MAPEL, user.getRespon().getMata_pelajaran());
        editor.putString(KEY_HARGA, user.getRespon().getHarga());
        editor.putString(KEY_ALAMAT, user.getRespon().getAlamat());
        editor.putString(KEY_EMAIL, user.getRespon().getEmail());
        editor.putString(KEY_USERNAME, user.getRespon().getUsername());
        editor.putString(KEY_BILLING, user.getRespon().getBilling());
        editor.putString(KEY_STATUS, user.getRespon().getStatus());
        editor.putString(KEY_PROFIL, user.getRespon().getProfil());

        // commit changes
        editor.commit();
    }

    /**
     * Check login method wil check user login status
     * If false it will redirect user to login page
     * Else won't do anything
     */
    public void checkLogin() {
        // Check login status
        if (!this.isLoggedIn()) {
            // user is not logged in redirect him to Login Activity
            Intent i = new Intent(_context, LoginActivity.class);
            // Closing all the Activities
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

            // Add new Flag to start new Activity
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            // Staring Login Activity
            _context.startActivity(i);
        }
    }

    /**
     * Get stored session data
     */
    public HashMap<String, String> getUserDetails() {
        HashMap<String, String> user = new HashMap<String, String>();

        // user data
        user.put(KEY_USERID, pref.getString(KEY_USERID, null));
        user.put(KEY_NAMA_DEPAN, pref.getString(KEY_NAMA_DEPAN, null));
        user.put(KEY_NAMA_BELAKANG, pref.getString(KEY_NAMA_BELAKANG, null));
        user.put(KEY_TEMPAT_LAHIR, pref.getString(KEY_TEMPAT_LAHIR, null));
        user.put(KEY_TANGGAL_LAHIR, pref.getString(KEY_TANGGAL_LAHIR, null));
        user.put(KEY_TELEPON, pref.getString(KEY_TELEPON, null));
        user.put(KEY_KELAMIN, pref.getString(KEY_KELAMIN, null));
        user.put(KEY_ALAMAT, pref.getString(KEY_ALAMAT, null));
        user.put(KEY_RIWAYAT, pref.getString(KEY_RIWAYAT, null));
        user.put(KEY_MAPEL, pref.getString(KEY_MAPEL, null));
        user.put(KEY_HARGA, pref.getString(KEY_HARGA, null));
        user.put(KEY_EMAIL, pref.getString(KEY_EMAIL, null));
        user.put(KEY_USERNAME, pref.getString(KEY_USERNAME, null));
        user.put(KEY_BILLING, pref.getString(KEY_BILLING, null));
        user.put(KEY_STATUS, pref.getString(KEY_STATUS, null));
        user.put(KEY_PROFIL, pref.getString(KEY_PROFIL, null));
        // return user
        return user;
    }
    /**
     * Clear session details
     */
    public void logoutUser() {
        // Clearing all data from Shared Preferences
        editor.clear();
        editor.commit();

        // After logout redirect user to Loing Activity
        Intent i = new Intent(_context, LoginActivity.class);
        // Closing all the Activities
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);

        // Staring Login Activity
        _context.startActivity(i);
    }

    /**
     * Quick check for login
     **/
    // Get Login State
    public boolean isLoggedIn() {
        return pref.getBoolean(IS_LOGIN, false);
    }

}
