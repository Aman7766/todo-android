package com.example.todo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemClickListener {
ArrayList<ItemView> itemViews;
ListView lv;
FloatingActionButton fab;
MyAdapter adapter;
DBHandler dbHandler;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);
        fab=findViewById(R.id.fab);
        dbHandler=new DBHandler(MainActivity.this);  //1
        itemViews=new ArrayList<>();  //2
        itemViews=dbHandler.reaData();
        adapter=new MyAdapter(MainActivity.this,R.layout.item_view,itemViews);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);

         fab.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
               Intent intent=new Intent(MainActivity.this,TaskAdd.class);
               startActivity(intent);

               adapter.notifyDataSetChanged();


//                 Window window = taskAdd.getWindow();
//                 window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);
             }
         });



    }

    @Override
    protected void onRestart() {
        super.onRestart();
        finish();
        startActivity(getIntent());
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        System.out.println("Hello");
    Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
    }
}
