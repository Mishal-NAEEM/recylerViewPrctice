package com.example.recyclerlistview_prac;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);

        ArrayList<ModelClass> list=new ArrayList<>();
        list.add(new ModelClass("name1",R.drawable.photoquotes1));
        list.add(new ModelClass("name2",R.drawable.photoquotes1));
        list.add(new ModelClass("name3",R.drawable.photoquotes1));
        list.add(new ModelClass("name4",R.drawable.photoquotes1));
        list.add(new ModelClass("name5",R.drawable.photoquotes1));
        list.add(new ModelClass("name6",R.drawable.photoquotes1));

        CustomAdapter adapter=new CustomAdapter(list,this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}