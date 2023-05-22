package com.example.todo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHandler extends SQLiteOpenHelper {
    public static final String TABLE_NAME = "tasks";
    public static final String COL_1 = "id";
    public static final String COL_2 = "data";
    public static final String DB_Name = "TodoDb";
    public static final int DB_VERSION = 1;


    public DBHandler(@Nullable Context context) {
        super(context, DB_Name, null, DB_VERSION);
        // on below line we are creating a variable for
        // our sqlite database and calling writable method
        // as we are writing data in our database.
        SQLiteDatabase db = this.getWritableDatabase();
    }

    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME + "("
                + COL_1 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COL_2 + " TEXT)";
        db.execSQL(query);


    }
    public void addData(String data)
    {

    }


    public void onUpgrade(SQLiteDatabase db,int oldVersion, int newVersion)
    {
        String Dropquery="DROP TABLE IF EXISTS "+TABLE_NAME;
        db.execSQL(Dropquery);
        onCreate(db);
    }
}
