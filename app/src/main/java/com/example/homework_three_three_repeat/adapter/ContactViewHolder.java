package com.example.homework_three_three_repeat.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework_three_three_repeat.R;

public class ContactViewHolder extends RecyclerView.ViewHolder {

    TextView TextViewName;
    ImageView Icon;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(String name){
    findView();
    TextViewName.setText(name);
    }

    private void findView(){
        TextViewName = itemView.findViewById(R.id.TextViewName);
        Icon = itemView.findViewById(R.id.imageViewIcon);
    }
}
