package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<ViewHolder> {

    ArrayList<String> names = new ArrayList<>();
    ArrayList<Integer> ages = new ArrayList<Integer>();
    Context context;

    public MyAdapter(Context context, ArrayList<String> names, ArrayList<Integer> ages) {
        this.context = context;
        this.names = names;
        this.ages = ages;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.rowlayout, parent, false);
        ViewHolder myViewHolder = new ViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.nameText.setText(names.get(position));
        holder.ageText.setText(String.valueOf(ages.get(position)));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, names.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return names.size();
    }
}
