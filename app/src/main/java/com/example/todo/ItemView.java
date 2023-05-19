package com.example.todo;

public class ItemView {


    boolean isChecked;
    String data;
    ItemView(boolean isChecked, String data)
    {
    this.isChecked=isChecked;
    this.data=data;
    }
    public boolean isChecked() {
        return isChecked;
    }

    public String getData() {
        return data;
    }
}
