package com.example.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    TextView nameText, ageText;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        nameText = itemView.findViewById(R.id.textViewId1);
        ageText = itemView.findViewById(R.id.textViewId2);
    }
}
