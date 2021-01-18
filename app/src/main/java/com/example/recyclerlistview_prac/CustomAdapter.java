package com.example.recyclerlistview_prac;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.viewHolder> {

    public CustomAdapter(ArrayList<ModelClass> list,Context context) {
        this.list = list;
        this.context = context;
    }

    ArrayList<ModelClass> list;
    Context context;

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recipie,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        ModelClass modelClass=list.get(position);
        holder.pic.setImageResource(modelClass.getPic());
        holder.textView.setText(modelClass.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView pic;
        TextView textView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            pic=itemView.findViewById(R.id.image);
           textView=itemView.findViewById(R.id.Textview);
        }
    }
}
