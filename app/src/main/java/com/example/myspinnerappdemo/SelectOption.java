package com.example.myspinnerappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;

public class SelectOption extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner firstSelect;
    String subjectItems [] = {"English","Maths","Science","Art","ICT","History","Geography","R.E","Design Technology","Music","PSHE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_option);
        firstSelect = findViewById(R.id.spinnerOne);
        firstSelect.setOnItemSelectedListener(this);
        ArrayAdapter subjects = new ArrayAdapter(this, android.R.layout.simple_spinner_item,subjectItems);
        subjects.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        firstSelect.setAdapter(subjects);

    }
     public void ReturnHome(View view) {
        Intent returnIntent = new Intent(this,MainActivity.class);
        startActivity(returnIntent);
     }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}