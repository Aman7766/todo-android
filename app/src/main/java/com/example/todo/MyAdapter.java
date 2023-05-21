package com.example.todo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class MyAdapter extends ArrayAdapter<ItemView> {

     ArrayList<ItemView> arrayList=new ArrayList<>();
  MyAdapter(Context context, int layout, ArrayList<ItemView> data)
  {
      super(context,layout,data);
      arrayList=data;
  }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v=convertView;
        LayoutInflater inflater=LayoutInflater.from(getContext());
        v=inflater.inflate(R.layout.item_view,null);
        //CheckBox cb=v.findViewById(R.id.chbx);
        TextView tv=v.findViewById(R.id.txt);
        tv.setText(arrayList.get(position).getData());


        return v;
    }
}
