package com.example.code.bezvezniprojekat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class TabelaZaUnosActivity extends AppCompatActivity {
    ImageView prviImageView;
    ImageView drugiImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabela_za_unos);
        prviImageView = findViewById(R.id.prvi_image_view);
        drugiImageView = findViewById(R.id.drugi_image_view);
    }
}
