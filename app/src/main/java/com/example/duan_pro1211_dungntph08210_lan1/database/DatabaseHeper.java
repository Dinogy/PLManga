package com.example.duan_pro1211_dungntph08210_lan1.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import androidx.annotation.Nullable;

import com.example.duan_pro1211_dungntph08210_lan1.dao.TruyenDAO;

public class DatabaseHeper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="dbtruyentranh";
    public static final int VERSION=1;


    public DatabaseHeper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
db.execSQL(TruyenDAO.SQL_TRUYEN);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TruyenDAO.TABLE_NAME);
    }
}
