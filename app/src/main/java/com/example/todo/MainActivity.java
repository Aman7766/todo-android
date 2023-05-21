package com.example.todo;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<ItemView> itemViews=new ArrayList<>();
ListView lv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);
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
