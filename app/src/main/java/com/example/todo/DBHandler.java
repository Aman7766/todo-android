package com.example.todo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHandler extends SQLiteOpenHelper {
    public final String TABLE_NAME = "tasks";
    public final String COL_1 = "id";
    public final String COL_2 = "data";


    public DBHandler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE" + TABLE_NAME + "("
                + COL_1 + "INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COL_2 + "TEXT)";
        db.execSQL(query);


    }


    public void onUpgrade(SQLiteDatabase db,int oldVersion, int newVersion)
    {
        String Dropquery="DROP TABLE IF EXISTS "+TABLE_NAME;
        onCreate(db);
    }
}
