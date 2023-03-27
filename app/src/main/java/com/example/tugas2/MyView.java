package com.example.tugas2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyView extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView nameView, instagramView, pesanView;

    public MyView(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview);
        nameView = itemView.findViewById(R.id.name);
        instagramView = itemView.findViewById(R.id.instagram);
        pesanView = itemView.findViewById(R.id.pesan);

    }
}
