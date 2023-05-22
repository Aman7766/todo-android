package com.example.todo;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<ItemView> itemViews=new ArrayList<>();
    public final String DB_Name = "TodoDb";
    public final int DB_VERSION = 1;
ListView lv;
DBHandler dbHandler;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);
        dbHandler=new DBHandler(getApplicationContext(),DB_Name,null,DB_VERSION);

        itemViews.add(new ItemView(true,"Helkjdisdsoodisdsoihcisohc"));
        itemViews.add(new ItemView(true,"Hello2"));
        itemViews.add(new ItemView(true,"Hello3"));
        itemViews.add(new ItemView(true,"Hello4"));
        itemViews.add(new ItemView(true,"Hello5"));
        itemViews.add(new ItemView(true,"Hello6"));

         MyAdapter myAdapter=new MyAdapter(this,R.layout.item_view,itemViews);
         lv.setAdapter(myAdapter);



    }
}
