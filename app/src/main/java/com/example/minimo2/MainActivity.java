package com.example.minimo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void insignias (View view)
    {
        Intent intent = new Intent(this, InsigniasActivity.class);
        startActivity(intent);
    }

    public void perfil (View view)
    {
        Intent intent = new Intent(this, PerfilActivity.class);
        startActivity(intent);
    }

}