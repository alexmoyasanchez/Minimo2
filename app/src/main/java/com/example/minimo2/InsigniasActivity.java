package com.example.minimo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class InsigniasActivity extends AppCompatActivity {

    TextView name;
    ImageView avatar;
    RecyclerView recyclerView;
    ProgressBar progressBar;
    MyAdapter myAdapter;

    public static Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insignias);
        recyclerView=findViewById(R.id.recyclerView);
    }


}