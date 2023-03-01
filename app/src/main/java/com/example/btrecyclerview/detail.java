package com.example.btrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detail extends AppCompatActivity {

    ImageView img;
    TextView txTit, txWord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        img =(ImageView) findViewById(R.id.pic);
        txTit = (TextView) findViewById(R.id.title);
        txWord = (TextView) findViewById((R.id.word));

    }
}