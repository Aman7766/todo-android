package com.example.todo;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;


public class TaskAdd extends Dialog implements View.OnClickListener{
    Button save;
    EditText txt;
    DBHandler dbHandler;
    public TaskAdd(Context context) {
        super(context);
        dbHandler=new DBHandler(getContext().getApplicationContext());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_task);
        txt=findViewById(R.id.tasktxt);
        save=findViewById(R.id.button_save);
        save.setOnClickListener(this);
    }


   public void onClick(View view)
   {
   String data=txt.getText().toString();
   Toast.makeText(getContext().getApplicationContext(),"HEllo",Toast.LENGTH_SHORT).show();


   }
}
