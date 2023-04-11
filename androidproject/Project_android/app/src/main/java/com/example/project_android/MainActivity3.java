package com.example.project_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        String name= intent.getStringExtra("NAME");
        String tot= intent.getStringExtra("TOTAL");
        String avg= intent.getStringExtra("AVG");
        String grade= intent.getStringExtra("GRADE");

        TextView textView =(TextView)findViewById(R.id.textView3);

        textView.setText("NAME: " +name+"\nTOTAL: "+tot+"\nAVG: "+avg+"\nGRADE: "+grade);
    }
}