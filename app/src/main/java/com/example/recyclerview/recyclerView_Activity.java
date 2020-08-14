package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class recyclerView_Activity extends AppCompatActivity {

    ArrayList<String> names = new ArrayList<>();
    ArrayList<Integer> ages = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerView_Activity);

        Bundle bundle = new Bundle();
        bundle = getIntent().getExtras();

        names = bundle.getStringArrayList("key1");
        ages = bundle.getIntegerArrayList("key2");


        RecyclerView recyclerView = findViewById(R.id.recyclerViewId);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter adapter = new MyAdapter(this, names, ages);
        recyclerView.setAdapter(adapter);

    }
}
