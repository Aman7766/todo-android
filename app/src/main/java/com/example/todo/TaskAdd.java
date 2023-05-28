package com.example.todo;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class TaskAdd extends AppCompatActivity implements View.OnClickListener{


    Button save;
    EditText txt;
    DBHandler dbHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_task);
        txt=findViewById(R.id.tasktxt);
        save=findViewById(R.id.button_save);
        save.setOnClickListener(this);
        dbHandler=new DBHandler(TaskAdd.this);
    }


   public void onClick(View view)
   {
   String data=txt.getText().toString();
   if(!txt.getText().toString().equals(""))
   {
       dbHandler.addData(data);
       finish();




   }
   else {
       Toast.makeText(getApplicationContext(),"Enter Data",Toast.LENGTH_SHORT).show();
   }



   }
}
