package com.example.todo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

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
//        SQLiteDatabase db = this.getWritableDatabase();
    }

    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME + "("
                + COL_1 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COL_2 + " TEXT)";
        db.execSQL(query);


    }
    public void addData(String data)
    {
        // on below line we are creating a variable for
        // our sqlite database and calling writable method
        // as we are writing data in our database.
        SQLiteDatabase db = this.getWritableDatabase();
        // on below line we are creating a
        // variable for content values.
       // ContentValues objects are used to insert new rows into database tables
         ContentValues contentValues=new ContentValues();
        //on below line we are passing all values
        // along with its key and value pair.
         contentValues.put(COL_2,data);
        // after adding all values we are passing
        // content values to our table.
         db.insert(TABLE_NAME,null,contentValues);
        // at last we are closing our
        // database after adding database.
         db.close();
    }


    public void onUpgrade(SQLiteDatabase db,int oldVersion, int newVersion)
    {
        String Dropquery="DROP TABLE IF EXISTS "+TABLE_NAME;
        db.execSQL(Dropquery);
        onCreate(db);
    }

    public ArrayList<ItemView> reaData()
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery("SELECT * FROM "+TABLE_NAME,null);
        ArrayList<ItemView> al=new ArrayList<>();
        if(cursor.moveToFirst())
        {
            do{
                al.add(new ItemView(cursor.getString(1)));
            }
            while(cursor.moveToNext());
        }
        cursor.close();
        return al;

    }

}
