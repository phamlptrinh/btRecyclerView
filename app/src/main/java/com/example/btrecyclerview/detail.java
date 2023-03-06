package com.example.btrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class detail extends AppCompatActivity {

    ImageView img;
    TextView txTit, txWord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        img =(ImageView) findViewById(R.id.pic1);
        txTit = (TextView) findViewById(R.id.title1);
        txWord = (TextView) findViewById((R.id.word1));
        Intent intent = getIntent();
        /*int item = -1;
        item = intent.getIntExtra("item",-1);*/
        String [] item = intent.getStringArrayExtra("item");
        //ArrayList<String> item = intent.getStringArrayListExtra("item");
        if(item.length !=0)
        {
            Context context = getApplicationContext();
            img.setImageResource(context
                    .getResources()
                    .getIdentifier(item[0], "drawable", context.getPackageName()));
            txTit.setText(item[1]);
            txWord.setText(item[2]);
            /*txWord.setText(context
                    .getResources()
                    .getIdentifier(item[0], "drawable", context.getPackageName()));*/
        }

        //txWord.setText(String.valueOf(item));

    }
}
