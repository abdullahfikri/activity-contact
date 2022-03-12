package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView area,state;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        area = findViewById(R.id.area);
        state = findViewById(R.id.state);
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("TEST", "TOST", "MAS"));
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, R.layout.list_item, R.id.tvItem, arrayList);
        area.setAdapter(adapter);
        state.setAdapter(adapter);

    }
}