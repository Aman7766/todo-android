package com.example.todo;

import android.content.Context;
import android.widget.ArrayAdapter;



import java.util.ArrayList;


public class MyAdapter extends ArrayAdapter<ItemView> {

  MyAdapter(Context context, int layout, ArrayList<ItemView> data)
  {
      super(context,layout,data);
  }
}
