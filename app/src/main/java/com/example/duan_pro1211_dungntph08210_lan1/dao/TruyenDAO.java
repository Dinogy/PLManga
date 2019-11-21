package com.example.duan_pro1211_dungntph08210_lan1.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.duan_pro1211_dungntph08210_lan1.database.DatabaseHeper;
import com.example.duan_pro1211_dungntph08210_lan1.model.truyen;

public class TruyenDAO {

 public static final String TABLE_NAME="truyen";
 public static final String SQL_TRUYEN="CREATE TABLE truyen(tentruyen text PRIMARY KEY,tacgia text,chap text,dichgia text)";


 DatabaseHeper databaseHeper;
 SQLiteDatabase db;

 public TruyenDAO(Context context){
databaseHeper=new DatabaseHeper(context);
db = databaseHeper.getWritableDatabase();
 }

 public boolean inserttruyen(truyen truyen){
     ContentValues values=new ContentValues();
     values.put("tentruyen",truyen.getTentruyen());
     values.put("tacgia",truyen.getTacgia());
     values.put("chap",truyen.getChap());
     values.put("dichgia",truyen.getDichgia());
     long resurt=db.insert(TABLE_NAME,null,values);
try {
if (resurt==-1){
    return false;
}
}
catch (Exception e){
    return false;
}
return true;
 }
}
