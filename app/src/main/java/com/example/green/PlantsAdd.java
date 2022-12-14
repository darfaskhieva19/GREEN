package com.example.green;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PlantsAdd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addplants);
    }

    public void onBack(View view) {
        Intent intent = new Intent(PlantsAdd.this,ActivityMenu.class);
        startActivity(intent);
    }
}