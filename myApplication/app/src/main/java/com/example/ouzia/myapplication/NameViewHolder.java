package com.example.ouzia.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class NameViewHolder extends RecyclerView.ViewHolder {
    TextView textView;

    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.data_manager_cellule_list);
    }

    public void setContent(String name) {
        textView.setText(name);
    }
}
