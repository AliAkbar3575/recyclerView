package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<ViewHolder> {

    ArrayList<String> names = new ArrayList<>();
    ArrayList<Integer> ages = new ArrayList<>();
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
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.nameText.setText(names.get(position));
        holder.ageText.setText(ages.get(position));

    }

    @Override
    public int getItemCount() {
        return names.size();
    }
}
