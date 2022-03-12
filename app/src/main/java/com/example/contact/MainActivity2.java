package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity2 extends AppCompatActivity {
    private AutoCompleteTextView area,state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        area = findViewById(R.id.area);
        state = findViewById(R.id.state);
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("TEST", "TOST", "MAS"));
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity2.this, R.layout.list_item, R.id.tvItem, arrayList);
        area.setAdapter(adapter);
        state.setAdapter(adapter);
    }
}