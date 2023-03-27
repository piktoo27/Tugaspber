package com.example.tugas2;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyView>{

    Context context;
    List<tambahan> items;

    public MyAdapter(Context context, List<tambahan> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyView(LayoutInflater.from(context).inflate(R.layout.tambahan_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyView holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.instagramView.setText(items.get(position).getInstagram());
        holder.pesanView.setText(items.get(position).getPesan());
        holder.imageView.setImageResource(items.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
