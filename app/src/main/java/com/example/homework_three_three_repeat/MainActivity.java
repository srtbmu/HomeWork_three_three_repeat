package com.example.homework_three_three_repeat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.homework_three_three_repeat.adapter.ContactAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrayListNames = new ArrayList<>();
    ContactAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NamesArrayList();
        sunString();
    }

    private void sunString(){
        for (String names : arrayListNames){
            names = names.substring(20);
            System.out.println("age:" + names);
        }
    }

    private void NamesArrayList() {
        arrayListNames.add("Bekaka, Bekzadovva, 01");
        arrayListNames.add("Katyak, Qestyanova, 99");
        arrayListNames.add("Uuzune, UzUuzunvih, 33");
        arrayListNames.add("Bembbe, Beeeemavih, 08");
        arrayListNames.add("KtoTot, Ktotovihra, 02");
        arrayListNames.add("Myrzab, Katyanovih, 99");
        arrayListNames.add("Umurza, Bekzatosmo, 11");
        arrayListNames.add("Lalala, lalalalala, 20");
        arrayListNames.add("ralatr, ltlalaltra, 22");
        arrayListNames.add("hahaha, hahahahaha, 10");
        setAdapter();
    }

    private void setAdapter() {
        adapter = new ContactAdapter(arrayListNames);
        findView();
        recyclerView.setAdapter(adapter);
    }

    private void findView() {
        recyclerView = findViewById(R.id.recyclerView);
    }
}