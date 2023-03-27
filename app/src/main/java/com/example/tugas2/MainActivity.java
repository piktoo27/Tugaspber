package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<tambahan> items = new ArrayList<tambahan>();
        items.add(new tambahan("Bg Dodo", "@cristiano","Hal turid aliandinam AL-Nassr?" , R.drawable.bgdodo));
        items.add(new tambahan("Han So Hee✝","@xeesoxee","좋은 아침 톰", R.drawable.hansohe));
        items.add(new tambahan("Ankara Messi","@leomessi","quieres jugar conmigo en el psg?", R.drawable.ankara));
        items.add(new tambahan("Bro Rashy","@marcusrashford","eth wants you to join manchester united soon bro", R.drawable.brorashy));
        items.add(new tambahan("EPOS", "@evosesport","WOIIII POKEEEEE",R.drawable.epos));
        items.add(new tambahan("Hosi Lokal", "@hosirajalokal", "KAMI MAU M-SERIES BANGGG", R.drawable.lokal));
        items.add(new tambahan("Go Youn Jung", "@goyounjung", "\uD83D\uDEABThis message was deleted", R.drawable.goyoon));
        items.add(new tambahan("Vonzy" , "@vonnyfelicia", "\uD83D\uDEABThis message was deleted", R.drawable.vonzy));
        items.add(new tambahan("Mbapiz" , "@kingclover", "Tutor brody cut mid banh", R.drawable.cloper));
        items.add(new tambahan("Megachan" , "@megachan666", "Megachan sedang mengetik...", R.drawable.megachan));
        items.add(new tambahan("Kang Elon" , "@muskgtg87", "Sedia pinjol,minat ketik 1", R.drawable.em));
        items.add(new tambahan("Jukenburk" , "@markjukbur", "Mau kaya?kerja dekk", R.drawable.jukenbur));



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}