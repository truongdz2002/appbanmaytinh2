package com.example.appbanmaytinh.computer.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.appbanmaytinh.computer.khachhang;

public class khDBHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "quanlymaytinh.sqlite";
    public static final int DB_VERSION = 1;
    public static final String TB_NAME = "tbl_khachhang";
    public Context context;

    public khDBHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "CREATE TABLE IF NOT EXISTS " + TB_NAME + "( Gmail VARCHAR(30) PRIMARY KEY , Password VARCHAR(30) , RePassword VARCHAR(30))";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String sql = "DROP TABLE IF EXISTS " + TB_NAME;
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase);
    }

    public void insertKH(khachhang khachhang) {
//        ContentValues contentValues = new ContentValues();
//        //put du lieu can insert vao doi tuong contentValues
//        contentValues.put("Gmail", khachhang.getGmail());
//        contentValues.put("Password", khachhang.getPassword());
//        contentValues.put("RePassword", khachhang.getRePassword());
        //lay ra sqliteDatabase de ghi du lieu
        SQLiteDatabase db = getWritableDatabase();
        String sql = "INSERT INTO " + TB_NAME + " VALUES(" + khachhang.getGmail() + "," + khachhang.getPassword() + "," + khachhang.getRePassword() +")";
        db.execSQL(sql);
//        long result = db.insert(TB_NAME, null, contentValues);
//        if (result != -1)
//            Toast.makeText(context, "Register successfully!", Toast.LENGTH_LONG).show();
//        else
//            Toast.makeText(context, "Register failed !", Toast.LENGTH_LONG).show();
    }

//    public boolean checkLogin(String gmailLogin, String passwordLogin) {
//        SQLiteDatabase database = getReadableDatabase();
//        String sql = "SELECT * FROM " + TB_NAME + " WHERE Gmail = " + gmailLogin + " AND Password = " + passwordLogin;
//        Cursor cursor = database.rawQuery(sql, null);
//        if (cursor.getCount() != 0) {
//            return true;
//        } else return false;
//    }

}
